package QuestionBank_24;

public class MyRunnable implements Runnable{
    @Override
    public void run(){
        System.out.println("Thread Running :" + Thread.currentThread().getName());
    }

    public static void main(String[]args){
        MyRunnable myrunnable = new MyRunnable();

        Thread t1 = new Thread(myrunnable,"Thread-1");
        Thread t2 = new Thread(myrunnable,"Thread-2");

        System.out.println("Thread t1 name :"+ t1.getName());
        System.out.println("Thread t2 name :"+ t2.getName());

        t1.start();
        t2.start();
    }
}
