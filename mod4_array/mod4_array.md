# Learn Java: Using Arrays to Store Many Things

## How to Create An Array in Java
How to create an empty array:
```java
// first method
String[] car;

// second method
String car[];

// thir method with a keyword new
String[] car = new String[5];
```
Pay attention:

1. We use square brackets to create arrays; `[]`
2. Elbow brackets can be placed after the data type or array name;
3. Numbers in parentheses mean the limit or size of the array. `5`

The empty array is ready to be filled with data. Make sure to fill it with data that matches the data type.

We can fill it like this:
```java
car[0] = "BMW";
car[1] = "Mazda";
car[2] = "Mercedes";
car[3] = "Lexus";
car[4] = "Porsche";
```
Or if you don't want to bother, we can create an array and immediately fill it.
```java
String[] car = {"BMW", "Mazda", "Mercedes", "Lexus", "Porsche"};
```

## Retrieve Data from arrays
As we already know, arrays have an index to make it easier for us to access the data.
Therefore, we can take the data in this way:
```java
String[] car = {"BMW", "Mazda", "Mercedes", "Lexus", "Porsche"};
System.out.println(car[2]);
```
Output
```text
Mercedes
```

## Using Looping
```java
String[] car = {"BMW", "Mazda", "Mercedes", "Lexus", "Porsche"};
for (int i = 0; i < car.length; i++) {
    System.out.println(car[i]);
}
```

## Array List
The arrays we discussed above actually have some drawbacks, such as:
1. Unable to store data of a different type.
2. The size is not dynamic.

Therefore, there is an Array List that covers the deficiency.

An array list is a class that allows us to create an object to hold anything. To use array lists, we must import them first.
```java
import java.util.ArrayList;
```
After that, we can create an Array List object like this:
```java
ArrayList al = new ArrayList();
```

Because an array list () is an object made of class array lists, it has a method (function) to do something.
1. Function to add something to the Array List;`add()`
2. Function to remove something into the Array List;`remove()`
3. Function to take the size of array list;`size()`
4. The function for retrieving items in an Array List based on a specific id or `index.get(id)`
5. And there are many other functions.