package io.github.ioni5;

public abstract class Combination {

    public static final int MAX_SIZE = 4;
    
    private Color[] colors;

    protected int size;

    public Combination() {
        colors = new Color[MAX_SIZE];
    }

    protected void add(Color color) {
        assert color != null;
        assert size < MAX_SIZE;
        colors[size] = color;
        size++;
    }

    protected Color get(int index) {
        assert index >= 0 && index < size;
        return colors[index];
    }

    public boolean includes(Color color) {
        for (Color c : colors) {
            if (c == color) {
                return true;
            }
        }
        return false;
    }

    public abstract void show();

}
