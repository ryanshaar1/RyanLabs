package ryanlabs;

import java.util.*;

public class Maarahot5ex2{
    public static int[][] getShowsTickets() {
        Scanner scanner = new Scanner(System.in);
        int[][] ticketData = new int[15][2]; 
        int index = 0;

        while (true) {
            System.out.print("Enter show number (1-15, 0 to finish): ");
            int showNumber = scanner.nextInt();

            if (showNumber == 0) {
                break;
            }

            if (1 <= showNumber && showNumber <= 15) {
                System.out.print("Enter number of tickets: ");
                int numTickets = scanner.nextInt();

                ticketData[index][0] = showNumber;
                ticketData[index][1] = ticketData[index][1] + numTickets;
                index++;
            } else {
                System.out.println("Invalid show number. Please enter a number between 1 and 15.");
            }
        }

        return Arrays.copyOf(ticketData, index);
    }

    public static int[] getMostTickets(int[][] ticketData) {
        int maxTickets = 0;
        int countMaxTickets = 0;

        for (int i = 0; i < ticketData.length && ticketData[i][0] != 0; i++) {
            maxTickets = Math.max(maxTickets, ticketData[i][1]);
        }

        for (int i = 0; i < ticketData.length && ticketData[i][0] != 0; i++) {
            if (ticketData[i][1] == maxTickets) {
                countMaxTickets++;
            }
        }

        int[] showsWithMaxTickets = new int[countMaxTickets];
        int index = 0;

        for (int i = 0; i < ticketData.length && ticketData[i][0] != 0; i++) {
            if (ticketData[i][1] == maxTickets) {
                showsWithMaxTickets[index++] = ticketData[i][0];
            }
        }

        Arrays.sort(showsWithMaxTickets);
        return showsWithMaxTickets;
    }


    public static void printMostTickets(int[] showsWithMaxTickets, int maxTickets) {
        System.out.print("Shows with the most tickets (" + maxTickets + " tickets each): ");
        for (int showNumber : showsWithMaxTickets) {
            System.out.print(showNumber + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Step A
        int[][] ticketData = getShowsTickets();

        int[] showsWithMaxTickets = getMostTickets(ticketData);


        int maxTickets = ticketData.length > 0 ? ticketData[0][1] : 0;
        printMostTickets(showsWithMaxTickets, maxTickets);
    }
}