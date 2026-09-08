import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
 
        Set<Integer> colors = new HashSet<>();
 
        colors.add(a);
        colors.add(b);
        colors.add(c);
        colors.add(d);
 
        System.out.println(4 - colors.size());
    }
}
