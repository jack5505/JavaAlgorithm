package bit;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class LearnBit {
    static int p[] = new int[100];
    static int n;
    static void pos(int pos){
        if(pos == n){
            for(int i = 0 ; i < pos ;i ++){
                System.out.print(p[i]);
            }
            System.out.println();
            return;
        }
        p[pos] = 0;
        pos(pos + 1);
        p[pos] = 1;
        pos(pos + 1);
    }
    public static void main(String[] args) {
        n = 4;
        pos(0);
    }

}
