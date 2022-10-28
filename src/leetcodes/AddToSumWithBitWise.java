package leetcodes;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class AddToSumWithBitWise {
    public static void main(String[] args) {
        int a = 7;
        int b = 21;
        int c = 0;
        int d = 0;
        while (b != 0){
            b = ((a & b) << 1);
            a = a ^ b;
        }
        System.out.println(a);
    }
}
