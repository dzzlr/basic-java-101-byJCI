# Learn Java: Understanding 3 Branching Forms in Java
Java has the following conditional statements:
1. Use `if` to specify a block of code to be executed, if a specified condition is true
2. Use `else` to specify a block of code to be executed, if the same condition is false
3. Use `else if` to specify a new condition to test, if the first condition is false
4. Use `switch` to specify many alternative blocks of code to be executed

## The if Statement
Use the `if` statement to specify a block of Java code to be executed if a condition is `true`.

Java
```java
if (condition) {
  // block of code to be executed if the condition is true
}
```
Python3
```python
if condition:
  # block of code to be executed if the condition is true
```

Example
Java
```java
if (20 > 18) {
  System.out.println("20 is greater than 18");
}
```
Python3
```python
if 20 > 18:
  print("20 is greater than 18")
```

## The else Statement
Use the `else` statement to specify a block of code to be executed if the condition is `false`.

Java
```java
if (condition) {
  // block of code to be executed if the condition is true
} else {
  // block of code to be executed if the condition is false
}
```
Python3
```python
if condition:
  # block of code to be executed if the condition is true
else:
  # block of code to be executed if the condition is false
```

Example
Java
```java
int time = 20
if (time < 18) {
  System.out.println("Good day.");
} else {
  System.out.println("Good evening.");
}
```
Output
```text
Good evening.
```
Python3
```python
time = 20
if time < 18:
  print("Good day.")
else:
  print("Good evening.")
```
Output
```text
Good evening.
```

## The else if Statement
Use the `else if` statement to specify a new condition if the first condition is `false`.

Java
```java
if (condition1) {
  // block of code to be executed if condition1 is true
} else if (condition2) {
  // block of code to be executed if the condition1 is false and condition2 is true
} else {
  // block of code to be executed if the condition1 is false and condition2 is false
}
```
Python3
```python
if condition1:
  # block of code to be executed if condition1 is true
elif condition2:
  # block of code to be executed if the condition1 is false and condition2 is true
else:
  # block of code to be executed if the condition1 is false and condition2 is false
```

Example
Java
```java
int time = 22;
if (time < 10) {
  System.out.println("Good morning.");
} else if (time < 20) {
  System.out.println("Good day.");
} else {
  System.out.println("Good evening.");
}
```
Output
```text
Good evening.
```
Python3
```python
time = 22
if time < 10:
  print("Good morning.")
elif time < 20:
  print("Good day.")
else:
  print("Good evening.")
```
Output
```text
Good evening.
```

## Switch Statements
Use the switch statement to select one of many code blocks to be executed.
```java
switch(expression) {
  case x:
    // code block
    break;
  case y:
    // code block
    break;
  default:
    // code block
}
```
Example
```java
int day = 4;
switch (day) {
  case 1:
    System.out.println("Monday");
    break;
  case 2:
    System.out.println("Tuesday");
    break;
  case 3:
    System.out.println("Wednesday");
    break;
  case 4:
    System.out.println("Thursday");
    break;
  case 5:
    System.out.println("Friday");
    break;
  case 6:
    System.out.println("Saturday");
    break;
  case 7:
    System.out.println("Sunday");
    break;
}
```
Output
```text
Thursday
```
