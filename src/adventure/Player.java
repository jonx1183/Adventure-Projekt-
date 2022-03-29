package adventure;

import java.util.ArrayList;

public class Player {

  private int HP = 100;

  private ArrayList<Items> inventory = new ArrayList<>();

  public ArrayList<Items> getInventory() {
    return inventory;
  }
  public void addInventory(Items items) {
    inventory.add(items);

  }
  public void removeInventory(Items item) {
    inventory.remove(item);
  }


  public int HP() {
    return HP;
  }

public void eatitem(Food item) { // inventory selection "" det valgte item.
    Heal(item.HP());
    removeInventory(item);
}

public void Heal(int  healpowerr)
{
  this.HP += healpowerr;
}

public void Equip (Items items) {
    Equip(items);
    removeInventory(items);
   }


}














