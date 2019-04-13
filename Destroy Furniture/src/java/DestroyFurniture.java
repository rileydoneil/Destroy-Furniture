package com.company;

public class DestroyFurniture {

    public static void main(String[] args) {
        Furniture chair = new Furniture("chair", "Wood");
        chair.getburned();
        chair.getStatus();
        chair.getwhacked();
    }

}
