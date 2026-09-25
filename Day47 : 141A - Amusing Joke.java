import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        String guest = sc.nextLine();
        String host = sc.nextLine();
        String pile = sc.nextLine();
 
        String combined = guest + host;
 
        if (combined.length() != pile.length()) {
            System.out.println("NO");
            return;
        }
 
        char[] a = combined.toCharArray();
        char[] b = pile.toCharArray();
 
        Arrays.sort(a);
        Arrays.sort(b);
 
        if (Arrays.equals(a, b)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
