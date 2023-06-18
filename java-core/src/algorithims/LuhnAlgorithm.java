package algorithims;

public class LuhnAlgorithm {
    public static void main(String[] args) {
        String cardNo = "432154237146";
        if (checkCardNum(cardNo))
            System.out.println("This is a valid card");
        else
            System.out.println("This is not a valid card");
    }

    public static boolean checkCardNum(String cardNum) {

        int sum = 0;
        for (int i = 0; i < cardNum.toCharArray().length; i++) {
            int value = Integer.parseInt(String.valueOf(cardNum.charAt(i)));

            if (i % 2 != 0) {
                value *= 2;
            }

            sum += value / 10;
            sum += value % 10;
        }

        return sum % 10 == 0;
    }
}
