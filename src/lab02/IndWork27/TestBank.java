package lab02.IndWork27;

public class TestBank extends BankAcc {
    public static void main(String[] args) {
        // Создание банковского счёта
        BankAcc myAccount = new BankAcc();

        // Банковская операция пополнения счета
        myAccount.dep(1111);

        // Банковская операция снятия со счета
        myAccount.withdraw(333);

        // Проверка остатка после операции
        double balance = myAccount.getBalance();
        System.out.println("Баланс клиента = " + balance);
    }
}
