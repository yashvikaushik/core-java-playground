package threads;

public class MyRunnableDemo {
   
    public static void main(String[] args) {
        // Create a thread using the MyRunnable class
        MyRunnable runnable1 = new MyRunnable("Ram");
        MyRunnable runnable2 = new MyRunnable("Shayam");
        MyRunnable runnable3 = new MyRunnable("Geeta");
        MyRunnable runnable4 = new MyRunnable("Seeta");

        /*runnable1.run();
        runnable2.run();*/

        
Thread thread4=new Thread(runnable4);
        thread4.setName("ramesh");

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        Thread thread3 = new Thread(runnable3);
        //Thread thread4 = new Thread(runnable4);
        // Start the threads
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}

    
