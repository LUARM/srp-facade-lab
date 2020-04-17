package srpfacadelab;

public class DamagePercent {

    private RpgPlayer player;
    private Inventory invt;

    public DamagePercent(RpgPlayer player, Inventory invt) {
        this.player = player;
        this.invt = invt;
    }

    public void takeDamage(int damage) {
        if (damage < player.getArmour()) {
            player.gameEngine.playSpecialEffect("parry");
        }
        int damageToDeal = damage - player.getArmour();
        player.setHealth(player.getHealth() - damageToDeal);
        if (invt.calculateInventoryWeight() < (player.getCarryingCapacity() * 0.5)) {
            damage = Math.round((float)(damage - (damage * .25)));
        }
        player.gameEngine.playSpecialEffect("lots_of_gore");
    }

}

