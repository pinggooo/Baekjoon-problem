import java.io.*;
import java.util.*;

public class Baekjoon_1011 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCases; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            long location = Long.parseLong(st.nextToken());
            long target = Long.parseLong(st.nextToken());
            Rocket rocket = new Rocket(location, target);
            System.out.println(rocket.getOperateNum());
        }
    }
}

class Rocket {
    private long location;
    private long target;

    Rocket (long location, long target) {
        this.location = location;
        this.target = target;
    }

    public long getOperateNum() {
        long diff = target - location;

        for (long i = 1; ;i++) {
            if (diff >= i * (i - 1) && diff <= i * i) {
                return (2 * i - 1);
            } else if (diff > i * i && diff <= i * (i + 1)) {
                return (2 * i);
            }
        }
    }
}
