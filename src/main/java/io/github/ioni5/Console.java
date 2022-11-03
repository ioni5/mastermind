package io.github.ioni5;

import java.util.Scanner;

public class Console {
    
    private Scanner sc = new Scanner(System.in);

    public void write(String message) {
        System.out.print(message);
    }

    public String read(String mesage) {
        this.write(mesage);
        String input = null;
        try {
            input = sc.nextLine();
        } catch(Exception ex) {
            this.write("\nError: Invalid input.");
            System.exit(0);
        }
        return input;
    }

    public int readInt(String mesage) {
        this.write(mesage);
        int input = -1;
        try {
            input = Integer.parseInt(this.read(mesage));
        } catch(Exception ex) {
            this.write("\nError: Invalid input.");
            System.exit(0);
        }
        return input;
    }
}
