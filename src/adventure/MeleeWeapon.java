package adventure;

public class MeleeWeapon extends Weapon {

  public MeleeWeapon(String name, String description, int Damage) {
    super(name, description);

  }
@Override
  public int Attack() {
    return Damage;
  }

}
