import java.math.BigDecimal;

/**
 * Created by gtx on 2017/7/11.
 */
public class HouseBlend extends CoffeeBeverage{
    private final float COST=0.8f;
    public float cost(){
        BigDecimal b1 = new BigDecimal(Float.toString(COST));
        BigDecimal b2 = new BigDecimal(Float.toString(super.cost()));
        return b1.add(b2).floatValue();
    }
}
