package adventure;

import java.util.Scanner;

public class Userinterface {

  boolean Running = true;

  public void Interface() {


    Scanner scan = new Scanner(System.in);
    Game player = new Game();
    Map map = new Map();
    map.Rooms();

    Room CurrentRoom = map.getCurrentRoom();

    while (Running) {

    String choice;
    String newloc = "\n" + player.getPLayername() + ", " + "You walked into a new location";
    choice = scan.nextLine();


      switch (choice) {
        case "Go north":
          System.out.println("You are going North" + CurrentRoom);
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
          System.out.println("You are now looking around" + CurrentRoom);
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

    void Help () {

      System.out.println("Welcome to the help menu");
      System.out.println("You can write the following commands to play the game");
      System.out.println("Look = looking around");
      System.out.println("Type 'Go north' = to go north");
      System.out.println("Type 'Go east' = to go east");
      System.out.println("Type 'Go south' = to go south");
      System.out.println("Type 'Go west' = to go west");
      System.out.println("Type 'Go exit' = to exit the game");
    }

    void Exit () {

      System.out.println("Thanks for playing :)");
      Running = false;

    }

  }


