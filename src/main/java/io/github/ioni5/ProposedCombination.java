package io.github.ioni5;

public class ProposedCombination extends Combination {

    public ProposedCombination() {
        super();
    }

    public ProposedCombination(String colors) {
        super();
        for (String c : colors.split("")) {
            this.add(Color.parse(c));
        }
    }

    public static boolean isValid(String colors) {
        Console console = new Console();
        if (colors.trim().length() != MAX_SIZE) {
            console.write("\nWrong proposed combination length.");
            return false;
        }
        ProposedCombination combination = new ProposedCombination();
        for (String s : colors.split("")) {
            Color color = Color.parse(s);
            if (color == Color.none) {
                console.write("\nWrong colors, they must be: rgbyop.");
                return false;
            }
            if (combination.includes(color)) {
                console.write("\nWrong proposed, duplicates are not accepted.");
                return false;
            }
            combination.add(color);
        }
        return true;
    }

    @Override
    public void show() {
        Console console = new Console();
        for (int i = 0; i < size; i++) {
            console.write(this.get(i).name());
        }
    }
    
}
