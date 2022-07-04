public class Main {

    public static void main(String[] args) {
        int customerAccount = 100; //сумма на счету

        int amountRef = 1100;//сумма пополнения
        int amount = 0; //общая сумма после пополнения с бонусами/без
        int bonusRub = 1;

        if (amountRef >= 1000) {
            bonusRub = amountRef / 100;
            amount = customerAccount + amountRef + bonusRub;
            System.out.println("Итоговый счет клиента: " + amount + "\n" + "Сумма бонусов: " + bonusRub);
        } else {
            amount = customerAccount + amountRef;
            System.out.println("Итоговый счет: " + amount); //бонусы отсутствуют
        }
    }
}
