import java.math.BigDecimal;

/**
 * Created by gtx on 2017/7/11.
 */
public class GreenTea extends TeaBeverage{
    private final float COST=1;
    public float cost(){
        BigDecimal b1 = new BigDecimal(Float.toString(COST));
        BigDecimal b2 = new BigDecimal(Float.toString(super.cost()));
        return b1.add(b2).floatValue();
    }
}
