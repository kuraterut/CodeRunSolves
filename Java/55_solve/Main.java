import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            
        int N = scan.nextInt();

        HashSet<Integer> set = new HashSet<Integer>();


        for (int i = 0; i < N; i++){
            int X = scan.nextInt();
            int Y = scan.nextInt();
            set.add(X);
        }
        
        System.out.println(set.size());
    }
}