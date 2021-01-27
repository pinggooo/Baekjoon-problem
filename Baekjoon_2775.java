import java.io.*;

public class Baekjoon_2775 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcases = Integer.parseInt(br.readLine());

        for (int i = 0; i < testcases; i++) {
            int floor = Integer.parseInt(br.readLine());
            int room = Integer.parseInt(br.readLine());

            Apartment apt = new Apartment(14, 14);
            System.out.println(apt.getNumber(floor, room));
        }

        br.close();
    }
}

class Apartment {
    private final int floors;
    private final int rooms;

    Apartment(int floors, int rooms) {
        this.floors = floors;
        this.rooms = rooms;
    }

    public int getNumber(int floor, int room) {
        int number = 0;

        if (floor == 0) {
            return room;
        }

        for (int i = 1; i <= room; i++) {
            number += getNumber(floor - 1, i);
        }

        return number;
    }
}