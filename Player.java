import java.util.ArrayList;

public class Player {
    private int health;
    private String name;
    private ArrayList<String> inventory;
    private int hunger;
    public Player(){
        health = 10;
        name = "John";
        inventory = new ArrayList<>();
        hunger = 3;
    }
}
