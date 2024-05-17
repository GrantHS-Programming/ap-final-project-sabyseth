import java.util.ArrayList;

public class Character {
    private int health;
    private String name;
    private ArrayList<Item> inventory;
    private int hunger;
    public Character(String named){
        health = 10;
        name = named;
        inventory = new ArrayList<>();
        hunger = 3;
    }
    public void itemAdd(Item item){
        inventory.add(item);
    }
    public Item itemRemove(Item item){
        for (int x = 0; x < inventory.size(); x++){
            if (inventory.get(x) == item){
            }
        }
        return item;
    }
}
