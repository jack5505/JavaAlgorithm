package dp.summerschool;

public class Learn {

    static boolean calculated[] = new boolean[1000001];

    static long fib [] = new long[1000001];
    static int cnt = 0;
    static long fibSimple(int n){
        cnt ++;
        if(n < 2)
            return 1;
        return fibSimple(n - 1) + fibSimple(n - 2);
    }
    static long fib(int n){
        if(n < 2)
            return 1;
        if(calculated[n])
            return fib[n];
        long result = fib(n - 1) + fib(n - 2);
        calculated[n] = true;
        fib[n] = result;
        return result;
    }

    public static void main(String[] args) {
        // 165580141
        //System.out.println(fibSimple(40));
        System.out.println(fib(60));
        //System.out.println(cnt);
    }
}
