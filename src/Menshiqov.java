import java.math.BigDecimal;
import java.util.Scanner;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class Menshiqov {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String a = cin.next();
        BigDecimal bigDecimal = new BigDecimal(a);
        String b = cin.next();
        BigDecimal bigDecimal1 = new BigDecimal(b);
        System.out.println(bigDecimal.add(bigDecimal1));

    }
}
