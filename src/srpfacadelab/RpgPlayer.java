package srpfacadelab;

import java.util.List;
import java.util.ArrayList;


public class RpgPlayer {
    public static final int MAX_CARRYING_CAPACITY = 1000;

    final IGameEngine gameEngine;


    private int health;

    private int maxHealth;

    private int armour;

    private List<Item> inventory;

    // How much the player can carry in pounds
    private int carryingCapacity;

    public RpgPlayer(IGameEngine gameEngine) {
        this.gameEngine = gameEngine;
        inventory = new ArrayList<Item>();
        carryingCapacity = MAX_CARRYING_CAPACITY;
    }

    public void useItem(Item item) {
        if (item.getName().equals("Stink Bomb")) {
            List<IEnemy> enemies = gameEngine.getEnemiesNear(this);

            for (IEnemy enemy : enemies) {
                enemy.takeDamage(100);
            }
        }
    }

    void calculateStats() {
        for (Item i : inventory) {
            armour += i.getArmour();
        }
    }

    public List<Item> getInventory() {
        return inventory;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }
    public int getArmour() {
        return armour;
    }
    void setArmour(int armour) {
        this.armour = armour;
    }
    public int getCarryingCapacity() {
        return carryingCapacity;
    }
    private void setCarryingCapacity(int carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }

}