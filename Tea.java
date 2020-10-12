public class Tea {
    static final int DEFAULT_TEA_POWDER=1;
    
    private String name;
    private int milk;
    private int teaPowder;
    
    public Tea(){
    }
    public Tea(String name,int milk){
        this.name=name;
        this.milk=milk;
        this.teaPowder=DEFAULT_TEA_POWDER;
    }
    public Tea(String name) {
        this.name = name;
    }
    public void setName(String name) {
        this.name= name;
    }
    public String getName() {
        return name;
    }
    public void setMilk(int milk) {
        this.milk = milk;
    }
    public int getMilk() {
        return milk;
    }
    public void setTeaPowder(int teaPowder) {
        this.teaPowder = teaPowder;
    }
    public int getTeaPowder() {
        return teaPowder;
    }
}
