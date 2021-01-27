import java.io.*;
import java.util.*;

public class Baekjoon_10250 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int testcases = Integer.parseInt(st.nextToken());

        for (int i = 0; i < testcases; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
            int H = Integer.parseInt(st2.nextToken());
            int W = Integer.parseInt(st2.nextToken());
            int N = Integer.parseInt(st2.nextToken());

            Hotel hotel = new Hotel(H, W);
            System.out.println(hotel.getRoom(N));
        }

        br.close();
    }
}

class Hotel {
    private final int height;
    private final int width;

    Hotel(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getRoom(int number) {
        if (number % height == 0) {
            return height * 100 + (number / height);
        } else {
            return (number % height) * 100 + (number / height) + 1;
        }
    }
}