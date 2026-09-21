import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        int m = sc.nextInt();
 
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                // Odd row: all #
                for (int j = 0; j < m; j++) {
                    System.out.print("#");
                }
            } else {
                // Even row: alternate right and left
                if ((i / 2) % 2 == 1) {
                    // Right side
                    for (int j = 0; j < m - 1; j++) {
                        System.out.print(".");
                    }
                    System.out.print("#");
                } else {
                    // Left side
                    System.out.print("#");
                    for (int j = 1; j < m; j++) {
                        System.out.print(".");
                    }
                }
            }
            System.out.println();
        }
    }
}
