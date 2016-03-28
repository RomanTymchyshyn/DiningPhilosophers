public class PhilosophyRunner {
    public static void main(String[] args) {
        Fork fork_1 = new Fork();
        Fork fork_2 = new Fork();
        Fork fork_3 = new Fork();
        Fork fork_4 = new Fork();
        Fork fork_5 = new Fork();
        Fork fork_6 = new Fork();
        Fork fork_7 = new Fork();
        Fork fork_8 = new Fork();

        /*new Thread(null, new Philosopher(fork_8, fork_1), "Philosopher-1").start();
        new Thread(null, new Philosopher(fork_2, fork_1), "Philosopher-2").start();
        new Thread(null, new Philosopher(fork_2, fork_3), "Philosopher-3").start();
        new Thread(null, new Philosopher(fork_4, fork_3), "Philosopher-4").start();
        new Thread(null, new Philosopher(fork_4, fork_5), "Philosopher-5").start();
        new Thread(null, new Philosopher(fork_6, fork_5), "Philosopher-6").start();
        new Thread(null, new Philosopher(fork_6, fork_7), "Philosopher-7").start();
        new Thread(null, new Philosopher(fork_8, fork_7), "Philosopher-8").start();*/
        
        new Thread(null, new Philosopher(fork_8, fork_1), "Philosopher-1").start();
        new Thread(null, new Philosopher(fork_1, fork_2), "Philosopher-2").start();
        new Thread(null, new Philosopher(fork_2, fork_3), "Philosopher-3").start();
        new Thread(null, new Philosopher(fork_3, fork_4), "Philosopher-4").start();
        new Thread(null, new Philosopher(fork_4, fork_5), "Philosopher-5").start();
        new Thread(null, new Philosopher(fork_5, fork_6), "Philosopher-6").start();
        new Thread(null, new Philosopher(fork_6, fork_7), "Philosopher-7").start();
        new Thread(null, new Philosopher(fork_7, fork_8), "Philosopher-8").start();

        System.out.println("Main thread finished!");
    }
}
