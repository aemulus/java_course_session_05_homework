public class StringArray {

    public static void main(String... args) {

        String[] words = {"Ana", "are", "mere", "."};

        // Java is just awesome...
        StringBuilder concatenatedWords = new StringBuilder();
        for (String word : words) {
            concatenatedWords.append(word);
        }
        
        System.out.println(concatenatedWords);
    }
}
