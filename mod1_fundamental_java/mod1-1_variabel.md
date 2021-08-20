# Learn Java Programming: Variables and Data Types

## Various Data Types
The following are the various data types in Java:
1. `char`: Character data type, example `Z`
2. `int`: numbers or integers, for example `29`
3. `float`: decimal number, example `2.1`
4. `double`: decimal number too, but bigger capacity, for example `2.1`
5. `String`: a collection of characters that make up the text, for example `Hello World!`
6. `boolean`: data type with only value `true` and `false`

## Creating Variables
The thing to know in creating variables in java is how to write them.
The format is like this:
```java
<data type> namaVariabel;
```
Example:
Create an empty variable of type integer:
```java
int namaVariabel;
```
Create a variable of type integer and directly fill in the value:
```java
int namaVariabel = 19;
```
Create a set of variables of the same data type:
```java
int a, b, c;
```

## Variable Writing Rules
It turns out that it should not be arbitrary in making variables.
There are rules that must be followed, including:
1. Variable names cannot use keywords from Java (reserved words) such as `if, for, switch, etc.`
2. Variable names may use letters, numbers (0-9), underscore (underscore) , and the dollar symbol ($), but the use of underscores and symbols is better avoided.
3. Variable names must start with a lowercase letter, because Java uses the CamelCase style.
4. If the variable name is more than 1 syllable, then the 2nd word is written starting with a capital letter and so on, for example `namaVariabel`.

## How to Convert Data Type
Example: Convert to integer type
Method 1:
```java
Integer.perseInt(variabel);
Integer.perseInt(1.2);
```
Method 2:
```java
Integer.valueOf(2.1);
```
Method 3:
```java
objek.toInt();
```
Method 4:
```java
(int) variabel;
(int) 2.1;
```
Turns out, there are lots of ways.
