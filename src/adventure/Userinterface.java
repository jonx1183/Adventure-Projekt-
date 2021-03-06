package adventure;

import java.util.Scanner;

public class Userinterface {

  boolean Running = true;

  public void Interface() {


    Scanner scan = new Scanner(System.in);
    Game player = new Game();
    Map map = new Map();
    map.Rooms();
    Player player1 = new Player();



    Room CurrentRoom = map.getCurrentRoom();

    while (Running) {

      String choice;
      String newloc = "\n" + player.getPLayername() + ", " + "You walked into a new location";
      choice = scan.nextLine();


      switch (choice) {
        case "Go north":
          System.out.println("You are going North" + CurrentRoom);
          System.out.println("Your HP" + player1.HP());
          if (CurrentRoom.getNorth() != null) {
            System.out.println(newloc);
            CurrentRoom = CurrentRoom.getNorth();
          } else {
            System.out.println("You can't go this way");
          }
          break;
        case "Go east":
          System.out.println("You are going East" + CurrentRoom.getEast());
          if (CurrentRoom.getEast() != null) {
            System.out.println(newloc);
            CurrentRoom = CurrentRoom.getEast();
          } else {
            System.out.println("You can't go this way");
          }
          break;
        case "Go south":
          System.out.println("You are going South" + CurrentRoom.getSouth());
          if (CurrentRoom.getSouth() != null) {
            System.out.println(newloc);
            CurrentRoom = CurrentRoom.getSouth();
          } else {
            System.out.println("You can't go this way");
          }
          break;
        case "Go west":
          System.out.println("You are going West" + CurrentRoom.getWest());
          if (CurrentRoom.getWest() != null) {
            System.out.println(newloc);
            CurrentRoom = CurrentRoom.getWest();
          } else {
            System.out.println("You can't go this way");
          }
          break;
        case "Look":
          System.out.println("You are now looking around" + CurrentRoom + '\n' + CurrentRoom.getItems());
          break;
        case "Take":
          System.out.println("What do you want to pick up: ");
          String name = scan.next();
          Items AddItems = CurrentRoom.addItems(name);
          System.out.println("You have picked up an item" + AddItems);
          if(AddItems != null){
          player1.addInventory(AddItems);}
          break;
        case "Drop":
          System.out.println("Do you want to drop your items");
          name = scan.next();
          Items DropItem = CurrentRoom.removeItem(name);
          System.out.println("You have dropped" + DropItem);
          if(DropItem != null){
            player1.removeInventory(DropItem);
          }
          break;
        case "inv":
          System.out.println("You are now looking in your inventory: " + player1.getInventory());
          break;
        case "Equip":
          System.out.println("Choose an item to equip");
          int index0 = 0;
          for (Items item: player1.getInventory())
          {
          System.out.println(index0 + ". " + item.getname());
           index0++;
          }
          String input = scan.nextLine();
          player1.Equip((Weapon) player1.getInventory().get(Integer.parseInt(input)));
          break;
        case "Heal":
          System.out.println("Choose what to eat.");
          int index = 0;
          for (Items item: player1.getInventory())
          {
            System.out.println(index + ". " + item.getname());
            index++;
          }

          String input2 = scan.nextLine();
          player1.eatitem((Food) player1.getInventory().get(Integer.parseInt(input2)));

          // player1.getInvwentory.Remove(item).eatiitem();

          break;
        case "HP":
          System.out.println("Your Hp is: " + player1.HP());
          break;
        case "Equiped":
          System.out.println("You have equiped: " + player1.Equiped());
          break;
        case "Attack":
          if(player1.Equiped() == null) {
            System.out.println("You haven't equiped any weapon yet");
          }
          else if (player1.Equiped() != null)
            System.out.println("There are no enemies in the room and you are attacking the air: ");
          else
            System.out.println("You have no ammo left");
          break;
        case "Help":
          Help();
          break;
        case "Exit":
          Exit();
          break;

      }

    }

  }

  void Help() {

    System.out.println("Welcome to the help menu");
    System.out.println("You can write the following commands to play the game");
    System.out.println("Look = looking around and see if there is any items");
    System.out.println("Take = to take an item");
    System.out.println("Drop to drop an item");
    System.out.println("Equip to equip a weapon");
    System.out.println("Equiped to see equiped weapon");
    System.out.println("Attack to attack");
    System.out.println("HP to see your current health points");
    System.out.println("Heal to heal");
    System.out.println("inv to look in your inventory");
    System.out.println("Type 'Go north' = to go north");
    System.out.println("Type 'Go east' = to go east");
    System.out.println("Type 'Go south' = to go south");
    System.out.println("Type 'Go west' = to go west");
    System.out.println("Type 'Go exit' = to exit the game");
  }

  void Exit() {

    System.out.println("Thanks for playing :)");
    Running = false;


  }


}


