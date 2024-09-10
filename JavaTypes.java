class JavaTypes {

    public static void main(String[] args){
        
        int foo = 2;                        // Declaring and initializating variables
        int bar;                            // Declaring a variable
        bar = 5;                            // Initializing variables
  
        System.out.println(foo);            // Directly print the values
        System.out.println(bar);
        
        System.out.println("The value of foo is " + foo); // Formatting is slightly easier in Java than Python

        /*
         * PRIMITIVE DATA TYPES IN JAVA
         */

        // Integer types
        short shortVar = 10;                // 16-bit signed integer
        int regularIntVar = 12;             // 32-bit signed integer
        long veryLongIntVar = 20;           // 64- bit signed integer

        // Floating-Point types
        float someVar = 10.35f;
        double aDifferentVar = 10.35;
        double scientificVar = 1035e-2;     // You can also use scientific notation to declare the same variable as before

        // String types
        char charVariable = 'a';            // You use single quotes to assign characters
        char anotherCharVariable = 65;      // You can also use ASCII value as a character
        System.out.println("The value of the variable anotherCharVariable is: " + anotherCharVariable); 


        String aStringVar = "A message";    // Notice the uppercase 'S' in "String" versus lowercase letters in other types
                                            // This shows that String is *NOT* a primitive Java type.

        // Boolean types
        boolean myTrueValue = true;
        boolean myNotTrueValue = false;


        /**
         * CASTING
         */
        
        float floatBar = bar;               // Widening casting
        int someVarInInt = (int) someVar;   // Narrowing casting

        long someLongVar = someVarInInt;

        // EXERCISE: Try to cast one numerical type to another. See if you need to use widening or narrowing casting

        /*
         * SIMPLE OPERATIONS IN JAVA
         */

        // You can do simple arithmetic operations in Java, like Python

        int barFoo = bar + foo;
        int fooBar = bar * foo;
        int barByFoo = bar / foo;
        int modOp = bar % foo;

        int incrementOperation = barByFoo++;    // This increases the value by 1!
        int decrementOperation = modOp--;       // This decreases the value by 1
        barByFoo = barByFoo + 1;

        int incrementShortHand = 0;
        incrementShortHand = incrementShortHand + modOp;
        incrementShortHand += modOp;            // Short hand of assignment and addition operation, similar to Python

        // We also have the boolean operators in Java

        double someVal = 1.23;
        double someAnotherAnotherVal = 1.23;
        int completelyDifferentVal = 1;

        boolean equalOperator = someVal == someAnotherAnotherVal;               // True
        boolean notEqualOperator = someVal != someAnotherAnotherVal;            // False
        boolean greaterThan = someVal > completelyDifferentVal;                 // True. Note that the int is casted first to be used in the boolean expression
        boolean lessThan = someAnotherAnotherVal < completelyDifferentVal;      // False
        boolean greaterThanEqualTo = someAnotherAnotherVal >= someVal;          // True
        boolean lessThanEqualTo = completelyDifferentVal <= someVal;            // True


        // Lastly the logical operators!

        boolean andOperation = true && false;      // False
        boolean orOperation = false || false;      // False
        boolean notOperation = !true;              // False
        
    }
    
}