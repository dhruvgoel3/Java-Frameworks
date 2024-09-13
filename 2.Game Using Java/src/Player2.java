public class Player2 extends Player1
{
    private int health;
    private boolean armour;

    public Player2(String name, String weapon, int health, boolean armour) {
        super(name, weapon, health);
        this.health = health;
        this.armour = armour;
    }

    public void damageByGun() {
        if(armour)
        {

        }
    }
}
