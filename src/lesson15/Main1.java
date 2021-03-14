package lesson15;

public class Main1 {
    public static void main(String[] args) {


        StringUtilsImpl utils = new StringUtilsImpl();
        try {
            double result = utils.div("4", "2");
            System.out.println(result);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());

        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());

        }


        StringUtilsImpl utils1 = new StringUtilsImpl();
        try {
            utils1.findNumbers("scscscscsc8c68689698s6cscs.scscscsc896966.998cssc44.444dscscrwrwrw5w5.555");

        } catch (CustomException e) {
            System.out.println("  ");
        }

    }

}
