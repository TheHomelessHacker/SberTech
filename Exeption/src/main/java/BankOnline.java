import static javax.management.Query.and;
import static javax.management.Query.not;

public class BankOnline {
    public static void main(String[] args) {
        BankOnline customer = new BankOnline();
        try {
            //customer.send("2345 6514 2343 8990", null);
            //customer.send("1111 1111 1111 1111", 1255.2);
            //customer.send("2345 6514 2343 8990", -100.2);
            //customer.send("2345 6514 2343 8990", 1255.2);
            customer.send("2345 6514 2343 8990", 50_000.2);
        } catch (InvalidCardNumberException | OutOfLimitTransferException | NullArgumentException |
                 NegativeTransferAmountException | BlockedCardException e) {
            throw new RuntimeException(e);
        }

    }

    public BankOnline() {
    }

    public void send(String cardNumber, Double money) throws InvalidCardNumberException, BlockedCardException, NegativeTransferAmountException, NullArgumentException, OutOfLimitTransferException {
        int limit = 50_000;
        String regex = "[0-9]+";
        String cardNumberWithoutSpaces = cardNumber.replaceAll(" ", "");
        int size = 10;
        String[] BlockCards = new String[size];
        boolean isBlockCards = false;
        BlockCards[0] = "1111 1111 1111 1111";
        BlockCards[1] = "2222 2222 2222 2222";
        BlockCards[2] = "3333 3333 3333 3333";

        for (int index = 0; index < size; index++) {
            if (cardNumber == BlockCards[index]) {
                isBlockCards = true;
                break;
            }
        }

        if ((cardNumberWithoutSpaces.length() != 16) || (!cardNumberWithoutSpaces.matches(regex))) {
            throw new InvalidCardNumberException("Неправильный ввод карты" +
                    "(Номер должен содержать только цифры и их должно быть ровно 16).");
        } else if (isBlockCards) {
            throw new BlockedCardException("Осуществляется перевод на заблокированные карты.");
        } else if (money < 0) {
            throw new NegativeTransferAmountException ("Введена отрицательная сумма перевода.");
        } else if (money > limit) {
            throw new OutOfLimitTransferException("Превышен лимит в " + limit + " рублей.");
        } else if (cardNumber == null || money == null) {
            throw new NullArgumentException("Один из аргументов null.");
        } else {
            System.out.println("Деньги в размере " + money + " рублей были зачислены на номер " + cardNumber);
        }

    }
}

class BankOnlineException extends Exception {
    public BankOnlineException(String message) {
        super(message);
    }
}

class InvalidCardNumberException extends BankOnlineException {
    public InvalidCardNumberException(String message) {
        super(message);
    }
}

class BlockedCardException extends BankOnlineException {
    public BlockedCardException(String message) {
        super(message);
    }
}

class NegativeTransferAmountException extends BankOnlineException {
    public NegativeTransferAmountException(String message) {
        super(message);
    }
}

class NullArgumentException extends BankOnlineException {
    public NullArgumentException(String message) {
        super(message);
    }
}

class OutOfLimitTransferException extends BankOnlineException {
    public OutOfLimitTransferException(String message) {
        super(message);
    }
}


