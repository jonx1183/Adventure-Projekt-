package adventure;

import java.util.Scanner;

public class Game {

  private String Playername;
  Scanner scan = new Scanner(System.in);

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

  public String getPLayername(){
    return Playername;
  }
  public void SetPLayername(Scanner scan){
    this.Playername = scan.next();
  }

  }


