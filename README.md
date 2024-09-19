# WEEK 2

This week we look at the following concepts:

* Printing hello world
* Running a `.java` file
* Basic elements of a simple Java program
* Types - Primitives, Non-Primitive
* Conditionals
* Loops
* Functions
* Simple Data Structures - Lists and HashMaps

## How To Use This Repo?

To understand this repo, clone it and go through each file. Run the file as is and then make changes to the file. These changes could mimic the code in the file
or try something entirely new. For example when going through `JavaTypes.java`, create your own variables, try your own casting approaches, write your own operations. You can also try to create new files and repeat things learned in class. Sometimes there will be exercise prompts in the code file for you to try. Remember that making mistakes is an essential part of the learning process! Don't shy away from making them and then learn from them!


## `HelloWorld.java`

#### How to print

```java
System.out.println("Hello, World!");
```

#### How to run the file


We first compile the file using `javac`. If the compilation process runs smoothly, you will see `.class` file. 
Now, to run the compiled code we use the `java` command. Following is an example

```bash
javac HelloWorld.java     # Compile `HelloWorld.java` this will create a HelloWorld.class file
java HelloWorld           # Run the class file. 
```

**NOTE** - When we are running the `.class` file, we are not using `.class` in the name and we are only using `java` instead of `javac`

#### Syntax differences - curly braces, semicolon

In Python we use colon and indentation to describe the code block

```python
if something is in some_list:
    do(something)
else:
    do_else(something)
```

In Java, we have semi-colons after every statement. We also use curly braces to define a code block.

```java
if (someList.indexOf(something) >= 0){
    do(something);
} else {
    doElse(something);
}
``` 

#### Comment differences

There are some differences in how we write comments in Python/Java

```python
# This is a single line comment
"""
These are multi-line comment
I can write comments on multiple
lines
"""
```


```java
// Single-line comment

/**
 * These are multiple line comments
 * I can write comments on multiple
 * lines
 * /

```

#### Need a main function

To run `.java` files we need a `main` function which is the starting point of our code. We will look at the keywords for `public static` in upcoming classes.

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

#### Name of the class must be the same as the name of the `.java` file


```java
// Name of the file is HelloWorld.java
class HelloWorld {
```

## `JavaTypes.java`

This file goes over creating variables and data types in Java.

#### Types are necessary

Types are explicitly declared for variables in Java, unlike Python, where types are inferred. For example: 

```java
int foo = 2;                        // Declaring and initializing an integer variable
float someVar = 10.35f;             // Declaring and initializing a float variable
String aStringVar = "A message";    // Declaring and initializing a String variable
```

This explicit typing helps catch type-related errors at compile-time.

#### Variable name convention

Variable names in Java typically follow the camelCase convention. Variable names start with a lowercase letter, and subsequent words begin with an uppercase letter. This is evident from the variable names used in `JavaTypes.java`:

```java
int regularIntVar = 12;
long veryLongIntVar = 20;
float someVar = 10.35f;
double aDifferentVar = 10.35;
boolean myTrueValue = true;
```


#### Variables, types, declaring, and initialization

Creating a variable is a two-step process in Java - declaring the variable and then initializing it.

```java
int foo = 2;                        // Declaring and initializing variables
int bar;                            // Declaring a variable
bar = 5;                            // Initializing variables
```

#### Integer and Floating-point types

Python just has `int` and `float` as its integer and floating-point types. But Java has a variety

```java
// Integer types
short shortVar = 10;                // 16-bit signed integer
int regularIntVar = 12;             // 32-bit signed integer
long veryLongIntVar = 20;           // 64-bit signed integer

// Floating-Point types
float someVar = 10.35f;
double aDifferentVar = 10.35;
double scientificVar = 1035e-2;     // You can also use scientific notation
```

#### Character types and String

Python does not differentiate between a character or a sequence of characters aka string. However, in Java (and many other porgramming languages) these two are different types

```java
char charVariable = 'a';            // You use single quotes to assign characters
char anotherCharVariable = 65;      // You can also use ASCII value as a character

String aStringVar = "A message";    // Notice the uppercase 'S' in "String"
                                    // This shows that String is *NOT* a primitive Java type.
```

#### Casting and types of casting


There are two types of casting in Java - widening and narrowing. Widening casting is done automatically when going from a smaller to a larger type. Narrowing casting requires explicit type conversion and may result in loss of information.

```java
int bar = 5;
float floatBar = bar;               // Widening casting - automatic
int someVarInInt = (int) someVar;   // Narrowing casting - explicit
```

#### Operations

Java supports a variety of arithmetic, logical, and boolean operations. Following are some examples:


```java
// Arithmetic operations
int barFoo = bar + foo;
int fooBar = bar * foo;
int barByFoo = bar / foo;
int modOp = bar % foo;

// Increment and decrement operations
int incrementOperation = barByFoo++;    // This increases the value by 1!
int decrementOperation = modOp--;       // This decreases the value by 1

// Short-hand assignment
int incrementShortHand = 0;
incrementShortHand += modOp;            // Short hand of assignment and addition operation

// Boolean operations
boolean equalOperator = someVal == someAnotherAnotherVal;
boolean notEqualOperator = someVal != someAnotherAnotherVal;
boolean greaterThan = someVal > completelyDifferentVal;

// Logical operations
boolean andOperation = true && false;      // False
boolean orOperation = false || false;      // False
boolean notOperation = !true;              // False
```


## `Conditionals.java`

#### `if-else` statements

In Java, `if` and `if-else` statements allow you to execute code blocks conditionally based on boolean expressions. A simple `if` statement checks a condition and executes the block if the condition is true:

```java
if (!isItRaining) {
    System.out.println("Yes, I will go out");
}
```

In this example, if `isItRaining` is `false`, the message "Yes, I will go out" will be printed. The `!` operator negates the boolean value.

An `if-else` statement provides an alternative path when the condition is `false`:

```java
if (!isItRaining) {
    System.out.println("Yes, I will go out");
}
else {
    System.out.println("No, I will not go out");
}
```

Here, if isItRaining is `false`, it prints "Yes, I will go out"; otherwise, it prints "No, I will not go out".


#### `else-if` statements

The `else-if` ladder allows you to check multiple conditions in sequence. If the initial `if` condition is `false`, the program evaluates the else if condition, and so on:

```java
if (!isItRaining) {
    System.out.println("I will go out to a party");
}
else if (haveARide) {
    System.out.println("I have a ride, I will go to a party");
}
else {
    System.out.println("I will go to sleep");
}
```

In this snippet:

* If `isItRaining` is `false`, it prints "I will go out to a party".
* If `isItRaining` is `true` but `haveARide` is `true`, it prints "I have a ride, I will go to a party".
* If neither condition is met, it prints "I will go to sleep".

You can also use complex boolean expressions in your conditions:

```
if (!isItRaining || haveARide) {
    System.out.println("I will go out");
}
else if (notLateAtNight) {                                              
    System.out.println("Yes, I will go out");
}
else {
    System.out.println("I will take a nap");
}
```

#### `switch` statements

When you have multiple possible values for a single variable and want to execute different code blocks based on that value, `switch` statements are more efficient and readable than multiple `if-else-if` statements.

```java
int month = 12;

if (month == 1){
    System.out.println("The month is January");
}
else if (month == 2){
    System.out.println("The month is February");
}
else if (month == 3){
    System.out.println("The month is March");
}
//...
else {
    System.err.println("The month is December");
}
```

```java
switch (month) {
    case 1:
        System.out.println("The month is January");
        break;
    case 2:
        System.out.println("The month is February");
        break;
    case 3:
        System.out.println("The month is March");
        break;
    // Other cases...
    case 12:
        System.out.println("The month is December");
        break;
    default:
        System.out.println("There are only 12 months in a year, not " + month + " months");
        break;
}
```

In the above snippet

* The `switch` statement compares the variable `month` against each `case`.
* When a matching case is found, the corresponding code block executes.
* The `break` statement exits the `switch` block to prevent fall-through to subsequent cases.
* The `default` case executes if none of the cases match, similar to the `else` in an `if-else` chain.

**Note**: Removing the `break` statements allows execution to continue to the next case, which can be useful in specific scenarios.

## `FunctionsOrMethods.java`

#### Basic syntax

In Java, methods are defined with a specific syntax that includes return types, method names, and parameter lists with types. Here's an example from `FunctionsOrMethods.java`:

```java
public static void printMessage(String message){
    System.out.println(message);
}
```

* `void`: Return type indicating the method does not return any value.
* `printMessage`: The name of the method.
* `(String message)`: Parameter list with one parameter of type `String`.

```java
public static int sumOfTwoNums(int numOne, int numTwo){
    return numOne + numTwo;
}
```

Here, the method `sumOfTwoNums`:

* Returns an `int` value.
* Takes two parameters of type `int`.

In Python, defining functions is more straightforward since you don't need to specify access modifiers or return types:

```python
def print_message(message):
    print(message)
```

#### Parameter types

In Java, you must explicitly declare the type of each parameter in a method. This ensures that only the correct type of data is passed to the method, providing compile-time type checking.

```java
public static void printMessage(String message){
    System.out.println(message);
}

public static int sumOfTwoNums(int numOne, int numTwo){
    return numOne + numTwo;
}
```

Python functions do not require parameter type declarations:

```python
def print_message(message):
    print(message)

def sum_of_two_nums(num_one, num_two):
    return num_one + num_two
```

#### Return type

In Java, methods must declare the type of value they return. If a method does not return any value, it must use the void keyword.

```java
public static void printMessage(String message){
    System.out.println(message);
}
```

#### Javadoc

Java uses Javadoc comments to provide documentation for classes, methods, and fields. These comments are enclosed within /** and */ and can include annotations like @param and @return. Example from FunctionsOrMethods.java:

```java
/**
 * This function returns the sum of two numbers
 * @param numOne The first integer
 * @param numTwo The second integer
 * @return The sum of `numOne` and `numTwo`
 */
public static int sumOfTwoNums(int numOne, int numTwo){
    return numOne + numTwo;
}
```

* /** ... */: Javadoc comment block.
* @param: Describes each parameter.
* @return: Describes the return value.
* This documentation can be used to generate HTML documentation using Javadoc tools.


## `Looping.java`

This file demonstrates how to use loops in Java, specifically `for` loops and `while` loops, including the use of `break` and `continue` statements to control loop execution.



#### Writing `for` loops

In Java, a `for` loop is used to iterate over a block of code a specific number of times. The syntax includes initialization, condition, and increment/decrement steps all in one line.
```java
for(int i = 0; i < 5; i++) { // i) Initialize counter, ii) set condition, iii) update counter
    System.out.println(i + ". Hello World");
}
```
* `int i = 0`: Initializes the counter variable `i` to `0`.
* `i < 5`: The loop continues as long as `i` is less than `5`.
* `i++`: Increments the counter `i` by `1` after each iteration.
* Inside the loop, `System.out.println(i + ". Hello World");` prints the current value of `i` along with the message "Hello World".


#### Using `break` and `continue`


The `for` loop can also utilize `break` and `continue` statements to control the flow of the loop.

```java
for(int i = 1; i < 20; i++) {
    if (i % 2 == 0){
        continue; // Skip even numbers
    }
    else if (i % 7 == 0) {
        break; // Exit loop when i is divisible by 7
    }
    System.out.println(i);
}
```

* `if (i % 2 == 0)`: Checks if `i` is even. If `true`, `continue` skips the current iteration.
* `else if (i % 7 == 0)`: Checks if i is divisible by 7. If `true`, `break` exits the loop.
* `System.out.println(i);`: Prints the value of `i` if it's odd and not divisible by 7.

#### Writing `while` loops

A `while` loop executes a block of code repeatedly as long as a specified condition remains `true`.

```java
int counter = 0; // Initialize counter
while(counter < 5) { // Condition
    System.out.println(counter + ". While Hello there!");
    counter++; // Update counter
}
```

When creating a `while` loop you must follow the steps:
* Step 1. Initialize a counter
* Step 2. Write a boolean condition until the loop should run. Ensure an infinite-loop is not created
* Step 3. Update the counter


## `Listing.java`


#### Creating (Array)Lists

In Java, you can create a list using the `ArrayList` class from the `java.util` package. When creating an `ArrayList`, you need to specify the type of elements it will hold within angle brackets `< >`

```java
import java.util.ArrayList;

class Listing {

    public static void main(String[] args) {
        ArrayList<String> food = new ArrayList<String>(); // Similar to lists from Python. The only difference is the type
        // ...
    }
}
```

Explanation:

* `ArrayList<String> food = new ArrayList<String>();` creates an `ArrayList` that can only hold `String` objects.
* The `<String>` specifies that this list will contain elements of type `String`.
* Unlike Python lists, Java's `ArrayList` is type-specific and cannot hold elements of different types.

```python
food = ["pizza", "burger", "pepsi", 1, True, 12.5]  # A list with initial elements of different types
```


#### Adding to list

To add elements to an `ArrayList`, you use the `add()` method.

```java
food.add("pizza"); // Add items, similar to `append` method in Python's list
food.add("burger");
food.add("pepsi");
```

You can also add an element at a specific index:

```java
food.add(1, "noodles"); // Adds "noodles" at index 1
```

In Python, you use `append` to add items to the end of a list and `insert`

```python
food.append("pizza")
food.append("burger")
food.append("pepsi")

food.insert(1, "noodles")  # Inserts "noodles" at index 1
```

#### Indexing in lists

In Java's `ArrayList`, you cannot use square brackets `[]` to access elements by index. Instead, you use the `get()` method. Similarly, to set or replace an element at a specific index, you use the `set()` method.

```java
for (int i = 0; i < food.size(); i++) { // `size()` method provides the number of elements
    System.out.println(food.get(i));    // Access elements using `get()`
}

// Replacing an element at a specific index
food.set(1, "tacos"); // Replaces the element at index 1 with "tacos"
```

In Python, you access and modify list elements using square brackets:

```python
# Accessing elements
print(food[i])  # Retrieves the element at index `i`

# Replacing an element at a specific index
food[1] = "tacos"  # Replaces the element at index 1 with "tacos"
```

#### Iterating over lists

To iterate over the elements of an `ArrayList`, you can use a traditional `for` loop with an index or an enhanced `for` loop (also known as a "`for-each`" loop).

```java
// Using index-based for loop
for (int i = 0; i < food.size(); i++) {
    System.out.println(food.get(i));
}
System.out.println("***");

// Using enhanced for loop (for-each)
for (String item : food) {
    System.out.println(item);
}
```

#### Primitive Data Types v/s Classes using in `ArrayList`

In Java, ArrayList cannot store primitive data types like `int`, `double`, etc. Instead, you must use their corresponding wrapper classes (`Integer`, `Double`, etc.). Attempting to create an `ArrayList` of a primitive type will result in a compilation error.

```java
// This will not work:
// ArrayList<int> favoriteNumbers = new ArrayList<int>(); // Error: cannot use primitive type 'int'

// Correct way using wrapper class
ArrayList<Integer> favoriteNumbers = new ArrayList<Integer>();
favoriteNumbers.add(5);
favoriteNumbers.add(10);
```

**Autoboxing and Unboxing**:

Java automatically converts between primitive types and their corresponding wrapper classes when necessary. This is known as autoboxing and unboxing. For example, when adding an `int` to an `ArrayList<Integer>`, Java automatically boxes the int into an `Integer` object.



#### Arrays v/s Lists

Java distinguishes between `arrays` and `ArrayLists`. Arrays have a fixed size once initialized, whereas `ArrayLists` are dynamic and can change size.

```java
// Declaring and initializing an array with a fixed size
int[] favNumbers = new int[5];
favNumbers[0] = 1;
favNumbers[1] = 2;
favNumbers[2] = 3;
favNumbers[3] = 4;
favNumbers[4] = 5;

// Initializing an array with values
int[] primeNumbers = { 2, 3, 5, 7, 9, 11, 13 };

// Iterating over an array using enhanced for loop
for (int eachNum : primeNumbers) {
    System.out.println("PrimeNumber: " + eachNum);
}
```

Key Differences between `Arrays` and `ArrayList` :

* **Size**: `Arrays` have a fixed size; `ArrayLists` are dynamic and can grow or shrink.
* **Syntax**: `Arrays` use square brackets [] for declaration and access; `ArrayList` uses methods like `add()`, `get()`, and `set()`.
* **Type Specification**: `Arrays` can hold primitive types; `ArrayList` cannot hold primitives directly and requires wrapper classes.


## `Dictionary.java`

`HashMap` is a very important data structure to know in Java. It allows us to look-up for items at O(1) time.

#### Instantiating a `HashMap`

In Java, a `HashMap` is used to store key-value pairs, similar to `dictionaries` in Python. To create a `HashMap`, you need to import the `java.util.HashMap` package and specify the types for the keys and values.

```java
import java.util.HashMap;

class Dictionary {
    public static void main(String[] args) {
        HashMap<Character, Integer> charCount = new HashMap<Character, Integer>();
        HashMap<Character, Integer> charCount2 = new HashMap<Character, Integer>();
        // ...
    }
}
```

`HashMap<Character, Integer> charCount = new HashMap<Character, Integer>();` creates a new `HashMap` instance where the keys are of type Character and the values are of type Integer. In Python we can create a dictionary without specifying its type:

```python
char_count = {}  # An empty dictionary
```

#### Simple Operations to do in `HashMap`

You can perform various operations on a HashMap, such as adding key-value pairs, checking if a key exists, retrieving values, and iterating over the entries.

```java
// Adding key-value pairs using `put`
charCount.put(character, 1);

// Checking if a key exists using `containsKey`
if (charCount.containsKey(character)) {
    // Retrieving the value associated with a key using `get`
    Integer currentCount = charCount.get(character);
    // Updating the value
    charCount.put(character, currentCount + 1);
}

// Iterating over keys
for (Character charKey : charCount.keySet()) {
    System.out.println("Character: " + charKey + ", Count: " + charCount.get(charKey));
}
```

* `charCount.put(key, value);` adds a key-value pair to the `HashMap`. If the key already exists, it updates the value.
* `charCount.containsKey(key);` checks if the `HashMap` contains a specific key.
* `charCount.get(key);` retrieves the value associated with a key.
* `charCount.keySet();` returns a set of all the keys in the `HashMap`, which you can iterate over.


#### Creating a `HashMap` (hard)

The first approach in `Dictionary.java` manually checks if a character exists in the `HashMap` and updates the count accordingly. This approach is more verbose

```java
String someString = "hello";

for (int i = 0; i < someString.length(); i++) {
    char character = someString.charAt(i);                      // Get the character at index i

    if (charCount.containsKey(character)) {                     // If the character already exists in the HashMap
        Integer currentCount = charCount.get(character);        // Get the count of the character
        charCount.put(character, currentCount + 1);             // Update the count
    } else {
        charCount.put(character, 1);                            // If the character does not exist, initialize count to 1
    }
}

```

* Iterates over each character in `someString` using a traditional `for` loop.
* Uses `someString.charAt(i)` to get the character at index `i`.
* Checks if the character exists in `charCount` using `containsKey()`.
* If it exists, retrieves the current count with `get()`, increments it, and updates the value with `put()`.
* If it doesn't exist, adds the character with a count of 1 using `put()`.

We know that Python has much simpler and readable syntax:

```python
some_string = "hello"
char_count = {}
for character in some_string:
    if character in char_count:
        current_count = char_count[character]
        char_count[character] = current_count + 1
    else:
        char_count[character] = 1

```

#### Creating a `HashMap` (easy)

Here is a simpler way of doing the same thing as above

```java
// Simplified version using getOrDefault()
for (Character eachChar : someString.toCharArray()) {
    charCount2.put(eachChar, charCount2.getOrDefault(eachChar, 0) + 1);
}
```


## `FileStuff.java`

This file goes over reading/writing/appending to files. 

#### Writing to a file

In Java, writing to a file involves using classes from the `java.io` package, such as `FileWriter`. The `FileWriter` class is used to write character files.

```java
// Writing to a file
try {
    FileWriter writer = new FileWriter("hello.txt");
    writer.write("Hello world\nLearning is so cool!");
    writer.close();
} catch (IOException e) {
    System.out.println("Something happened while writing to the file");
    e.printStackTrace();
}
```

* `FileWriter writer = new FileWriter("hello.txt")`; opens or creates a file named `hello.txt`.
* `writer.write("Hello world\nLearning is so cool!");` writes the specified string to the file.
* `writer.close();` closes the file writer to free system resources.
* The `try-catch` block handles any `IOException` that might occur during file operations.


Alternatively, Java provides a more concise way using the `try-with-resources` statement, which automatically closes the resource:

```java
try (FileWriter writer = new FileWriter("hello.txt")) {
    writer.write("Hello World\n");
} catch (IOException e) {
    System.out.println("Something happened while writing to the file");
    e.printStackTrace();
}
```

#### Reading a file

Reading from a file in Java typically involves using `BufferedReader` combined with `FileReader`.

```java
// Reading file
try (BufferedReader reader = new BufferedReader(new FileReader("hello.txt"))){
    String line = reader.readLine();
    while(line != null) {
        System.out.println(line);
        line = reader.readLine();
    }
} catch (Exception e) {
    System.out.println("Something happened when trying to read the file");
    e.printStackTrace();
}
```

* `BufferedReader reader = new BufferedReader(new FileReader("hello.txt"))` sets up a reader to read text from the file efficiently.
* `reader.readLine()` reads one line at a time from the file.
* The `while` loop continues until `readLine()` returns `null`, indicating the end of the file.

#### Reading a file without the `BufferredReader`

You can read a file in Java without using `BufferedReader` by utilizing other classes like `Scanner` or directly using `FileReader`. 

This is a slow approach

```java
// Reading file without BufferedReader
try (FileReader reader = new FileReader("hello.txt")) {
    int character;
    while ((character = reader.read()) != -1) {
        System.out.print((char) character);
    }
} catch (IOException e) {
    System.out.println("Something happened when trying to read the file");
    e.printStackTrace();
}
```

* `FileReader reader = new FileReader("hello.txt")` opens the file for reading.
* `reader.read()` reads one character at a time, returning its integer ASCII value.
* The method returns `-1` when the end of the file is reached.
* `(char)` character converts the integer back to a character.
* `System.out.print((char) character);` outputs each character without adding a new line.

This is a slightly better approach using `Scanner`


```java
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

// Reading file using Scanner
try (Scanner scanner = new Scanner(new File("hello.txt"))) {
    while (scanner.hasNextLine()) {
        String line = scanner.nextLine();
        System.out.println(line);
    }
} catch (FileNotFoundException e) {
    System.out.println("File not found");
    e.printStackTrace();
}
```

* `Scanner scanner = new Scanner(new File("hello.txt"))` creates a scanner to read from the file.
* `scanner.hasNextLine()` returns `true` if there is another line to read.
* `scanner.nextLine()` reads the next line from the file.
* `System.out.println(line);` outputs the `line` to the console.
* **Note**: While `Scanner` is convenient, it's generally less efficient than `BufferedReader` for large files.


#### Appending to a file

To append data to an existing file in Java, you use the `FileWriter` constructor that accepts a second parameter indicating whether to append or not.

```java
// Appending to each file
try (FileWriter writer = new FileWriter("hello.txt", true)) {
    writer.write("New line");
} catch (Exception e) {
    System.out.println("Something happened when trying to append to a file");
    e.printStackTrace();
}
```


