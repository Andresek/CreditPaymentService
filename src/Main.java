public class Main {
    public static void main(String[] args) {
        PaymentService service = new PaymentService();
        int oneYear = 12;
        int twoYear = 24;
        int threeYear = 36;
        int monthlyPayment1 = (int) service.calculate1(oneYear);
        int monthlyPayment2 = (int) service.calculate2(twoYear);
        int monthlyPayment3 = (int) service.calculate3(threeYear);
        System.out.println("Кредит на один год: " + monthlyPayment1 + " рублей в месяц");
        System.out.println("Кредит на два года: " + monthlyPayment2 + " рублей в месяц");
        System.out.println("Кредит на три года: " + monthlyPayment3 + " рублей в месяц");
    }
}