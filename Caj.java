public class Caj {
    static final int DEFAULT_TEA_POWDER = 1;

    private String name;
    private int milk;
    private boolean herbs;
    private int sugar;
    private int teaPowder;

    public Caj() {
    }
    
    public Caj(String name, int milk, boolean herbs, int sugar, int teaPowder) {
        this.name = name;
        this.milk = milk;
        this.herbs = herbs;
        this.sugar = sugar;
        this.teaPowder = teaPowder;
    }
    
    public Caj(String name, int milk, boolean herbs, int sugar) {
        this(name, milk, herbs, sugar, DEFAULT_TEA_POWDER);
    }
    public Caj(String name, int milk, boolean herbs) {
        this(name, milk, herbs, 0);
    }
    
    public Caj(String name, int milk) {
        this(name, milk, false);
    }
    
    public Caj(String name) {
        this(name, 0);
    }
    
    public void setName(String name) {
        this.name = name;
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
    
    public void setSugar(int sugar) {
        this.sugar = sugar;
    }
    
    public int getSugar() {
        return sugar;
    }
    
    public void setHerbs(boolean herbs) {
        this.herbs = herbs;
    }
    
    public boolean getHerbs() {
        return herbs;
    }
    
     public String toString() {
        return "Name: " +name +"\n"+"Milk:"+ milk+"\n"+"Herbs:"+herbs+"\n"+"Sugar:"+sugar+"\n"+"TeaPowder:"+teaPowder;
    }
}
