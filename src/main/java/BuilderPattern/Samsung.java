package BuilderPattern;

public class Samsung extends Company {

    @Override
    public int price() {
        return 15;
    }

    @Override
    public CDBrand pack() {
        return CDBrand.SAMSUNG_CD;
    }
}
