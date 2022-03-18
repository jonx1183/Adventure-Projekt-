package adventure;

import java.util.ArrayList;

public class Room {

  private String Name;
  private String Description;
  private Room North, South, West, East;
  private ArrayList<Items> items;

  public ArrayList<Items> getItems(){
    return items;
  }

  public void addItem(Items item) {
    items.add(item);
  }
  public void removeItems(Items item) {
    items.remove(items);
  }

  public Room getNorth(){
    return North;
  }
  public void SetNorth(Room aNorth) {
    this.North = aNorth;

  }
  public Room getSouth(){
    return South;
  }
  public void setSouth(Room aSouth) {
    this.South = aSouth;

  }
  public Room getEast() {
    return East;
  }
  public void setEast(Room aEast) {
    this.East = aEast;
  }
  public Room getWest() {

    return West;
  }
  public void setWest(Room aWest) {
    this.West = aWest;

  }

  public Room (String aName, String aDescription) {

    this.Name = aName;
    this.Description = aDescription;
    items = new ArrayList<>();

  }

  public String getName() {
    return Name;
  }

  public void setName(String aName) {
    this.Name = aName;
  }
  public String getDescription() {
    return Description;
  }
  public void setDescription(String aDescription) {
    this.Description = aDescription;

  }

  @Override
  public String toString() {
    return "Map{" +
        "Name='" + Name + '\'' +
        ", Description='" + Description + '\'' +
        '}';
  }
}


