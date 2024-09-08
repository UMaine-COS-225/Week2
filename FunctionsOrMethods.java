class FunctionsOrMethods {

    public static void main(String[] args) {
        
        printMessage("hello world");

        printMessage("The value of 1 and 4 is " + sumOfTwoNums(1, 4));
    }

    public static void printMessage(String message){
        System.out.println(message);
    }

    /**
     * This function returns the sum of two numbers                                 // This multi-line comment is known as JavaDoc and
     * @param numOne The first integer                                              // it describes the parameters of the function as well as
     * @param numTwo The second integer
     * @return The sum of `numOne` and `numTwo`                                     // what it is returning
     */
    public static int sumOfTwoNums(int numOne, int numTwo){                         // Note that we define types of the input parameters as well
        return numOne + numTwo;
    }


    // EXERCISE: Write the Javadoc of the `printMessage` function.
    // EXERCISE: Write functions to do basic arithmetic operations on two operands



}