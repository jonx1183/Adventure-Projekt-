package adventure;

public class Food extends Items {

  private int HP;

  public Food(String name, String description, int HP) {
    super(name, description);
    this.HP = HP;

  }

  public int setHP(int HP) {
    this.HP = HP;
    return HP;
  }

  public int HP() {
    return HP;
  }

}



