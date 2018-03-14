import java.math.BigDecimal;

public class Decaf extends CoffeeBeverage{
    private final float COST=0.5f;
    public float cost(){
        BigDecimal b1 = new BigDecimal(Float.toString(COST));
        BigDecimal b2 = new BigDecimal(Float.toString(super.cost()));
        return b1.add(b2).floatValue();
    }
}
