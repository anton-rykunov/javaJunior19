package lesson6;

public class StringUtils {
    /*Формула создания метода
     * 1 Модификатор доступа (одно из четырех слов);
     *public - доступ в любом месте внутри нашего проекта;
     * protected - область видимости внутри пакета, внутри текщего файла и его наследникам;
     * private - внутри текущего файла;
     * ______ (путота) (package) оьласть видимости внутри пакета
     * 2 - static (может быть или нет) Если метод привязан к определенному объекту то static не пишется!!
     * 3 - возвращаемый тип или void если его нет
     * 4 - название метода с маленькой буквы
     * 5 - в круглых скобках входящие параметры (int a, int b, int lang)
     * 6 - тело выполнения данного метода
     */


    public static void printRevers(String textTOReverse) {
        for (int i = textTOReverse.length() - 1; i >= 0; i--) {
            System.out.print(textTOReverse.charAt(i));
        }
        System.out.println();
    }


    public static void printPartsOfText(String textFoCat) {

        String[] words = textFoCat.split(" ");
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
    }
// Homework (все то, что ниже)
    public static int countGlass(String text) {
        int numOfGlassLetters = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'a' || text.charAt(i) == 'e' || text.charAt(i) == 'i' ||
                    text.charAt(i) == 'o' || text.charAt(i) == 'u' || text.charAt(i) == 'A' ||
                    text.charAt(i) == 'E' || text.charAt(i) == 'I' || text.charAt(i) == 'O' ||
                    text.charAt(i) == 'U')
                numOfGlassLetters++;
        }
        return numOfGlassLetters;
    }

    public static int countSoglass(String text) {
        int numOfSoglassLetters = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'q' || text.charAt(i) == 'w' || text.charAt(i) == 'r' ||
                    text.charAt(i) == 't' || text.charAt(i) == 'y' || text.charAt(i) == 'p' ||
                    text.charAt(i) == 's' || text.charAt(i) == 'd' || text.charAt(i) == 'f' ||
                    text.charAt(i) == 'g' || text.charAt(i) == 'h' || text.charAt(i) == 'j' ||
                    text.charAt(i) == 'k' || text.charAt(i) == 'l' || text.charAt(i) == 'z' ||
                    text.charAt(i) == 'x' || text.charAt(i) == 'c' || text.charAt(i) == 'v' ||
                    text.charAt(i) == 'b' || text.charAt(i) == 'n' || text.charAt(i) == 'm' ||
                    text.charAt(i) == 'Q' || text.charAt(i) == 'W' || text.charAt(i) == 'R' ||
                    text.charAt(i) == 'T' || text.charAt(i) == 'Y' || text.charAt(i) == 'P' ||
                    text.charAt(i) == 'S' || text.charAt(i) == 'D' || text.charAt(i) == 'F' ||
                    text.charAt(i) == 'G' || text.charAt(i) == 'H' || text.charAt(i) == 'J' ||
                    text.charAt(i) == 'K' || text.charAt(i) == 'L' || text.charAt(i) == 'Z' ||
                    text.charAt(i) == 'X' || text.charAt(i) == 'C' || text.charAt(i) == 'V' ||
                    text.charAt(i) == 'B' || text.charAt(i) == 'N' || text.charAt(i) == 'M')
                numOfSoglassLetters++;
        }
        return numOfSoglassLetters;
    }
    public static void sumOfWords(String text) {

        String[] words = text.split(" ");
        int summaOfWords = 0;
        for (int i = 0; i < words.length; i++) {
           summaOfWords ++ ;
        }
        System.out.println("Количество слов в данном тексте - " + summaOfWords);
    }

}

