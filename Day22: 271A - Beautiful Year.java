import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        for (int i = y + 1; ; i++) {
            if (distinct(i)) {
                System.out.println(i);
                break;
            }
        }
    }
 
    static boolean distinct(int n) {
        String s = Integer.toString(n);
        Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (!set.add(c)) return false;
        }
        return true;
    }
}
