package AbstractFactoryPattern;

public class LoanFactory extends AbstractFactory {

    @Override
    public Bank getBank(BankType bankType) {
        return null;
    }

    @Override
    public Loan getLoan(LoanType loanType) {
        if (loanType == null){
            return null;
        }
        if (loanType.equals(LoanType.HOME)){
            return new HomeLoan();
        } else if (loanType.equals(LoanType.BUSINESS)){
            return new BusinessLoan();
        } else if (loanType.equals(LoanType.EDUCATION)){
            return new EducationLoan();
        }

        return null;
    }
}
