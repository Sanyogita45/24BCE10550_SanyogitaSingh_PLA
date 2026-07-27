import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        String s = sc.next();
 
        int one = 0, two = 0, three = 0;
 
        for (int i = 0; i < s.length(); i += 2) {
            if (s.charAt(i) == '1')
                one++;
            else if (s.charAt(i) == '2')
                two++;
            else
                three++;
        }
 
        StringBuilder ans = new StringBuilder();
 
        while (one-- > 0)
            ans.append("1+");
 
        while (two-- > 0)
            ans.append("2+");
 
        while (three-- > 0)
            ans.append("3+");
 
        // Last '+' remove kar do
        ans.deleteCharAt(ans.length() - 1);
 
        System.out.println(ans);
    }
}
