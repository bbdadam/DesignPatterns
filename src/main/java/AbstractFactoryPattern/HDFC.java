package AbstractFactoryPattern;

public class HDFC implements Bank {
    private final BankType bankType;

    public HDFC(){
        this.bankType = BankType.HDFC_BANK;
    }
    public BankType getBankType(){
        return this.bankType;
    }
}
