
public class Hangman {

    public static void main(String[] args) {
        UserInteraction ui = new UserInteraction();
        if (ui.start() == 0) {
            Game newgame = new Game();
            newgame.start();
        } else {
            System.out.println("Game stopped");

        }
    }

}
