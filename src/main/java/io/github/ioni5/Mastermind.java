package io.github.ioni5;

public class Mastermind {
    
    private Board board;

    private Player player;

    public Mastermind() {
        board = new Board();
        player = new Player(board);
    }

    public void start() {
        Console console = new Console();
        console.write("\n-----MASTERMIND-----\n");
        do {
            board.show();
            player.play();
        } while (!board.isGameover());
        board.show();
        if (board.isWinner()) {
            console.write("\n\nYou win! :)\n");
        } else {
            console.write("\n\nYou lose :(\n");
        }
    }
}
