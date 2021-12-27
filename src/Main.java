public class Main {
    public static void main(String[] args) {

        int initialAccount = 100;
        int deposit = 100;
        int reward = 100;
        boolean depositAmount = (deposit > 1000);

        if (depositAmount) {
            System.out.println("Вам начисленно " + (deposit / reward) + " бонусных рублей");
            int totalAmount = deposit / reward;
            int totalTotal = totalAmount + initialAccount + deposit;
            System.out.println("Итоговая сумма на счету: " + totalTotal + " рублей");
        } else {
            System.out.println("Вам начисленно 0 бонусных рублей");
            System.out.println("Итоговая сумма на счету: " + (initialAccount + deposit) + " рублей");

        }

    }
}