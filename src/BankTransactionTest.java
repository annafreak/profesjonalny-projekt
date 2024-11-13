abstract class BankTransaction {
    public void acceptWithdrawalRequest() {
        System.out.println("Bank: Przyjęto prośbę wypłaty.");
    }

    public void checkAccountBalance() {
        System.out.println("Bank: Sprawdzanie stanu konta.");
    }

    public void confirmWithdrawalPossibility() {
        System.out.println("Bank: Potwierdzenie możliwości wypłaty.");
    }

    public final void executeTransaction() {
        acceptWithdrawalRequest();
        checkAccountBalance();
        confirmWithdrawalPossibility();
    }
}

class ATMTransaction extends BankTransaction {
    public void requestCard() {
        System.out.println("Bankomat: Proszę włożyć kartę.");
    }

    public void requestPIN() {
        System.out.println("Bankomat: Proszę wprowadzić kod PIN.");
    }

    public void requestAmount() {
        System.out.println("Bankomat: Proszę wprowadzić kwotę do wypłaty.");
    }

    public void dispenseCash() {
        System.out.println("Bankomat: Wypłacanie gotówki.");
    }

    public void thankUser() {
        System.out.println("Bankomat: Dziękujemy za skorzystanie z usług Banku.");
    }


    public void executeATMTransaction() {
        requestCard();
        requestPIN();
        requestAmount();
        super.executeTransaction();
        dispenseCash();
        thankUser();
    }
}

public class BankTransactionTest {
    public static void main(String[] args) {
        ATMTransaction transaction = new ATMTransaction();
        System.out.println("Rozpoczynamy transakcję bankową:");
        transaction.executeATMTransaction();
    }
}
