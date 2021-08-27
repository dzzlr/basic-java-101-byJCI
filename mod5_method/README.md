# Learning Java: Using Procedures and Functions to Create Sub-programs

A *method* is a block of code which only runs when it is called.
You can pass data, known as parameters, into a method.
Methods are used to perform certain actions, and they are also known as *functions*.
Why use methods? To reuse code: define the code once, and use it many times.

## How to Create a Function in Java
Functions must be created or written in a class. The basic structure is like this:
```java
static void myMethod() {
    System.out.println("Good Morning Everybody");
}
```
Example Explained: 
* `myMethod()` is the name of the method.
* `static` means that the method belongs to the Main class and not an object of the Main class.
* `void` means that this method does not have a return value.

## Call a Method
To call a method in Java, write the method's name followed by two parentheses () and a semicolon;
In the following example, myMethod() is used to print a text (the action), when it is called:
```java
public static void main(String[] args) {
    myMethod();
}
```
It will produce output:
```
Good Morning Everybody
```

## Functions with Parameters
Parameters are variables that hold values for processing in a function. Parameters act as inputs for functions.
The basic structure is like this:
```java
static DataType functionName(DataType parameterName, DataType parameterNameOther){
    // function code
}
```
Examples of functions that have parameters:
```java
static void sayIt(String say){
    System.out.println(say);
}
```
How to call a function that has parameters:
```java
sayIt("Hallo!");
sayIt("Selamat datang di pemrograman Java");
sayIt("Saya kira ini bagian terakhir");
sayIt("Sampai jumpa lagi, ya!");
```

Output results:
```
Hallo!
Selamat datang di pemrograman Java
Saya kira ini bagian terakhir
Sampai jumpa lagi, ya!
```

## Functions that return values
After the function processes the inputted data through the parameters, then the function must return the value so that it can be processed in the next process. Return of value to functions using keywords. `return`
Example:
```java
static int luasPersegi(int sisi){
    int luas = sisi * sisi;
    return luas;
}
```

## Function Calling in Another Function
```java
public class BangunRuang {

    public static void main(String[] args) {
        int s = 12;
        int luas = luasKubus(s);

        System.out.println(luas);
    }

    // membuat fungsi luasPersegi()
    static int luasPersegi(int sisi){
        return sisi * sisi;
    }

    // membuat fungsi luasKubus()
    static int luasKubus(int sisi){
        
        // memanggil fungsi luasPersegi
        return 6 * luasPersegi(sisi);
    }

}
```
Output Results:
```
864
```

## Static and Non-Static Functions
* In the examples above, we use keywords before creating a function. `static`
* Keywords will make the function executable directly, without having to create object instances from the class. `static`
```java
public class FungsiStatic {
    
    // Fungsi non-static
    void makan(String makanan){
        System.out.println("Hi!");
        System.out.println("Saya sedang makan " + makanan);
    }
    
    // fungsi static
    static void minum(String minuman){
        System.out.println("Saya sedang minum " + minuman);
    }
    
    // fungsi main
    public static void main(String[] args) {
        
        // pemanggilan fungsi static
        minum("Kopi");
        
        // membuat instansiasi objek saya dari class FungsiStatic
        FungsiStatic saya = new FungsiStatic();
        // pemanggilan fungsi non-static
        saya.makan("Nasi Goreng");
    }
}
```
Output
```
Saya sedang minum Kopi
Hi!
Saya sedang makan Nasi Goreng
```

## Global Variables and Local Variables in Java
A global variable is a variable that can be accessed from all functions. While a local variable is a variable that can only be accessed from within the function where it is located.
```java
class ProgramKu{

    // ini variabel global
    static String nama = "Programku";
    static String version = "1.0.0";

    static void help(){

        // ini variabel lokal
        String nama = "JCI";

        // mengakses variabel global di dalam fungso help()
        System.out.println("Nama: " + nama);
        System.out.println("Versi: " + version);
    }

    public static void main(String args[]){
        
        // panggil fungsi help()
        help();
        
        System.out.println("Nama: " + nama);
        System.out.println("Versi: " + version);

    }

}
```
Output
```
Nama: JCI
Versi: 1.0.0
Nama: Programku
Versi: 1.0.0
```
