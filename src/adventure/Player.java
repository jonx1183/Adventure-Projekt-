package adventure;

import java.util.ArrayList;

public class Player {

  private ArrayList<Items> inventory = new ArrayList<>();

  public ArrayList<Items> getInventory() {
    return inventory;
  }
  public void addInventory(Items items) {
    inventory.add(items);

  }
  public void removeInventory(Items items) {
    inventory.remove(items);
  }

}












