public class Furniture {
    private String furnitureType;
    private String furnitureMat;
    private boolean broken;
    private boolean burnt;

    public Furniture() {
        furnitureType = "chair";
        furnitureMat = "plywood";
        broken = false;
        burnt = false;
    }

    public Furniture (String type, String mat){
        this.furnitureType = type;
        this.furnitureMat = mat;
    }

    public String getFurnitureType() { return furnitureType; }
    public String getFurnitureMat() { return furnitureMat; }
    public boolean isBroken() { return broken; }
    public boolean isBurnt() { return burnt; }

    public void setWhacked(boolean broken) {
        this.broken = true;
    }
    public void setBurned(boolean burnt) {
        if(furnitureMat.equals("plywood")) {
            this.burnt = true;
        }
    }

    public void getStatus() {
        System.out.print("The " + this.furnitureMat + " " + this.furnitureType);
        if(this.broken) {
            System.out.print(" is broken ");
        }
        else {
            System.out.print(" is not broken ");
        }
        System.out.print("and ");
        if(this.burnt) {
            System.out.print("it is burnt.");
        }
        else {
            System.out.print("it is not burnt.");
        }

    }
}
