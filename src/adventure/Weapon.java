package adventure;

public class Weapon extends Items{

  int Damage;

  public Weapon(String name, String description) {
    super(name, description);


  }

  public int Attack() {
    return Damage;

    }

  }

