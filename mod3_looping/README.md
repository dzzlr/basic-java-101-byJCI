# Learning Java: Understanding 2 Types of Looping in Java

Looping in programming is divided into two types:
1. *Counted loop*: Looping whose number of repetitions is calculated or of course.
2. *Uncounted loop*: Looping whose number of repetitions is incalculable or insanim.

## Counted Loop
### For Loop
Java 8
```java
for (statement 1; statement 2; statement 3) {
  // code block to be executed
}
```
- *Statement 1* is executed (one time) before the execution of the code block.
- *Statement 2* defines the condition for executing the code block.
- *Statement 3* is executed (every time) after the code block has been executed.

Example
```java
for (int i = 0; i < 5; i++) {
  System.out.println(i);
}
```
### For Each
Example
```java
int num[] = {3, 1, 42, 24, 12};
for(int x : num){
  System.out.println(x);
}
```

## Uncounted Loop
### While Loop
Java 8
```java
while (condition) {
  // code block to be executed
}
```

Example
```java
int i = 0;
while (i < 5) {
  System.out.println(i);
  i++;
}
```

### Do While
Java 8
```java
do {
  // code block to be executed
}
while (condition);
```

Example
```java
int i = 0;
do {
  System.out.println(i);
  i++;
}
while (i < 5);
```

## Break and Continue
### Break
```java
for (int i = 0; i < 10; i++) {
  if (i == 4) {
    break;
  }
  System.out.println(i);
}
```

### Continue
```java
for (int i = 0; i < 10; i++) {
  if (i == 4) {
    continue;
  }
  System.out.println(i);
}
```
