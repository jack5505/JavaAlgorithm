package javamemorymodel;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class SeperateObjects {
    public static void main(String[] args) {
        //MyObject myObject = new MyObject();
        Runnable runnable1 = new MyRunnable();
        Runnable runnable2 = new MyRunnable();

        Thread thread1 = new Thread(runnable1,"Thread1");
        Thread thread2 = new Thread(runnable2,"Thread2");

        thread1.start();
        thread2.start();


    }
}
