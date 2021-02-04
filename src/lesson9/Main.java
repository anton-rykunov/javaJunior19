package lesson9;

public class Main {
    public static void main(String[] args) {
    Test englishTest = new Test();
    Test findYourSelf = new Test();
    englishTest.mainName = "Опредеи свой уовень английскго";
    findYourSelf.mainName = "Найди свою профессию";
    Question question1 = new Question();
    question1.question = "Моя бабушка жива";
        Question question2 = new Question();
        question2.question = "Моя бабушка жива";
        Question question3 = new Question();
        question3.question = "Моя бабушка жива";
        Question question4 = new Question();
        question4.question = "Моя бабушка жива";
        englishTest.addQuestion(question1);
        englishTest.addQuestion(question2);
        englishTest.addQuestion(question3);
        englishTest.addQuestion(question4);
        System.out.println();

    }
}
