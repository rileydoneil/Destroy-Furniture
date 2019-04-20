public class DestroyFurniture {

    public static void main(String[] args) {
        Chair chair = new Chair(new Glass());
        chair.setBurned();
        chair.getStatus();
        chair.getFurnitureMat();
        chair.isBurned();
        chair.getFurnitureType();
    }

}
