package lesson6;

public class HomeWorkLesson6 {
    public static void main(String[] args) {
        //part1
        int numbersOfGlass1 = StringUtils.countGlass("I was born in the city of Sochi");
        System.out.println("Количество глассных в данном тексте: " + numbersOfGlass1);

        String text = "The weather outside today is terrible";
        int numbersOfGlass2 = StringUtils.countGlass(text);
        System.out.println("Количество глассных в данном тексте: " + numbersOfGlass2);

        //part2
        int numbersOfSoglass1 = StringUtils.countSoglass("I was born in the city of Sochi");
        System.out.println("Количество согласных в данном тексте: " + numbersOfSoglass1);

        String text1 = "The weather outside today is terrible";
        int numbersOfSoglass2 = StringUtils.countSoglass(text);
        System.out.println("Количество согласных в данном тексте: " + numbersOfSoglass2);

        //part3
        int firstNum = 7;
        int secondNum = 8;
        int thirdNum = 1;
        NumUtil.findBiggest(firstNum, secondNum, thirdNum);

        NumUtil.findBiggest(12, 34, 55);

        //part4
        String text3 = "President Biden spoke about climate change, calling it an “existential threat”" +
                " and casting many of his orders as an opportunity for job creation. His pick for ambassador" +
                " to the United Nations told lawmakers a speech she gave in 2019 was a “huge mistake";
        StringUtils.sumOfWords(text3);
    }


}

