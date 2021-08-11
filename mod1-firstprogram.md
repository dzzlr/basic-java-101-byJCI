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
package jci.tutorial.program;    //  <- Package Declaration
import java.io.File;    //  <- Impor library

class Program {    //  <- Bagian class
    public static void main(String args[]){  // <- Method main
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
        System.out.println("Hello Kode");

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
