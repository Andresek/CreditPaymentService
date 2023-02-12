public class PaymentService {
    int loanAmount = 1_000_000;
    double interestRate = 9.99;
    double monthlyInterestRate = interestRate / 12 / 100;

    public double calculate(int oneYear) {
        double annuityRatio1 = monthlyInterestRate * Math.pow(monthlyInterestRate + 1, oneYear) / (Math.pow(monthlyInterestRate + 1, oneYear) - 1);
        return (annuityRatio1 * loanAmount);
    }

}