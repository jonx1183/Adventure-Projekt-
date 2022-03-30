package adventure;

public class RangedWeapon extends Weapon{

  int ammo;

  public RangedWeapon(String name, String description, int Damage, int ammo) {
    super(name, description);
    this.Damage = Damage;
    this.ammo = ammo;

  }

@Override
  public int Attack() {
    if(ammo >= 0) {
      ammo--;
      return Damage;
    }

    return 0;
  }
@Override
  public boolean Canattack() {
    return ammo > 0;

  }



}
