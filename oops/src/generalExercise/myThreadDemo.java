package generalExercise;

public class myThreadDemo {
    public static void main(String[] args) {
        MyThread t1=new MyThread();
        MyThread t2=new MyThread();
        MyThread t3=new MyThread();

        try{
            t3.start();
            t3.setName("third thread");
            t3.setPriority(1);//setPriority() does not guarantee sequential order
            t3.join();//join() method guarantees execution in a set order and throws InterruptedException
            System.out.println("----------------------");

            t2.start();
            t2.setName("second thread");
            t2.setPriority(5);
            t2.join();
            System.out.println("----------------------");

            t1.start();
            t1.setName("first thread");
            t1.setPriority(10);
            t1.join();
            System.out.println("----------------------");
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
    }
    
}
