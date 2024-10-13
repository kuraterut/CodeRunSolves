import java.util.*;

public class Main {
    static boolean table[][];
    static boolean visited[][];
    static int ans;

    public static void bfs(int X, int Y, int N){       
        if (table[X][Y] && !visited[X][Y]){
            visited[X][Y] = true;
            ans++;
            if(X - 1 >= 0){bfs(X - 1, Y, N);}
            if(X + 1 < N){bfs(X + 1, Y, N);}
            if(Y - 1 >= 0){bfs(X, Y - 1, N);}
            if(Y + 1 < N){bfs(X, Y + 1, N);}
        }
    }   


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt(); 
        scan.nextLine();
        table = new boolean[N][N];
        visited = new boolean[N][N];

        for (int i = 0; i < N; i++){
            String str = scan.nextLine();
                
            for (int j = 0; j < N; j++){
                table[i][j] = str.charAt(j) == '.';
            }
        }

        int X = scan.nextInt() - 1;
        int Y = scan.nextInt() - 1;

        ans = 0;
        bfs(X, Y, N);
        System.out.println(ans);
    }
}
