# Learn Java: Understanding the Structure and Rules of Writing Java Syntax

## First program
Java 8
```java
class HelloWorld{
    public static void main(String[] args){
        System.out.println("Hello World!");
    }
}
```
Python3
```python
print("Hello World!")
```

## Java Program Basic Structure
The structure of a Java program is generally divided into 4 parts:
1. Package Declaration
2. Import Library
3. Class Section
4. Main Method

Lets take a look
```java
package jci.tutorial.program; // <- Package Declaration
import java.io.File; // <- Impor library

class Program { // <- Bagian class
    public static void main(String args[]){ // <- Method main
        System.out.println("Hello World");
    }
```

## Statements and Expressions in Java
Statements and expressions are the smallest parts of the program. Every statement and expression in Java, must end with a semicolon (;).
```java
System.out.println("Hello World");
System.out.println("JCI disini");
var x = 3;
var y = 8;
var z = x + y;
```

## Java Program Block
```java
class Program{
    public static void main(String args[]){
        System.out.println("Hello World");

        // blok program if
        if (true){
            System.out.println('True');
        }

        // blok program for
        for (int i = 0; i < 10; i++){
            System.out.println("Perulangan ke"+i);
        }
    }
}
```

## Writing Comments in Java
Writing comments in Java, the same as in the C language. That is, using:
1. Double slash ( //) for single-line comments.
2. Asterisk ( /*...*/) for more than one line comments.
```java
// This is a comment
System.out.println("Hello World");
        
/* The code below will print the words Hello World
to the screen, and it is amazing */
```

## Writing Strings and Characters
String is a collection of characters. We often recognize it by text.
Example strings: `"Hello world"`
String writing rules in Java, must be enclosed in double quotes as in the example above.
When enclosed in single quotes, it becomes a character.
Example: `'Hello world'`.
So please differentiate:
1. Double quotes `("...")` to create a string;
2. While single quotes `('...')` to create characters.

## Case Sensitive
Java is Case Sensitive , meaning that uppercase or lowercase letters are distinguished.
Example:
```java
String name = "Just Code It";
String Name = "justcodeit";
String NAME = "JustCodeIt.com";

System.out.println(name);
System.out.println(Name);
System.out.println(NAME);
```
Output:
```text
Just Code It
justcodeit
JustCodeIt.com
```
