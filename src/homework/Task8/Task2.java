package homework.Task8;

//В тексте после символа каждого слова с индексом k вставить заданную подстроку. Используемые методы (split(), substring())
//Вынести это в отдельный метод с сигнатурой public String (int k, String text)
public class Task2 {
    public static String insert = "ТЕСТ";

    public static String insert(int k, String text) {
        String[] words = text.split(" ");
        String newWord = " ";
        for (String newText : words) {
            if (k < newText.length()) {
                newWord = newText.substring(0, k + 1) + insert + newText.substring(k + 1);
                System.out.print(newWord);
            }

            System.out.print(" ");
        }

        return newWord;
    }

}


//        for (int i = 0; i < words.length; i++) {
//            String word = words[i];
//            String modifiedWord;
//            if (k < word.length()) {
//                // Вставляем подстроку после символа с индексом k
//                modifiedWord = word.substring(0,k+1)+ insert +word.substring(k+1);
//            } else {
//                // Если k >= длины слова, вставляем в конец
//                modifiedWord = word + insert;
//            }
//
//            result.append(modifiedWord);
//            if (i < words.length - 1) {
//                result.append(" ");
//            }
//        }
//        return String.valueOf(result);
