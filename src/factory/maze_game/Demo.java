package factory.maze_game;

public class Demo {

    public static void main(String[] args) {
        MazeGame ordinaryGame = new OrdinaryMazeGame();
        MazeGame magicGame = new MagicMazeGame();

        Room ordinaryRoom = ordinaryGame.makeRoom();
        Room magicRoom = magicGame.makeRoom();
    }

}
