package generalExercise;

public  class MyThread extends Thread {


    public void run(){
        try{
        for(int i=1;i<=5;i++){
            System.out.println(Thread.currentThread().getName()+"  :  "+ i);
            Thread.sleep(1000);
        }
    }
        catch(InterruptedException e){
            System.out.println(e);
        }

        }
    
}

