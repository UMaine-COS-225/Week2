import java.util.ArrayList;

class Listing {

    public static void main(String[] args) {
        ArrayList<String> food = new ArrayList<String>(); // Similar to lists from Python. The only difference is the
                                                          // type

        food.add("pizza"); // Add items, similar to `append` method in Python's list
        food.add("burger");
        food.add("pepsi");

        for (int i = 0; i < food.size(); i++) { // `size` method provides the number of elements in the ArrayList
            System.out.println(food.get(i)); // `get` method allows us to index ArrayList
        } // Python version: `some_list[i]`; Java version: `someList.get(i)`
        System.out.println("***");

        food.add(1, "noodles"); // Using the same method to add items at specific index
                                // Python version: `some_list.insert(i, "noodles")`

        for (int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i));
        }

        // food.add(5); // We cannot do this because `food` only stores String items

        food.set(1, "tacos"); // Replace "pizza" with tacos

        int locationOfPizza = food.indexOf("pizza"); // Find the location of "pizza"
                                                     // EXERCISE: What happens if the item is not in the list?

        System.out.println("Pepsi is at location " + locationOfPizza);

        // ArrayList<int> favoriteNumbers = new ArrayList<int>(); // Why is this not
        // working?

        int[] favNumbers = new int[5];
        favNumbers[0] = 1;
        favNumbers[1] = 2;
        favNumbers[2] = 3;
        favNumbers[3] = 4;
        favNumbers[4] = 5;

        int[] primeNumbers = { 2, 3, 5, 7, 9, 11, 13 };

        for (int eachNum : primeNumbers) {
            System.out.println("PrimeNumber: " + eachNum);
        }

        // EXERCISE: Find out ways to insert items at specific indices, get items, and
        // other array operations

    }
}