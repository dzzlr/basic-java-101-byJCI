package methodjava;

public class MethodStatic {
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
        MethodStatic saya = new MethodStatic();
        // pemanggilan fungsi non-static
        saya.makan("Nasi Goreng");
    }
}
