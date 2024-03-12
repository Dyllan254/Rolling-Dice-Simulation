import java.util.Random;

public class Dice {
    public static void main(String[] args) {
        // Initialize variables to store the frequency of each face
        int[] frequencies = new int[6];
        int totalRolls = 1000;

        // Simulate rolling the dice 1000 times
        Random random = new Random();
        for (int i = 0; i < totalRolls; i++) {
            // Generate a random number between 0 and 1
            double randomNumber = random.nextDouble();

            // Determine the face of the dice based on the random number
            int face;
            if (randomNumber < 1.0 / 6) {
                face = 1;
            } else if (randomNumber < 2.0 / 6) {
                face = 2;
            } else if (randomNumber < 3.0 / 6) {
                face = 3;
            } else if (randomNumber < 4.0 / 6) {
                face = 4;
            } else if (randomNumber < 5.0 / 6) {
                face = 5;
            } else {
                face = 6;
            }

            // Increment the frequency count for the corresponding face
            frequencies[face - 1]++;
        }

        // Display the table of outcomes
        System.out.println("Outcome\tFrequency\tPercentage");
        for (int i = 0; i < 6; i++) {
            int face = i + 1;
            int frequency = frequencies[i];
            double percentage = (double) frequency / totalRolls * 100;
            System.out.printf("%d\t\t%d\t\t%.2f%%\n", face, frequency, percentage);
        }
    }
}

