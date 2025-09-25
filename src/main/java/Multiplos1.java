import java.io.StreamCorruptedException;

public class Multiplos1 {
    public static void main(String[] args) {
        int nums;
        int n = 100;
        for (nums = 1; nums <= n; nums++) {
            if (n % nums == 0) {
                System.out.println(nums + " es primo");


            }
        }
    }
}

