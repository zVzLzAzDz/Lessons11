// random

import java.util.Random;
import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        Scanner vlad = new Scanner(System.in);
        Random random = new Random();
        int count;

        do {
            System.out.println("Input count of throwing: ");
            count = vlad.nextInt();
        } while (count <= 0);

//        business logic
        int tails = 0;

        for (int i = 0; i < count; i++) {
            if (random.nextBoolean()) {
                tails++;
            }
        }
        String msg = String.format("Tails = %d, eagle = %d", tails, count - tails);
        System.out.println(msg);
    }
}

