package div300;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.StringTokenizer;

public class Solve {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskB taskB = new TaskB();
        taskB.solve(in, out);
        out.close();
    }
}

class TaskB{

    void solve(InputReader in, PrintWriter out)
    {
        int n = in.nextInt();
        int len = lenght(n);
        out.println(len);
        out.println(maketen(len));
    }

    int lenght(int x){
        int len = 0;
        while (x > 0){
            x /= 10;
            len++;
        }
        return len;
    }

    int maketen(int len)
    {
        if(len == 1)
            return 1;
        int ten = 1;
        for(int i = 2 ; i <= len ; i++){
                ten *= 10;
        }
        return ten;
    }

}

class TaskA {
    void solve(InputReader in, PrintWriter out) {
        String s = in.next();
        int n = s.length();
        String searchText = "CODEFORCES";
        for (int i = 0; i < n; i++) {
            List<Integer> notUsedIndex = new ArrayList<>();
            for (int j = i; j < n; j++) {
                notUsedIndex.add(j);
                if (searchText.equals(makeNewStringCheck(notUsedIndex, s))) {
                    out.println("YES");
                    return;
                }
            }
        }
        out.println("NO");

    }

    private String makeNewStringCheck(List<Integer> notUsedIndex,
                                      String s) {
        StringBuilder newStr = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (!notUsedIndex.contains(i)) {
                newStr.append(s.charAt(i));
            }
        }
        return newStr.toString();
    }
}

class InputReader {
    public BufferedReader reader;
    public StringTokenizer tokenizer;

    public InputReader(InputStream stream) {
        reader = new BufferedReader(new InputStreamReader(stream), 32768);
        tokenizer = null;
    }

    public String next() {
        while (Objects.isNull(tokenizer) || !tokenizer.hasMoreTokens()) {
            try {
                tokenizer = new StringTokenizer(reader.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return tokenizer.nextToken();
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }
}
