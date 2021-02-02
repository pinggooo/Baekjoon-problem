import java.io.*;

public class Baekjoon_2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = Integer.parseInt(br.readLine());
        int bag = total / 5;

        if (total % 5 != 0) {
            while (bag != -1) {
                if ((total - (bag * 5)) % 3 == 0) {
                    System.out.println(bag + ((total - (bag * 5)) / 3));
                    return;
                }
                bag--;
            }
        }

        System.out.println(bag);
        br.close();
    }
}
