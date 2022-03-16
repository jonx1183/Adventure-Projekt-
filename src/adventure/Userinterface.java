package adventure;

import java.util.Scanner;

public class Userinterface {

  public void Interface() {

    boolean Running = true;
    Scanner scan = new Scanner(System.in);
    Game player = new Game();
    Map CurrentRoom = new Map();


    String choice;
    String newloc = "\n" + player.getPLayername() + ", " + "You walked into a new location";
    choice = scan.nextLine();


    while (Running) {

      switch (choice) {
        case "Go north":
          System.out.println("You are going North" + CurrentRoom);
          if (CurrentRoom.getNorth() != null) {
            System.out.println(newloc);
            CurrentRoom.getNorth();
          } else {
            System.out.println("You can't go this way");
          }
          break;
        case "Go east":
          System.out.println("You are going East" + CurrentRoom.getEast());
          if (CurrentRoom.getEast() != null) {
            System.out.println(newloc);
            CurrentRoom.getEast();
          } else {
            System.out.println("You can't go this way");
          }
          break;
        case "Go south":
          System.out.println("You are going South" + CurrentRoom.getSouth());
          if (CurrentRoom.getSouth() != null) {
            System.out.println(newloc);
            CurrentRoom.getSouth();
          } else {
            System.out.println("You can't go this way");
          }
          break;
        case "Go west":
          System.out.println("You are going West" + CurrentRoom.getWest());
          if (CurrentRoom.getWest() != null) {
            System.out.println(newloc);
            CurrentRoom.getWest();
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
      Running = false;
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



    }

}
