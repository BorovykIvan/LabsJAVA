public class Main {
    public static void main(String[] args) {
        String hexString = "CAFE";
        int result1 = hexStringToInt(hexString);
        System.out.println("Результат 1: " + result1);

        String inputSentence = "The user with the nickname koala757677 this month wrote 3 times more " +
                "comments than the user with the nickname croco181dile920 4 months ago";
        String result2 = convertWordsToUpperCase(inputSentence);
        System.out.println("Результат 2: " + result2);
    }

    public static int hexStringToInt(String s) {
        // Перетворення рядка у великі літери для уникнення проблем із регістром
        s = s.toUpperCase();

        // Використання Integer.parseInt для перетворення шістнадцяткового рядка у int
        return Integer.parseInt(s, 16);
    }

    public static String convertWordsToUpperCase(String sentence) {
        // Розділення речення на слова за пробілами
        String[] words = sentence.split(" ");

        // Проходження крізь кожне слово та заміна його великими літерами
        for (int i = 0; i < words.length; i++) {
            // Перевірка, чи слово складається лише з букв та цифр
            if (words[i].matches("[a-zA-Z0-9]+")) {
                words[i] = words[i].toUpperCase();
            }
        }

        // Об'єднання змінених слів у нове речення
        return String.join(" ", words);
    }
}