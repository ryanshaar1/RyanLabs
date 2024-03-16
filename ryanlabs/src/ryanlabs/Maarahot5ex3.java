package ryanlabs;

import java.util.Scanner;

public class Maarahot5ex3 {

	public static Scanner reader= new Scanner(System.in);

		public static int[] getVotes(int numStudents) {
	        int[] votes = new int[15];
	        Scanner scanner = new Scanner(System.in);

	        for (int i = 0; i < numStudents; i++) {
	            System.out.print("Enter student's choice (serial number 0-14 followed by 0/1): ");
	            String[] input = scanner.nextLine().split(" ");
	            int candidateNumber = Integer.parseInt(input[0]);
	            int vote = Integer.parseInt(input[1]);
	            votes[candidateNumber] += vote;
	        }
	        return votes;
	    }
	    public static int getWinner(int[] votes) {
	        int maxVotes = 0;
	        int winner = 0;
	        for (int i = 0; i < votes.length; i++) {
	            if (votes[i] > maxVotes) {
	                maxVotes = votes[i];
	                winner = i;
	            }
	        }
	        return winner;
	    }
	    public static double getAverage(int[] votes) {
	        int sum = 0;

	        for (int vote : votes) {
	            sum += vote;
	        }
	        return (double) sum / votes.length;
	    }
	    public static void displayResults(int winner, int[] votes, double average) {
	        System.out.println("Winner: Candidate " + winner);

	        System.out.print("Candidates with fewer votes than average: ");
	        for (int i = 0; i < votes.length; i++) {
	            if (votes[i] < average) {
	                System.out.print(i + " ");
	            }
	        }
	    }
	    public static void main(String[] args) {
	        int numStudents = 600;
	        int[] votesArray = getVotes(numStudents);
	        int winnerCandidate = getWinner(votesArray);
	        double averageVotes = getAverage(votesArray);
	        displayResults(winnerCandidate, votesArray, averageVotes);
	    }
	

	}


