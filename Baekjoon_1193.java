import java.io.*;
import java.util.StringTokenizer;

class Baekjoon_1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int input = Integer.parseInt(st.nextToken());
        br.close();

        int group = 1; // n번째 군
        int num = 1;   // 군에서 n번째
        while (input > num) {
            group++;
            num += group;
        }

        num = input - (num - group);

        if (group % 2 == 0) {
            System.out.println(num + "/" + (group + 1 - num));
        } else {
            System.out.println((group + 1 - num) + "/" + num);
        }
    }
}
