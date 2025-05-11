package multithreading;



public class multithreading {
    public static void main(String[] args){
        //MyRunnable myRunnable = new MyRunnable();
        Thread thread1 = new Thread(new MyRunnable("PING"));
        Thread thread2 = new Thread(new MyRunnable("PONG"));

        System.out.println("Game Start!");

        thread1.start();
        thread2.start();
        try{
            thread1.join();
            thread2.join();
        }
        catch(InterruptedException e){
            System.out.println("Main thread was interrupted");
        }
        System.out.println("Game Over!");
    }
}
