public class DestroyFurniture {

    public static void main(String[] args) {
        Chair chair = new Chair(new Glass());
        chair.applyDamage(Damage.BLUNT);
        chair.getStatus();
        chair.isBurned();
        Table table = new Table(new Plywood());
        table.applyDamage(Damage.BLUNT);
        table.applyDamage(Damage.FIRE);
        table.getStatus();
        table.isBurned();
    }

}
