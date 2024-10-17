import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            
        int N = scanner.nextInt();
        // scanner.next();
        
        Map<String, String> wordSins = new HashMap<>();
        
        for (int i = 0; i < N; i++){
            String word1 = scanner.next();
            String word2 = scanner.next();
            wordSins.put(word1, word2);
            wordSins.put(word2, word1);
        }

        String sinWord = scanner.next();
        System.out.println(wordSins.get(sinWord));
    }
}