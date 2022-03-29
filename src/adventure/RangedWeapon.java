package adventure;

public class RangedWeapon extends Weapon{

  int ammo;

  public RangedWeapon(String name, String description, int Damage, int ammo) {
    super(name, description);
    this.Damage = Damage;
    this.ammo = ammo;

  }


}
