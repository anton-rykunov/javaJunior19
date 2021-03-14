package lesson15;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtilsImpl implements StringUtils {

    @Override
    public double div(String number1, String number2) throws NullPointerException, NumberFormatException, ArithmeticException {
        if (number1 == null || number2 == null) {
            throw new NullPointerException("number1 or number2 is empty");
        }
        double num1 = 0;
        double num2 = 0;

        try {
            num1 = Double.parseDouble(number1);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("number1 in not a number");
        }
        try {
            num2 = Double.parseDouble(number2);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("number2 in not a number");
        }
        if (num2 == 0) {
            throw new ArithmeticException("number2 is 0");
        }
        return num1 / num2;
    }

    @Override
    public int[] findWord(String text, String word) throws NullPointerException {
        if (text == null || word == null) {
            throw new NullPointerException("Ошибка");
        }
        String[] words = text.split(" ");
        ArrayList<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < words.length; i++){
            if (words[i] == word){
                indexes.add(i);
            }
        }
        int[] index = new int[indexes.size()];
        for(int i = 0; i < index.length; i++) {
            index[i] = indexes.get(i);
        }
        return index;
    }

    @Override
    public double[] findNumbers(String text) throws CustomException {
        String regex = "[-+]?[0-9]*\\.?[0-9]+([eE][-+]?[0-9]+)?";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(text);
        ArrayList<Double> doubles = new ArrayList<>();
        while (m.find()){
            doubles.add(Double.parseDouble(m.group()));
            }
        double[] result = new double[doubles.size()];
        for(int i = 0; i < result.length; i++){
            result[i] = doubles.get(i);
        }
        return result;
    }
}
