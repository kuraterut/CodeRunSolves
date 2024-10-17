import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            
        int N = scanner.nextInt();
        // scanner.next();
        
        Map<String, Integer> langSet = new HashMap<>();
        
        for (int i = 0; i < N; i++){
            int M = scanner.nextInt();
            for (int j = 0; j < M; j++){
                String lang = scanner.next();
                langSet.put(lang, langSet.getOrDefault(lang, 0) + 1);
            }
        }

        ArrayList<String> allStudentsKnow = new ArrayList<String>();
        ArrayList<String> allLangs = new ArrayList<String>();

        for (Map.Entry<String, Integer> entry: langSet.entrySet()){
            String key = entry.getKey();
            int value = entry.getValue();

            if(value == N){allStudentsKnow.add(key);}
            allLangs.add(key);
        }

        System.out.println(allStudentsKnow.size());
        for (int i = 0; i < allStudentsKnow.size(); i++){
            System.out.println(allStudentsKnow.get(i));
        }
        System.out.println(allLangs.size());
        for (int i = 0; i < allLangs.size(); i++){
            System.out.println(allLangs.get(i));
        }
        
    }
}