package AbstractFactoryPattern;

public class BankFactory extends AbstractFactory {

    @Override
    public Bank getBank(BankType bankType) {
        if (bankType == null){
            return null;
        }
        if (bankType.equals(BankType.HDFC_BANK)){
            return new HDFC();
        } else if (bankType.equals(BankType.ICICI_BANK)){
            return new ICICI();
        } else if (bankType.equals(BankType.SBI_BANK)){
            return new SBI();
        }
        return null;
    }

    @Override
    public Loan getLoan(LoanType loanType) {
        return null;
    }
}
