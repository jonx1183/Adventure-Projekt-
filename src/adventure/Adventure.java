package adventure;

public class Adventure {

  public static void main(String[] args) {


    new Adventure().go();
  }

  void go() {
    Game game = new Game();
    game.Gamestart();

    Map map = new Map();
    map.Rooms();

    Userinterface userinterface = new Userinterface();
    userinterface.Interface();










  }


}