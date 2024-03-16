package ryanlabs;

public class mahrozot2 {
	public static int strings(String string1, char Char1)
	
	public static String findCommonCharacters(String s1, String s2) {
        StringBuilder result = new StringBuilder();

        for (char c : s1.toCharArray()) {
            if (s2.contains(String.valueOf(c))) {
                result.append(c);
            }
        }

        return result.toString();
    }
	
	
	
    public static String findUnionString(String s1, String s2) {
        StringBuilder result = new StringBuilder();

        for (char c : (s1 + s2).toCharArray()) {
            if (result.indexOf(String.valueOf(c)) == -1) {
                result.append(c);
            }
        }

        return result.toString();
        
        
        
        public static String findMissingLetters(String input) {
            StringBuilder result = new StringBuilder();


            for (char letter = 'a'; letter <= 'z'; letter++) {

                if (input.toLowerCase().indexOf(letter) == -1) {
                    result.append(letter);
                }
            }

            return result.toString();

            
            
            public static String[] getSomeWords(String sentence, int numberOfWords) {
                String[] words = sentence.split("\\s+");

               
                int selectedWordsCount = Math.min(numberOfWords, words.length);

                String[] selectedWords = new String[selectedWordsCount];
                System.arraycopy(words, 0, selectedWords, 0, selectedWordsCount);

                return selectedWords;
                

                public static void printLongestString(String[] strings) {
                    if (strings == null || strings.length == 0) {
                        System.out.println("The array is empty.");
                        return;
                    }

                    String longestString = strings[0];

                    for (String str : strings) {
                        if (str.length() > longestString.length()) {
                            longestString = str;
                        }
                    }

                    System.out.println("The longest string is: " + longestString);
                    
                    
                    
                    
                    
                    public static int findLongestSequenceLength(String input) {
                        if (input == null || input.isEmpty()) {
                            return 0;
                        }

                        int maxSequenceLength = 1;
                        int currentSequenceLength = 1;

                        for (int i = 1; i < input.length(); i++) {
                            if (input.charAt(i) == input.charAt(i - 1)) {
                                currentSequenceLength++;
                                maxSequenceLength = Math.max(maxSequenceLength, currentSequenceLength);
                            } else {
                                currentSequenceLength = 1;
                            }
                        }

                        return maxSequenceLength;
                        
                        
                        
                        public static String reverseString(String input) {
                            if (input == null || input.isEmpty()) {
                                return input;
                            }

                            StringBuilder reversed = new StringBuilder(input).reverse();
                            return reversed.toString();
                        
                            
                            
                            
                            public static boolean areAllCharactersDifferent(String input) {
                                if (input == null || input.isEmpty()) {
                                    return true;  
                                }

                                for (int i = 0; i < input.length(); i++) {
                                    for (int j = i + 1; j < input.length(); j++) {
                                        if (input.charAt(i) == input.charAt(j)) {
                                            return false;  
                                        }
                                    }
                                }

                                return true;  
                                
                                
                                
                                public static boolean isPalindromeComparingCharacters(String input) {
                                    if (input == null || input.isEmpty()) {
                                        return false; 
                                    }

                                    int left = 0;
                                    int right = input.length() - 1;

                                    while (left < right) {
                                        if (input.charAt(left) != input.charAt(right)) {
                                            return false;
                                        }
                                        left++;
                                        right--;
                                    }

                                    return true;
                                    
                                    
                                    
                                    public static void printContiguousSequencePairs(String input) {
                                        for (int i = 0; i < input.length() - 2; i++) {
                                            String sequence = input.substring(i, i + 3);

                                            if (sequence.equals("abc")) {
                                                String pair = (i > 0 ? input.charAt(i - 1) : "") + sequence + (i + 3 < input.length() ? input.charAt(i + 3) : "");
                                                System.out.println("Pair: " + pair);
                                    
                                    
                                    
}


