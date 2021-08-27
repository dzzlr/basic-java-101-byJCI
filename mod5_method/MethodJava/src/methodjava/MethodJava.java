package methodjava;

public class MethodJava {
    
    static void myMethod() {
        System.out.println("Good Morning Everybody");
    }
    
    static void sayIt(String say){
        System.out.println(say);
    }
    
    public static void main(String[] args) {
        myMethod();
        
        sayIt("Hallo!");
        sayIt("Selamat datang di pemrograman Java");
        sayIt("Saya kira ini bagian terakhir");
        sayIt("Sampai jumpa lagi, ya!");
    }
    
}
