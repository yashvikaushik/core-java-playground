package threads;

public class MyThread extends Thread {
    

    public MyThread(String name) {
        super(name); // Set the thread name
        System.out.println("Thread created: " + name);
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread " + Thread.currentThread().getName() + " is running: " + i);
            try {
                Thread.sleep(1000); // Sleep for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
    }

}

    

