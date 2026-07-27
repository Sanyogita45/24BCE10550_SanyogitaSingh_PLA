import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int a = sc.nextInt(); // Limak's weight
        int b = sc.nextInt(); // Bob's weight
 
        int years = 0;
 
        while (a <= b) { //jb strictly greater thtan aa jayeg ato loop tut jayega 
            a = a * 3;
            b = b * 2;
            years++;
        }
 
        System.out.println(years);
    }
}
