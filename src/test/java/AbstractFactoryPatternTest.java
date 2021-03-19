import static org.junit.jupiter.api.Assertions.*;

import AbstractFactoryPattern.*;
import org.junit.jupiter.api.Test;
public class AbstractFactoryPatternTest {
    AbstractFactory bankFactory = FactoryCreator.getFactory(ChoiceType.BANK);
    AbstractFactory loanFactory = FactoryCreator.getFactory(ChoiceType.LOAN);

    @Test
    void testBankType(){
        Bank bank = bankFactory.getBank(BankType.SBI_BANK);

        assertEquals(BankType.SBI_BANK, bank.getBankType());
    }
}
