import java.util.*;
import java.lang.*;





public class Main{

    static ArrayList[] graph1_connection;
    static ArrayList[] graph3_lines_list;
    static int[] graph2_lines;
    // static boolean[] visited;
    static int A, B;
    static int ans;

    public static void bfs(int cur, int cur_line_count, int cur_line, boolean[] visited){
        visited[cur] = true;
        System.out.println(cur);
        if(cur+1 == B){
            ans = Math.min(cur_line_count, ans);
            return;
        }

        
        for(int j = 0; j < graph3_lines_list[cur].size(); j++){
            graph2_lines[cur] = (int)graph3_lines_list[cur].get(j);
            if(graph2_lines[cur] != cur_line){
                cur_line_count++;
                cur_line = graph2_lines[cur];
            }
            boolean[] cur_visited = visited;
            for(int i = 0; i < graph1_connection[cur].size(); i++){
                visited = cur_visited;
                if(!visited[(int)graph1_connection[cur].get(i)]){
                    bfs((int)graph1_connection[cur].get(i), cur_line_count, cur_line, visited);
                }
            }

        }

    }


    public static void main(String[] agrs){
        Scanner scan = new Scanner(System.in);
        int N, M;
        N = scan.nextInt();
        M = scan.nextInt();

        graph1_connection = new ArrayList[N];
        graph2_lines = new int[N];
        graph3_lines_list = new ArrayList[N];
        boolean[] visited = new boolean[N];

        for (int i = 0; i < N; i++){
            graph1_connection[i] = new ArrayList<Integer>();
            graph3_lines_list[i] = new ArrayList<Integer>();
        }

        for(int i = 0; i < M; i++){
            int len = scan.nextInt();
            int cur_st = scan.nextInt();
            graph3_lines_list[cur_st-1].add(i);
            for(int j = 0; j < len-1; j++){
                int next_st = scan.nextInt();
                graph2_lines[cur_st-1] = i;
                graph2_lines[next_st-1] = i;
                graph1_connection[cur_st-1].add(next_st-1);
                graph1_connection[next_st-1].add(cur_st-1);
                graph3_lines_list[next_st-1].add(i);
                cur_st = next_st;
                // graph1[cur_st-1] = graph1[cur_st-1].add(next_st-1);
                // graph1[next_st-1] = graph1[next_st-1].add(cur_st-1);
                
            }
        }
        A = scan.nextInt();
        B = scan.nextInt();

        System.out.println();

        for(int i = 0; i < N; i++){
            System.out.println(graph1_connection[i]);
        }
        System.out.println();
        for(int i = 0; i < N; i++){
            System.out.println(graph2_lines[i]);
        }
        System.out.println();
        for(int i = 0; i < N; i++){
            System.out.println(graph3_lines_list[i]);
        }


        ans = 1000000000;
        for (int i = 0; i < graph3_lines_list[A-1].size(); i++){
            graph2_lines[A-1] = (int)graph3_lines_list[A-1].get(i);
            bfs(A-1, 0, (int)graph3_lines_list[A-1].get(i), visited);
        }

        System.out.println();
        for(int i = 0; i < N; i++){
            System.out.println(visited[i]);
        }


        
        if(ans == 1000000000){ans = -1;}
        System.out.println(ans);


        
        



        // for 
    }
}