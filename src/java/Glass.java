public class Glass extends Material {
    public Glass() {
        super();
    }

    public String getType() {
        return "glass";
    }

    @Override
    public boolean isBurned() { return false; }

}
