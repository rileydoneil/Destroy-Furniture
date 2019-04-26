import java.util.Arrays;

public class Glass extends Material {
    public Glass() {
        super(Arrays.asList(Damage.BLUNT));
    }

    public String getType() {
        return "Glass";
    }

    @Override
    public boolean isBurned() { return false; }

}
