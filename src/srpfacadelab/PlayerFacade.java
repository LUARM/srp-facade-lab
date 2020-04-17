
package srpfacadelab;

public class PlayerFacade {

    private Inventory invt;
    private DamagePercent dmg;

    public PlayerFacade(Inventory invt, DamagePercent dmg) {
        this.setInvt(invt);
        this.setDmg(dmg);
    }

    public DamagePercent getDmg() {
        return dmg;
    }

    public void setDmg(DamagePercent dmg) {
        this.dmg = dmg;
    }

    public Inventory getInvt() {
        return invt;
    }

    public void setInvt(Inventory invt) {
        this.invt = invt;
    }


} 