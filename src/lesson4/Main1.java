package lesson4;

public class Main1 {
    public static void main(String[] args) {
        String password = "Qw*dfg123";
        if (password.length() < 8) {
            System.out.println("Пароль меньше 8-ми символов. Пароль не подходит");
            return;
        }
        if (!password.contains(")") && !password.contains("(")
                && !password.contains("*") && !password.contains("@")) {
            System.out.println("Пароль не содержит спец-символы. Пароль не подходит");
            return;
        }
        int sumNums = 0;
        char[] nums = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        for (int i = 0; i < nums.length; i++) {
            if (password.contains(nums[i] + "")) {
                sumNums++;
            }
        }
            if (sumNums == 0)
                System.out.println("Пароль не содержит цыфры. Пароль не подходит");
             else
                System.out.println("Пароль подходит");

        }
    }

