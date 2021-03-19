package BuilderPattern;

public class Sony extends Company {
    @Override
    public int price() {
        return 20;
    }

    @Override
    public CDBrand pack() {
        return CDBrand.Sony_CD;
    }
}
