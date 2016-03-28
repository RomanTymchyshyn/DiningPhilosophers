public class Fork {
    private static int I = 0;
    private int id = ++I;
    private boolean inUse;

    public Fork(){
        inUse = false;
    }
    
    private void printAction(String action)
    {
    	System.out.println(Thread.currentThread().getName() + " " + action + " fork " + id);
    }

    public synchronized void get(){
        while (inUse) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
//        printAction("get");
        inUse = true;
        notify();
    }

    public synchronized void put(){
        while (!inUse) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
//        printAction("put");
        inUse = false;
        notify();
    }
}
