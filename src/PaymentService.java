public class PaymentService {
    int loanAmount = 1_000_000;
    double interestRate = 9.99;
    double monthlyInterestRate = interestRate / 12 / 100;

    public double calculate1(int oneYear) {
        double annuityRatio1 = monthlyInterestRate * Math.pow(monthlyInterestRate + 1, oneYear) / (Math.pow(monthlyInterestRate + 1, oneYear) - 1);
        return (annuityRatio1 * loanAmount);
    }

    public double calculate2(int twoYear) {
        double annuityRatio2 = monthlyInterestRate * Math.pow(monthlyInterestRate + 1, twoYear) / (Math.pow(monthlyInterestRate + 1, twoYear) - 1);
        return (annuityRatio2 * loanAmount);
    }

    public double calculate3(int threeYear) {
        double annuityRatio3 = monthlyInterestRate * Math.pow(monthlyInterestRate + 1, threeYear) / (Math.pow(monthlyInterestRate + 1, threeYear) - 1);
        return (annuityRatio3 * loanAmount);
    }
}