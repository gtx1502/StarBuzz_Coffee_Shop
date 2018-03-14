import java.math.BigDecimal;

public class WhipCream extends BeverageWithIngredient{
    private final float COST=0.3f;
    private Beverage drink;
    private float cost;
    public WhipCream(Beverage drink){
        this.drink=drink;
    }
    public float cost(){
        BigDecimal b1 = new BigDecimal(Float.toString(COST));
        BigDecimal b2 = new BigDecimal(Float.toString(drink.cost()));
        this.cost= b1.add(b2).floatValue();
        return this.cost;
    }
}
