package adventure;

import java.util.Scanner;

public class Adventure {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    String Name;

    System.out.println("Welcome to the adventure game: ");
    System.out.println("Type your name: ");
    Name = scan.next();
    System.out.println("Welcome " + Name);

    System.out.println("______________________________________________________________");

    System.out.println("You have four opportunities");
    System.out.println("type the direction you want to go (North,East,South,West)");
    System.out.println("If you want to look around type look");

    String choice;
    choice = scan.next();

    switch (choice){
      case "North":
        System.out.println("You are going North");
      break;
      case "East":
        System.out.println("You are going East");
      break;
      case "South":
        System.out.println("You are going South");
      break;
      case "West":
        System.out.println("You are going West");
      break;
      case "Look":
        System.out.println("You are now looking around");
      break;

    }

    Room One = new Room();
    Room Two = new Room();
    Room Tree = new Room();
    Room Four = new Room();
    Room Five = new Room();
    Room Six = new Room();
    Room Seven = new Room();
    Room eight = new Room();
    Room Nine = new Room();
  }

}
