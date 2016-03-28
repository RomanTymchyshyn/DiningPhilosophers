import java.util.Random;

public class Philosopher implements Runnable {
    private int iterations = 5;
    private Fork fork1;
    private Fork fork2;
    private Random random = new Random();

    public Philosopher(Fork fork1, Fork fork2) {
        this.fork1 = fork1;
        this.fork2 = fork2;
        this.iterations = random.nextInt((100 - 50) + 1) + 50;//random number of iteration [50,100]
    }
    
    private String getPhilosopherName()
    {
    	return Thread.currentThread().getName();
    }

    @Override
    public void run() {
    	System.out.println(getPhilosopherName() + " has " + iterations + " iterations");
        for (int i = 0; i < iterations; i++) {
        	int whatToDo = random.nextInt() % 2;
        	if (whatToDo == 0){
        		eat();
        	} else {
        		speak();
        	}
        }
        System.out.println(getPhilosopherName() + " has FINISHED!");
    }

    private void eat() {
    	System.out.println(getPhilosopherName() + " is WAITING FOR FORKS!");
        fork1.get();
        fork2.get();
        System.out.println(getPhilosopherName() + " is EATING!");
        try {
            Thread.sleep(random.nextInt(1000) + 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
        	fork1.put();
            fork2.put();
        }
    }

    private void speak() {
        System.out.println(getPhilosopherName() + " is SPEAKING!");
        try {
            Thread.sleep(random.nextInt(1000) + 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
