package io.github.ioni5;

public class SecretCombination extends Combination {

    public SecretCombination() {
        super();
        this.generateCombination();
    }

    private void generateCombination() {
        do {
            Color color = Color.getRandom();
            if (color != Color.none && !this.includes(color)) {
                this.add(color);
            }
        } while (size < MAX_SIZE);
    }

    public Result decode(ProposedCombination combination) {
        int blacks = 0;
        int whites = 0;
        for (int i = 0; i < combination.size; i++) {
            if (this.includes(combination.get(i))) {
                whites++;
                if (combination.get(i) == this.get(i)) {
                    blacks++;
                }
            }
        }
        return new Result(combination, blacks, whites);
    }

    @Override
    public void show() {
        new Console().write("\nxxxx");
    }

}
