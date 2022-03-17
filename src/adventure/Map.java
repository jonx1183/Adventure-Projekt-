package adventure;

public class Map {

  private Room CurrentRoom;


  public Map() {

  }


  public void Rooms() {

    //Room 1

    String Name = "Camp";
    String Description = "You start outside in the camp there is a bonfire, and its raining cats and dogs. You are cold and freezing, so you decide to move, you have now two opportunities to move, you can move East or South.";

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

    Room Room6 = new Room(Name, Description);

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

  public Room getCurrentRoom() {
    return CurrentRoom;
  }

}