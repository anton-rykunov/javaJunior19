package homework.lesson1;

public class lesson1 {
    public static void main(String[] args) {
        int myMoney = 1000;
        int pizzaPrice = 230;
        int chewingGumPrice = 26;
        int candyPrice = 2;

        int numberOfPizza;
        int numberOfChewingGum;
        int numberOfCandy;
        int balanceAfterTheFirstPurchase;
        int balanceAfterTheSecondPurchase;

        if (myMoney >= pizzaPrice) {
            numberOfPizza = myMoney / pizzaPrice;   //расчет количества пицц при условии, что цена пиццы меньше общего еоличества денег
            balanceAfterTheFirstPurchase = myMoney - (numberOfPizza * pizzaPrice);//остаток после покупки пиццы
        } else {
            numberOfPizza = 0;
            balanceAfterTheFirstPurchase = myMoney;
        }
        if (balanceAfterTheFirstPurchase >= chewingGumPrice) {
            numberOfChewingGum = balanceAfterTheFirstPurchase / chewingGumPrice;//расчет количества жевательной резинки при условии, что цена жевательной резтнки меньше количества денег, оставшихся после покупки пиццы
            balanceAfterTheSecondPurchase = balanceAfterTheFirstPurchase - (numberOfChewingGum * chewingGumPrice);//остатк псле покупки жевательной резинки
        } else {
            numberOfChewingGum = 0;
            balanceAfterTheSecondPurchase = myMoney;
        }
        if (balanceAfterTheSecondPurchase >= candyPrice)
            numberOfCandy = balanceAfterTheSecondPurchase / candyPrice;//расчет количества конфет при условии, что цена конфеты меньше, чем количество денег, оставшихся после покупки пиццы и жевательной резинки
        else
            numberOfCandy = 0;

        int handingOver = myMoney - (numberOfPizza * pizzaPrice) - (numberOfChewingGum * chewingGumPrice) - (numberOfCandy * candyPrice);

        if (numberOfPizza == 0)
            System.out.println("На пиццу Вы сегодня не заработали");
        else
            System.out.println("Количество пиццы: " + numberOfPizza);
        if (numberOfChewingGum == 0)
            System.out.println("На жевательную резинку Вы сегодня не заработали");
        else
            System.out.println("Количество упаковок жевательной резинки: " + numberOfChewingGum);
        if (numberOfCandy == 0)
            System.out.println("Конфет сегодня не будет");
        else
            System.out.println("Количество конфет: " + numberOfCandy);
        System.out.println("Сдача: " + handingOver);

    }

}











