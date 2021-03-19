package AbstractFactoryPattern;

public class FactoryCreator {

    public static AbstractFactory getFactory(ChoiceType choice){
        if (choice.equals(ChoiceType.BANK)){
            return new BankFactory();
        } else if (choice.equals(ChoiceType.LOAN)){
            return new LoanFactory();
        }
        return null;
    }
}
