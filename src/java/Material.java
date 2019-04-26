import java.util.*;

public abstract class Material {
    private Map<Damage, Boolean> damageType = new HashMap<>();

    public Material(List<Damage> damages) {
        for (Damage damage : damages) {
            damageType.put(damage, false);
        }

    }

    public void applyDamage(Damage type) {
        damageType.put(type, true);
    }

    public boolean isBurned() {
        return damageType.get(Damage.FIRE);
    }

    public boolean isBroken(){
        return damageType.get(Damage.BLUNT);
    }

    public String getType() {
        return null;
    }


}
