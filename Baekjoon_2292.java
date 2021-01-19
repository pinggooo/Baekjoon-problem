import java.io.*;
import java.util.StringTokenizer;

class Baekjoon_2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int input = Integer.parseInt(st.nextToken());
        br.close();

        int cnt = 1;
        int num = 1;
        while (true) {
            if (input <= num) break;
            num += 6 * cnt;
            cnt++;
        }
        System.out.println(cnt);
    }
}