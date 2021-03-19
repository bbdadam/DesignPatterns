package AbstractFactoryPattern;

public abstract class Loan {
    public double rate;
    abstract public void getInterestRate(double rate);

    public double calculateLoanPayment(double loanamount, int years){
        double EMI;
        int n;

        n = years*12;
        rate = rate/1200;

        EMI=((rate*Math.pow((1+rate),n))/((Math.pow((1+rate),n))-1))*loanamount;

        return EMI;
    }
}
