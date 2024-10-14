import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Читаем весь текст
        String text = scanner.useDelimiter("\\Z").next();
        

        // Разделяем текст на слова, используя регулярное выражение
        String[] words = text.split("\s+|\n+");
        
        // for(int i = 0; i < words.length; i++){
        //     System.out.println(words[i]);
        // }

        // Хранение частоты слов
        Map<String, Integer> wordCount = new HashMap<>();
        
        // Подсчет частоты каждого слова
        for (String word : words) {
            if (!word.isEmpty()) { // Игнорируем пустые строки
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                System.out.print((wordCount.getOrDefault(word, 0) - 1)+" ");
            }
        }
        
        // String mostFrequentWord = "";
        // int maxCount = 0;
        

        // ArrayList<String> ans_arr = new ArrayList<String>();
        // // Поиск слова с максимальной частотой
        // for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
        //     String word = entry.getKey();
        //     int count = entry.getValue();
        //     // System.out.println(word + " " + word.length());
        //     // System.out.println(word + " " + mostFrequentWord+ " " + word.compareTo(mostFrequentWord));

        //     if(count == maxCount){
        //         ans_arr.add(word);   
        //     }

        //     if (count > maxCount) {
        //         // mostFrequentWord = word;
        //         ans_arr = new ArrayList<String>();
        //         ans_arr.add(word);
        //         maxCount = count;
        //     }
        // }
        
        
        // Collections.sort(ans_arr);
        // System.out.println(ans_arr.get(0));
        // System.out.println("a".compareTo("b"));


        // Вывод результата
        // System.out.println(mostFrequentWord);


    }
}