class Looping {

    public static void main(String[] args) {

        // Simple loops
        
        for(int i = 0; i < 5; i++) {                                    // i) Initialize a counter variable, ii) set condition, and iii) update counter variable
            System.out.println(i + ". Hello World");
        }

        int counter = 0;                                                // i)   Initializing a counter variable
        while(counter < 5) {                                            // ii)  Set condition
            System.out.println(counter + ". While Hello there!");
            counter++;                                                  // iii) Update counter
        }

        for(int i = 1; i < 20; i ++) {
            if (i % 2 == 0){
                continue;                                                  // `continue` allows us to skip the current iteration and go to the next one
            }
            else if (i % 7 == 0) {                                         // `break` allows you to break out of the loop
                break;
            }
            System.out.println(i);
        }

    }
    
}