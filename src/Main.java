import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        String author1 = "Лев Николаевич Толстой";
        String author2 = "Александр Сергеевич Пушкин";
        String author3 = "Фёдор Михайлович Достоевский";

        String book1 = "Война и мир";
        String book2 = "Руслан и Людмила";
        String book3 = "Преступление и наказание";

        Map<String, String> boksMap = new HashMap<>();
        boksMap.put(author1, book1);
        boksMap.put(author2, book2);
        boksMap.put(author3, book3);

        System.out.println(boksMap);

        for (Map.Entry<String, String> entry : boksMap.entrySet()) {
            var author = entry.getKey();
            var book = entry.getValue();

            System.out.println("'" + book + "' " + author);
        }
    }
}
