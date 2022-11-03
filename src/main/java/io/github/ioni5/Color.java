package io.github.ioni5;

import java.util.Random;

enum Color {
    
    r,g,b,y,o,p,none;

    public static Color parse(String color) {
        assert color != null;
        assert !color.trim().isEmpty();
        try {
           return Color.valueOf(color); 
        } catch (IllegalArgumentException ex) {
            return Color.none;
        }
    }

    public static Color getRandom() {
        Random rnd = new Random();
        Color[] colors = Color.values();
        return colors[rnd.nextInt(colors.length - 1)];
    }

}
