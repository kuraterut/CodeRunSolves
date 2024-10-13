import java.util.*;

public class Main {
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    static int ans;

    public static void bfs(int X){       
        visited[X] = true;
        for (int i = 0; i < graph[X].size(); i++){
            if (!visited[graph[X].get(i)]){
                bfs(graph[X].get(i));
            }
        }
    }   


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();

        
        graph = new ArrayList[N];
        visited = new boolean[N];

        for (int i = 0; i < N; i++){
            graph[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < M; i++){
            int X = scan.nextInt()-1;
            int Y = scan.nextInt()-1;
            
                // graph[X].add(Y);
            graph[Y].add(X);
            
        }

        bfs(0);
        for (int i = 0; i < N; i++){
            if(visited[i]){
                System.out.print((i+1) + " ");
            }
        }


    }
}
