# Learn Java: How to Take Input and Display Output

All programming languages have provided functions for input and output.
Java itself already provides three classes to take input:
1. Class Scanner
2. BufferReader class
3. and Class Console.
The three classes are to take input in text-based programs (console). As for the GUI use other classes such as JOptionPane and inputbox on the form.
As for the output, Java provides the functions print(), println(), and format().

## Taking Input with Class Scanner
Scanner is a class that provides functions to take input from the keyboard. In order for us to use Scanner, we need to import it into our code:
```java
import java.util.Scanner;
```
Let's Practice
```java
package pertemuan2;

// mengimpor Scanner ke program
import java.util.Scanner;

public class DataJCI {
    public static void main(String[] args) {
        // deklarasi variabel
        String nama, alamat;
        int usia, bonus;

        // membuat scanner baru
        Scanner keyboard = new Scanner(System.in);

        // Tampilkan output ke user
        System.out.println("### Pendataan Anggota JCI ###");
        System.out.print("Nama anggota: ");
        // menggunakan scanner dan menyimpan apa yang diketik di variabel nama
        nama = keyboard.nextLine();
        // Tampilkan outpu lagi
        System.out.print("Alamat: ");
        // menggunakan scanner lagi
        alamat = keyboard.nextLine();

        System.out.print("Usia: ");
        usia = keyboard.nextInt();

        System.out.print("Bonus: ");
        bonus = keyboard.nextInt();


        // Menampilkan apa yang sudah simpan di variabel
        System.out.println("--------------------");
        System.out.println("Nama anggota: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Usia: " + usia + " tahun");
        System.out.println("Bonus: Rp " + gaji);
    }

}
```

## Displaying Output
We already know several ways to take input from the keyboard for text-based programs. Now what about the output?
There are several functions already provided by Java:
1. Function System.out.print()
2. Function System.out.println()
3. Function System.out.format()

## Function print() vs println()
The print()and functions println()are both used to display text. Then what's the difference?
The function print()will display the text as is. Meanwhile, it println() will display text with a new line added.
Let's try it in code:
```java
package pertemuan1;
public class PrintVsPrinln {
    public static void main(String[] args) {
        System.out.print("this is the text printed with print()");
        System.out.println("while this is the text that is printed with println()");
        System.out.print("this is using print() again");
    }
}
```

When using either function print()or println(), sometimes we need to take text from a variable and combine it with other text.
For example like this:
We have variables `namaDepan` and `namaBelakang`:

```java
String namaDepan = "JCI";
String namaBelakang = "justcodeit";
```
Then we want to display it with a function print(), then we just need to put it in there.
```java
System.out.print(namaDepan);
System.out.print(namaBelakang);
```
Output:
```text
JCIjustcodeit
```
Actually we do not need to use the two functions print(), because we can combine them with operators +.
Example:
```java
System.out.print(namaDepan + namaBelakang);
```
So that there is a space, just add a space:
```java
System.out.print(namaDepan + " " + namaBelakang);
```
