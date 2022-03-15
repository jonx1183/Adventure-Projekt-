package adventure;

import java.util.Scanner;

public class Adventure {

  private Room CurrentRoom;
  private boolean Running = true;
  private String Playername;
  private String Name;
  private String Description;
  Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {


    new Adventure().go();
  }

      void go () {
        Rooms();
        Gamestart();
        while(Running) {
          Interface();
        }
        Exit();

      }

      public void Gamestart() {


    System.out.println("Welcome to the adventure game: ");
    System.out.println("Type your name: ");
    Playername = scan.next();
    System.out.println("Welcome " + Playername);

    System.out.println("You have four opportunities");
    System.out.println("type the direction you want to go (Go north,Go east,Go south, Go west)");
    System.out.println("Type Help for help and Exit to exit the game");
    System.out.println("If you want to look around type Look");

 }

    public void Rooms () {

   //Room 1

    Name = "Camp";
    Description = "You start outside in the camp there is a bonfire, and its raining cats and dogs. You are cold and freezing, so you decide to move, you have now two opportunities to move, you can move East or South.";

    Room Room1 = new Room(Name, Description);


    //Room 2

    Name = "Forrest";
    Description = "You walked East and entered a forrest, there is a lot of threes and spider web hanging from the threes, on the ground there is a lot stones and a swamp";

    Room Room2 = new Room(Name, Description);

    //Room 3

    Name = "Cave";
    Description = "You walked East and entered a cave there is dark, and you choice to light up a tourch, you start looking around and see spider web in the corners and a trap door";

    Room Room3 = new Room(Name, Description);

    //Room4
    Name = "Beach";
    Description = "You walked south and you now entered a beach, you are looking around and sees an entrance to the left side.";

    Room Room4 = new Room(Name, Description);

    //Room5
    Name = "Secret room";
    Description = " Congratulations you entered the secret room";

    Room Room5 = new Room(Name, Description);

    //Room 6
    Name = "Stairs";
    Description = "You walked down the stairs and there is tourches at the side of the wall, you keep moving down";

    Room Room6 = new Room (Name, Description);

    //Room 7
    Name = "Cave";
    Description = "You walked into a cave there is dark, and spiderweb overall there is tourches on the wall there lights up the place";

    Room Room7 = new Room(Name, Description);

    //Room 8
    Name = "Chamber";
    Description = "You entered a Chamber. there is spiderweb in the corners and bones on the floor and skeletons on the side wall";

    Room Room8 = new Room(Name, Description);

    //Room 9
    Name = "Hallway";
    Description = "You entered a Hallway, there is Dimly lit";

    Room Room9 = new Room(Name, Description);

    //Room1
    Room1.SetNorth(null);
    Room1.setEast(Room2);
    Room1.setSouth(Room4);
    Room1.setWest(null);

    //Room2
    Room2.SetNorth(null);
    Room2.setSouth(null);
    Room2.setWest(Room1);
    Room2.setEast(Room3);

    //Room3
    Room3.SetNorth(null);
    Room3.setEast(null);
    Room3.setSouth(Room6);
    Room3.setWest(Room3);

    //Room4
    Room4.SetNorth(null);
    Room4.setSouth(Room7);
    Room4.setWest(null);
    Room4.setEast(null);

     //Room5
    Room5.SetNorth(null);
    Room5.setEast(null);
    Room5.setSouth(Room8);
    Room5.setWest(null);

    //Room6
    Room6.SetNorth(Room3);
    Room6.setSouth(Room9);
    Room6.setWest(null);
    Room6.setEast(null);

    //Room7
    Room7.SetNorth(Room4);
    Room7.setEast(Room8);
    Room7.setSouth(null);
    Room7.setWest(null);

    //Room8
    Room8.SetNorth(Room5);
    Room8.setSouth(null);
    Room8.setWest(Room7);
    Room8.setEast(Room9);

    //Room9
    Room9.SetNorth(Room6);
    Room9.setSouth(null);
    Room9.setWest(Room8);
    Room9.setEast(null);

    CurrentRoom = Room1;

  }

  public void Interface(){

    String choice;
    String newloc = "\n" + Playername + ", " + "You walked into a new location";
    choice = scan.nextLine();


    switch (choice) {
      case "Go north":
        System.out.println("You are going North" + CurrentRoom);
        if(CurrentRoom.getNorth() != null) {
          System.out.println(newloc);
        CurrentRoom = CurrentRoom.getNorth();
        }else{
          System.out.println("You can't go this way");
        }
        break;
      case "Go east":
        System.out.println("You are going East" + CurrentRoom.getEast());
        if (CurrentRoom.getEast() != null) {
          System.out.println(newloc);
          CurrentRoom = CurrentRoom.getEast();
        }
        else {
          System.out.println("You can't go this way");
        }
        break;
      case "Go south":
        System.out.println("You are going South" + CurrentRoom.getSouth());
        if(CurrentRoom.getSouth() != null){
          System.out.println(newloc);
          CurrentRoom = CurrentRoom.getSouth();
        }
        else {
          System.out.println("You can't go this way");
        }
        break;
      case "Go west":
        System.out.println("You are going West" + CurrentRoom.getWest());
        if(CurrentRoom.getWest() != null) {
        System.out.println(newloc);
        CurrentRoom = CurrentRoom.getWest(); }
      else {
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

  void Help(){

    System.out.println("Welcome to the help menu");
    System.out.println("You can write the following commands to play the game");
    System.out.println("Look = looking around");
    System.out.println("Type 'Go north' = to go north");
    System.out.println("Type 'Go east' = to go east");
    System.out.println("Type 'Go south' = to go south");
    System.out.println("Type 'Go west' = to go west");
    System.out.println("Type 'Go exit' = to exit the game");
  }

  void Exit(){
    Running = false;
    System.out.println("Thanks for playing :)");

  }

  }