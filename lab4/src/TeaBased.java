public class TeaBased implements SizeFactor{
    private String size;
    public TeaBased(String size){
        this.size=size;
    }
    public float sizeCost(){
        switch (size){
            case "Large":
                return 0.7f;
            case "Medium":
                return 0.5f;
            case "Small":
                return 0.2f;
            default:
                System.out.println("Wrong size");
                System.exit(0);
        }
        return 0;
    }
}
