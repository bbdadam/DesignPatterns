package AbstractFactoryPattern;

public class SBI implements Bank {
    private final BankType bankType;

    public SBI(){
        this.bankType = BankType.SBI_BANK;
    }

    public BankType getBankType(){
        return this.bankType;
    }

}
