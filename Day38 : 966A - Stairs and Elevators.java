import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
 
public class StairsAndElevators {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int cl = Integer.parseInt(st.nextToken());
        int ce = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());
        
        int[] stairs = new int[cl];
        if (cl > 0) {
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < cl; i++) {
                stairs[i] = Integer.parseInt(st.nextToken());
            }
        } else {
            br.readLine(); // consume empty line if no stairs
        }
        
        int[] elevators = new int[ce];
        if (ce > 0) {
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < ce; i++) {
                elevators[i] = Integer.parseInt(st.nextToken());
            }
        } else {
            br.readLine(); // consume empty line if no elevators
        }
        
        int q = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        while (q-- > 0) {
            st = new StringTokenizer(br.readLine());
            long y1 = Long.parseLong(st.nextToken());
            long x1 = Long.parseLong(st.nextToken());
            long y2 = Long.parseLong(st.nextToken());
            long x2 = Long.parseLong(st.nextToken());
            
            // If they are on the same floor, it's just a straight horizontal walk
            if (y1 == y2) {
                sb.append(Math.abs(x1 - x2)).append("\n");
                continue;
            }
            
            long minTime = Long.MAX_VALUE;
            long floorDiff = Math.abs(y1 - y2);
            
            // 1. Check Closest Stairs
            if (cl > 0) {
                int idx = Arrays.binarySearch(stairs, (int) x1);
                if (idx >= 0) {
                    // Exact column match
                    minTime = Math.min(minTime, Math.abs(x1 - stairs[idx]) + floorDiff + Math.abs(stairs[idx] - x2));
                } else {
                    int insertionPoint = -idx - 1;
                    // Check stair to the left
                    if (insertionPoint > 0) {
                        int leftStair = stairs[insertionPoint - 1];
                        minTime = Math.min(minTime, Math.abs(x1 - leftStair) + floorDiff + Math.abs(leftStair - x2));
                    }
                    // Check stair to the right
                    if (insertionPoint < cl) {
                        int rightStair = stairs[insertionPoint];
                        minTime = Math.min(minTime, Math.abs(x1 - rightStair) + floorDiff + Math.abs(rightStair - x2));
                    }
                }
            }
            
            // 2. Check Closest Elevators
            if (ce > 0) {
                int idx = Arrays.binarySearch(elevators, (int) x1);
                long elevatorTime = (floorDiff + v - 1) / v; // Ceiling division for elevator travel time
                
                if (idx >= 0) {
                    minTime = Math.min(minTime, Math.abs(x1 - elevators[idx]) + elevatorTime + Math.abs(elevators[idx] - x2));
                } else {
                    int insertionPoint = -idx - 1;
                    // Check elevator to the left
                    if (insertionPoint > 0) {
                        int leftElevator = elevators[insertionPoint - 1];
                        minTime = Math.min(minTime, Math.abs(x1 - leftElevator) + elevatorTime + Math.abs(leftElevator - x2));
                    }
                    // Check elevator to the right
                    if (insertionPoint < ce) {
                        int rightElevator = elevators[insertionPoint];
                        minTime = Math.min(minTime, Math.abs(x1 - rightElevator) + elevatorTime + Math.abs(rightElevator - x2));
                    }
                }
            }
            
            sb.append(minTime).append("\n");
        }
        System.out.print(sb);
    }
}
