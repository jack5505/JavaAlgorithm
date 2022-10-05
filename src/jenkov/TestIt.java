package jenkov;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class TestIt {
    static class Doniyor{
        public void  test(int a){
            System.out.println("with parameter " + a);
        }
        public void test(){
            System.out.println("without parameter");
        }

    }

    private static volatile  int  bir = 0;

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        for(int i = 0 ; i < 50 ; i ++){
            new Thread("" + i){
                @Override public void run() {
                    System.out.println("Thread: " + getName() +" " + " running");
                }
            }.start();
        }

    }


}
