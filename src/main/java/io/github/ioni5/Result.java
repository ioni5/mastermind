package io.github.ioni5;

public class Result {

    private int blacks;

    private int whites;

    private ProposedCombination proposedCombination;

    public Result(ProposedCombination proposedCombination, int blacks, int whites) {
        this.blacks = blacks;
        this.whites = whites;
        this.proposedCombination = proposedCombination;
    }

    public boolean isSucess() {
        return blacks == 4;
    }

    public void show() {
        Console console = new Console();
        console.write("\n");
        proposedCombination.show();
        console.write(" --> " + blacks + " blacks and " + whites + " whites.");
    }

}
