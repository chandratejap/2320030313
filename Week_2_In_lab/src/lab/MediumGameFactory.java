package lab;

public class MediumGameFactory implements GameFactory {
    public Weapon createWeapon() {
        return new MediumWeapon();
    }

    public PowerUp createPowerUp() {
        return new MediumPowerUp();
    }
}
