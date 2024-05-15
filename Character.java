import java.util.ArrayList;

public class Character {
    private int health;
    private String name;
    private ArrayList<String> inventory;
    private int hunger;
    public Character(){
        health = 10;
        name = "Grant Gilmore";
        inventory = new ArrayList<>();
        hunger = 3;
    }
}
