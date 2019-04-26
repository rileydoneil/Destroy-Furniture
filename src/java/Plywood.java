import java.util.Arrays;

public class Plywood extends Material {

    public Plywood() {
        super(Arrays.asList(Damage.FIRE, Damage.BLUNT));
    }

    @Override
    public String getType(){
        return "Plywood";
    }
}
