package threads;


    public class MyRunnable implements Runnable {

    private String name;

    public MyRunnable(String name) {
        this.name = name; // Set the thread name
        System.out.println("MyRunnable created: " + name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread " + name + " is running: " + i);
            try {
                Thread.sleep(1000); // Sleep for 1000 milliseconds
            } catch (InterruptedException e) {
                System.out.println("MyRunnable interrupted: " + e.getMessage());
            }
        }
    }

}

    

