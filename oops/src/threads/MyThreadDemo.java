package threads;

public class MyThreadDemo {
    public static void main(String[] args) {
        // Create a thread using the MyThread class
        MyThread thread1 = new MyThread("Ram");
        MyThread thread2 = new MyThread("Shayam");
        MyThread thread3 = new MyThread("Geeta");
        MyThread thread4 = new MyThread("Seeta");

       thread1.setPriority(10);
        thread2.setPriority(4);
        thread3.setPriority(8);
        thread4.setPriority(1);

        // Start the threads
        System.out.println("Starting threads...");
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

         //MyThread thread3 = new MyThread("Geeta");
        //thread3.start();

        //MyThread thread4 = new MyThread("Seeta");
        //thread4.start();

        System.out.println("Threads have finished execution.");
    }
}

    
