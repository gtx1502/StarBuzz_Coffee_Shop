public class CoffeeBased implements SizeFactor{
    private String size;
    public CoffeeBased(String size){
        this.size=size;
    }
    public float sizeCost(){
        switch (size){
            case "Large":
                return 1;
            case "Medium":
                return 0.7f;
            case "Small":
                return 0.4f;
            default:
                System.out.println("Wrong size");
                System.exit(0);
        }
        return 0;
    }
}
