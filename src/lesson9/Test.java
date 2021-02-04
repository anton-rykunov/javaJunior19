package lesson9;

public class Test {
    // 1 - Поля класса (хорактеристики объекта) ими можно пользоваться внутри класса; Описывают состояние объекта
    //2- Конструкторы класса;
    // 3 - Методы
    String mainName;
    String description;
    String pathToImage;
    Question[] questions = new Question[20];


    public void addQuestion(Question question) {
        for (int i = 0; i < questions.length; i++){
            if(questions[i] == null){
                questions[i] = question;
                break;
            }
        }
    }
}
