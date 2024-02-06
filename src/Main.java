public class Main {
    public static void main(String[] args) {
        double creditCardBalance = 5000.0;
        double annualInterestRate = 0.17; // 17% interest rate

        double monthlyInterestRate = annualInterestRate / 12.0;

        double interestDueAfterOneMonth = creditCardBalance * monthlyInterestRate;
        double interestDueAfterTwoMonths = (creditCardBalance + interestDueAfterOneMonth) * monthlyInterestRate;

        System.out.println("Interest Due After One Month: $" + interestDueAfterOneMonth);
        System.out.println("Interest Due After Two Months: $" + interestDueAfterTwoMonths);
    }
}
