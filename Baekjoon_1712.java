import java.io.*;
import java.util.StringTokenizer;

class Baekjoon_1712 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        br.close();

        int benefit = C - B;
        if (benefit <= 0) {
            System.out.println(-1);
        } else {
            System.out.println((int)((double)A / benefit) + 1);
        }
    }
}