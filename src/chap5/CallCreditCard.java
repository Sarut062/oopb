package chap5;

public class CallCreditCard {

    public static void main(String[] args) {
        CreditCard card = CreditCard.creditCardlnstance(23000);
        System.out.println("card = " + card);
        CreditCard card2 = CreditCard.creditCardlnstance(8000);
        System.out.println("card2 = " + card2);
    }

}
