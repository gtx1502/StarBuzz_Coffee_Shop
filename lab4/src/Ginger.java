import java.math.BigDecimal;

/**
 * Created by gtx on 2017/7/11.
 */
public class Ginger extends BeverageWithIngredient{
    private final float COST=0.6f;
    private float cost;
    private Beverage drink;
    public Ginger(Beverage drink){
        this.drink=drink;
    }
    public float cost(){
        BigDecimal b1 = new BigDecimal(Float.toString(COST));
        BigDecimal b2 = new BigDecimal(Float.toString(drink.cost()));
        this.cost= b1.add(b2).floatValue();
        return this.cost;
    }
}
