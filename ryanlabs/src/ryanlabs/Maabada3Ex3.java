package ryanlabs;

public class Maabada3Ex3 {
    public static int sequenceTwice(int number) {
        if (number < 10 || number > 99) {
            throw new IllegalArgumentException("Input must be a two-digit natural number.");
        }
        
        int normal = number * 100 + number; 
        int upsideDown = (number % 10) * 10 + (number / 10); 

        return normal * 100 + upsideDown;
    }

    public static void main(String[] args) {
        for (int i = 20; i <= 40; i++) {
            int result = sequenceTwice(i);
            System.out.println("Result for " + i + " is: " + result);
        }
    }
}