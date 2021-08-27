package methodjava;

public class MethodJavaWithReturn {
    static int luasPersegi(int sisi){
        int luas = sisi * sisi;
        return luas;
    }
    
    static int luasPermukaanKubus(int sisi){
        return 6 * luasPersegi(sisi);
    }
    
    public static void main(String[] args) {
        int luas_persegi = luasPersegi(12);
        System.out.println("Luas Persegi: " + luas_persegi);
        
        int luas_permukaan_kubus = luasPermukaanKubus(12);
        System.out.println("Luas Permukaan Kubus: " + luas_permukaan_kubus);
    }
}
