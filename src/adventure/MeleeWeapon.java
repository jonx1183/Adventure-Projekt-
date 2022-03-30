package adventure;

public class MeleeWeapon extends Weapon {

  public MeleeWeapon(String name, String description, int Damage) {
    super(name, description);

  }

  public int Attackmeele() {
    return Damage;
  }

}
