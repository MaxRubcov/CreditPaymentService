
public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int amountOfCredit = 1000000;
        double percent = 9.99;
        int term = 3;
        int payment = service.calculate(amountOfCredit, percent, term);
        System.out.println(payment);
    }
}


