import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        int k = sc.nextInt();
 
        int[] arr = new int[n];
 
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
 
        int threshold = arr[k - 1]; //kth place
        int count = 0;
 
        for (int i = 0; i < n; i++) {
            if (arr[i] >= threshold && arr[i] > 0) { //condition to check
                count++;
            }
        }
 
        System.out.println(count);
 
        sc.close();
    }
}
