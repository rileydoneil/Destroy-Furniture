public abstract class Material {
    private boolean burned;
    private boolean broken;

    public Material() {
        this.broken = false;
        this.burned = false;
    }

    public void setBurned(){
        this.burned = true;
    }

    public void setBroken(){
        this.broken = true;
    }

    public boolean isBurned(){
        return this.burned;
    }

    public boolean isBroken(){
        return this.broken;
    }

    public String getType() {
        return null;
    }
}
