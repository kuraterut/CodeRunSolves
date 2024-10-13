import java.util.*;
import java.lang.*;

public class Main {
    static int[][] tableA;
    static int[][] tableB;

    public static void bfsA(int X, int Y, int prev_step){       
        if(prev_step+1 >= tableA[X][Y]){return;}
        tableA[X][Y] = Math.min(prev_step+1, tableA[X][Y]);


        if (X - 2 >= 0 && Y - 1 >= 0){bfsA(X-2, Y-1, tableA[X][Y]);}
        if (X - 2 >= 0 && Y + 1 <= 7){bfsA(X-2, Y+1, tableA[X][Y]);}
        if (X + 2 <= 7 && Y - 1 >= 0){bfsA(X+2, Y-1, tableA[X][Y]);}
        if (X + 2 <= 7 && Y + 1 <= 7){bfsA(X+2, Y+1, tableA[X][Y]);}
        if (X - 1 >= 0 && Y - 2 >= 0){bfsA(X-1, Y-2, tableA[X][Y]);}
        if (X - 1 >= 0 && Y + 2 <= 7){bfsA(X-1, Y+2, tableA[X][Y]);}
        if (X + 1 <= 7 && Y - 2 >= 0){bfsA(X+1, Y-2, tableA[X][Y]);}
        if (X + 1 <= 7 && Y + 2 <= 7){bfsA(X+1, Y+2, tableA[X][Y]);}
    }   

    public static void bfsB(int X, int Y, int prev_step){
        if(prev_step+1 >= tableB[X][Y]){return;}       
        tableB[X][Y] = Math.min(prev_step+1, tableB[X][Y]);
        if (X - 2 >= 0 && Y - 1 >= 0){bfsB(X-2, Y-1, tableB[X][Y]);}
        if (X - 2 >= 0 && Y + 1 <= 7){bfsB(X-2, Y+1, tableB[X][Y]);}
        if (X + 2 <= 7 && Y - 1 >= 0){bfsB(X+2, Y-1, tableB[X][Y]);}
        if (X + 2 <= 7 && Y + 1 <= 7){bfsB(X+2, Y+1, tableB[X][Y]);}
        if (X - 1 >= 0 && Y - 2 >= 0){bfsB(X-1, Y-2, tableB[X][Y]);}
        if (X - 1 >= 0 && Y + 2 <= 7){bfsB(X-1, Y+2, tableB[X][Y]);}
        if (X + 1 <= 7 && Y - 2 >= 0){bfsB(X+1, Y-2, tableB[X][Y]);}
        if (X + 1 <= 7 && Y + 2 <= 7){bfsB(X+1, Y+2, tableB[X][Y]);}
    }   

    

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String A = scan.next();
        String B = scan.next();

        tableA = new int[8][8];
        tableB = new int[8][8];
        for (int i = 0; i < 8; i++){
            for (int j = 0; j < 8; j++){
                tableA[i][j] = 10000;
                tableB[i][j] = 10000;
            }
        }

        String alphabet = "abcdefgh";

        int Ax = alphabet.indexOf(A.charAt(0));
        int Ay = A.charAt(1)-'0'-1;
        int Bx = alphabet.indexOf(B.charAt(0));
        int By = B.charAt(1)-'0'-1;

        tableA[Ax][Ay] = 1;
        tableB[Bx][By] = 1;
        
        bfsA(Ax, Ay, -1);
        bfsB(Bx, By, -1);

        int ans = 10000;
        for (int i = 0; i < 8; i++){
            for (int j = 0; j < 8; j++){
                if (tableA[i][j] == tableB[i][j]){
                    ans = Math.min(tableA[i][j], ans);
                }
            }
        }

        if(ans == 10000){
            System.out.println(-1);
        }
        else{System.out.println(ans);}


        
    }
}
