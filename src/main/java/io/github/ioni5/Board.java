package io.github.ioni5;

public class Board {

    private static final int MAX_ATTEMPS = 10;

    private SecretCombination secretCombination;

    private Result[] results;

    private int attempt;

    public Board() {
        results = new Result[MAX_ATTEMPS];
        secretCombination = new SecretCombination();
    }

    public boolean isGameover() {
        return attempt == MAX_ATTEMPS || this.isWinner();
    }

    public boolean isWinner() {
        return results[attempt - 1].isSucess();
    }

    public void decode(ProposedCombination combination) {
        assert attempt <= MAX_ATTEMPS;
        results[attempt] = secretCombination.decode(combination);
        attempt++;
    }

    public void show() {
        Console console = new Console();
        console.write("\n" + attempt + " attempt(s):");
        secretCombination.show();
        for (int i = 0; i < attempt; i++) {
            results[i].show();
        }
    }

}
