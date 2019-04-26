public abstract class Furniture {
    private String furnitureType;
    private Material material;


    public Furniture(String furnitureType, Material material) {
        this.material = material;
        this.furnitureType = furnitureType;
    }

    public String getFurnitureType() { return furnitureType; }
    public Material getFurnitureMat() { return material; }
    public boolean isBroken() { return material.isBroken();}
    public boolean isBurned() { return material.isBurned();}

    public void applyDamage(Damage type){
        material.applyDamage(type);
    }

    public void getStatus() {
        System.out.print("The " + this.material.getType() + " " + this.furnitureType);
        if(material.isBroken()) {
            System.out.print(" is broken ");
        }
        else {
            System.out.print(" is not broken ");
        }
        System.out.print("and ");
        if(material.isBurned()) {
            System.out.print("it is burnt.");
        }
        else {
            System.out.print("it is not burnt.");
        }

    }
}
