package oca;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class Test {
    public static void main(String[] args) {
        try {
            others();
            System.out.println("never get here if runtimeException");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }finally {
            System.out.println("here we see at the end of try catch block whether it happens error or not");
        }
    }

    private static void others() {
        throw new RuntimeException("shu shu");
    }
}
