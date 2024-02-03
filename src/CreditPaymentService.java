public class CreditPaymentService {
    public int calculate(int amountOfCredit, double percent, int term) {
        double mPercent = percent / 12 / 100;
        int termMounth = term * 12;
        double annuityCoefficient = mPercent * ((Math.pow((1 + mPercent), termMounth)) / (Math.pow((1 + mPercent), termMounth) - 1));
        double payment = amountOfCredit * annuityCoefficient;
        return (int) payment;
    }
}



