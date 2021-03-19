package AbstractFactoryPattern;

public class ICICI implements Bank {
    private final BankType bankType;

    public ICICI(){
        this.bankType = BankType.ICICI_BANK;
    }

    public BankType getBankType(){
        return this.bankType;
    }
}
