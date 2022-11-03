package io.github.ioni5;

public class Player {

    private Board board;

    public Player(Board board) {
        this.board = board;
    }

    public void play() {
        board.decode(this.obtainCombination());
    }

    private ProposedCombination obtainCombination() {
        String input;
        do {
            input = new Console().read("\nPropose a combination: ");
        } while (!ProposedCombination.isValid(input));
        return new ProposedCombination(input);
    }

}
