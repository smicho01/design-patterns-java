package template.game;

public abstract class Game {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    // template method, FINAL !!! Final is important so the game flow can't be changed !
    public final void play() {
        // init game
        initialize();
        // start game
        startPlay();
        // end game
        endPlay();
    }
}
