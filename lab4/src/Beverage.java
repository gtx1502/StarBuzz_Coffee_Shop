/**
 * Created by gtx on 2017/7/11.
 */
public class Beverage {
    private String description;
    private SizeFactor sizeCost;
    private int size;

    public String getDescription(){
        return this.description;
    }
    public float cost(){
        return this.sizeCost.sizeCost();
    }
    public void setSize(int size){
        this.size=size;
    }
    public void setSizeCost(SizeFactor sizeCost){
        this.sizeCost=sizeCost;
    }
    public void setSizeFactor(SizeFactor sizeCost){
        this.sizeCost=sizeCost;
    }

}
