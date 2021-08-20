package variable;

public class LuasSegitiga {
    public static void main(String[] args) {
        Double luas;
        int alas, tinggi;

        alas = 23;
        tinggi = 41;
        System.out.println("== Program hitung luas Segitiga ==");
        System.out.println("Alas = " + alas);
        System.out.println("Tinggi = " + tinggi);

        luas = (double)((alas * tinggi) / 2);

        System.out.println("Luas = " + luas);
    }
}
