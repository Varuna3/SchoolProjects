public class SleepyThread extends Thread{
    private int sleepInterval;

    public SleepyThread(int number, int sleepMax){
        super("Thread " + number);
        sleepInterval = (int)(Math.random() * sleepMax);
    }

    public void run(){
        System.out.println(getName() + " is sleeping for " + sleepInterval + " milliseconds.");

        // The thread sleeps
        try{
            sleep(sleepInterval);
        }
        catch(InterruptedException e){
            System.out.println(e.toString());
        }

        // The thread wakes up
        System.out.println(getName() + " has woken up.");

    }
    
}
