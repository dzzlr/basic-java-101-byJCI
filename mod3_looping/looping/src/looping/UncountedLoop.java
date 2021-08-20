package looping;

public class UncountedLoop {
    public static void main(String[] args) {
        // While Loop
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
        
        // Do While
        int a = 0;
        do {
            System.out.println(a);
            a++;
        } while (a < 5);
    }
}
