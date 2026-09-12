import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        String s = sc.next();
 
        s = s.toLowerCase();
 
        HashSet<Character> set = new HashSet<>();
 
        for (char ch : s.toCharArray()) {
            set.add(ch);
        }
 
        if (set.size() == 26) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
