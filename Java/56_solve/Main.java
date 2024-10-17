import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        HashSet<Integer> set = new HashSet<Integer>();
            
        int N = scan.nextInt();

        int count = 0;
        for (int i = 0; i < N; i++){
            int X = scan.nextInt();
            int Y = scan.nextInt();
            if (X + Y == N-1 && !set.contains(X) && X >= 0 && Y >= 0){
                count++;
                set.add(X);
                
            }
        }
        System.out.println(count);
    }
}