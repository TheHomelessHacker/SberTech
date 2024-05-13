import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BankOnlineTest {

    @Test
    public void testSendWithNullArgumentsThrowsException() {
        BankOnline bank = new BankOnline();

        assertThrows(NullArgumentException.class, () -> bank.send(null, 125.80));
    }

    @Test
    public void testSendWithInvalidCardNumberThrowsException() {
        BankOnline bank = new BankOnline();

        assertThrows(InvalidCardNumberException.class, () -> bank.send("12345", 100.0));
    }

    @Test
    public void testSendToBlockedCardThrowsException() {
        BankOnline bank = new BankOnline();

        assertThrows(BlockedCardException.class, () -> bank.send("1111 1111 1111 1111", 100.0));
    }

    @Test
    public void testSendWithNegativeAmountThrowsException() {
        BankOnline bank = new BankOnline();

        assertThrows(NegativeTransferAmountException.class, () -> bank.send("1234 5678 9012 3456", -100.0));
    }

    @Test
    public void testSendAboveLimitThrowsException() {
        BankOnline bank = new BankOnline();

        assertThrows(OutOfLimitTransferException.class, () -> bank.send("1234 5678 9012 3456", 60000.0));
    }
}