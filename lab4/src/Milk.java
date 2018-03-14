import java.math.BigDecimal;

public class Milk extends BeverageWithIngredient{
    private final float COST=0.3f;
    private float cost;
    private Beverage drink;
    public Milk(Beverage drink){
        this.drink=drink;
    }
    public float cost(){
        BigDecimal b1 = new BigDecimal(Float.toString(COST));
        BigDecimal b2 = new BigDecimal(Float.toString(drink.cost()));
        this.cost= b1.add(b2).floatValue();
        return this.cost;
    }
}
