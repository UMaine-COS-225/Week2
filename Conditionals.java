class Conditionals {
    
    public static void main(String[] args) {

        boolean isItRaining, notLateAtNight, haveARide;
        isItRaining = true;
        haveARide = false;
        notLateAtNight = true;

        if (!isItRaining) {                                                         // Simple if-statements
            System.out.println("Yes, I will go out");
        }

        
        if (!isItRaining) {                                                         // if-else statements
            System.out.println("Yes, I will go out");
        }
        else {
            System.out.println("No, I will not go out");
        }

        if (!isItRaining) {                                                         // if-else_if-else statements
            System.out.println("I will go out to a party");
        }
        else if (haveARide) {
            System.out.println("I have a ride, I will go to a party");
        }
        else {
            System.out.println("I will go to sleep");
        }

        if (!isItRaining || haveARide) {                                            // The boolean expression for the conditional can be as complex
            System.out.println("I will go out");
        }
        else if (notLateAtNight) {                                              
            System.out.println("Yes, I will go out");
        }
        else {
            System.out.println("I will take a nap");
        }

        // EXERCISE: Change the values of the declared variables to try to print each branch of the conditional

        /*
         * Switch Statements
         */

        int month = 12;

        if (month == 1){
            System.out.println("The month is January");                             // If-else_if-else statements can be cubersome sometimes
        }
        else if (month == 2){
            System.out.println("The month is February");
        }
        else if (month == 3){
            System.out.println("The month is February");
        }
        //...
        else {
            System.err.println("The month is December");
        }

        switch (month) {                                                            // switch statements make life easier
            case 1:
                System.out.println("The month is January");
                break;                                                              // `break` statements escapes the testing of each case
            case 2:                                                                 // In a scenario when you want to go through each case, then you can remove `break`
                System.out.println("The month is Feb");
                break;
            case 12:
                System.out.println("The month is March");
                break;
            default:                                                                // This is "else" part of the switch in the scenario where none of the cases matcheds
                System.out.println("There are only 12 months in a year not " + month + " months");
                break;
        }



        
    }
}