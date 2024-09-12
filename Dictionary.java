import java.util.HashMap;

class Dictionary {
    public static void main(String[] args) {
        HashMap<Character, Integer> charCount = new HashMap<Character, Integer>();
        HashMap<Character, Integer> charCount2 = new HashMap<Character, Integer>();

        String someString = "hello";

        for(int i = 0; i < someString.length(); i++) {
            char character = someString.charAt(i);                                      // Get the character at index i

            if (charCount.containsKey(character)){                                      // If the character is already exists in the HashMap
                Integer currentCount = charCount.get(character);                        // Get the count of character
                charCount.put(character, currentCount + 1);                             // `put` the value of that character to count + 1
            }
            else {
                charCount.put(character, 1);                                      // If character does not exist, put its value as 1
            }
        }
        
        System.out.println("charcount1");                                             
        for (Character charKey: charCount.keySet()) {                                   
            System.out.println("Character: " + charKey + ", Count: " + charCount.get(charKey)) ;
        }

        // Simple version of using dictionaries

        for (Character eachChar: someString.toCharArray()) {
            charCount2.put(eachChar, charCount2.getOrDefault(eachChar, 0) + 1);
        }

        System.out.println("charcount2");
        for (Character charKey: charCount2.keySet()) {
            System.out.println("Character: " + charKey + ", Count: " + charCount.get(charKey)) ;
        }


    }    
}