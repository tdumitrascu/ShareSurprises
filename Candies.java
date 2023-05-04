package P2;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
class Candies implements ISurprise {

    // TO DO: define fields
    static Random random = new Random();
    static String[] types = {"chocolate", "jelly", "fruits", "vanilla"};
    int num;
    String type;

    public Candies(int num, String type) {
        // TO DO:
        this.num = num;
        this.type = type;
    }

    @Override
    public void enjoy() {
        // TO DO:
        System.out.println("You received " + num + " " + type + " candies.");
    }

    @Override
    public String toString() {
        // TO DO:
        return "[Candies] number = " + num + ", type = " + type;
    }

    public static Candies generate() {
        // TO DO:
        int randomTypeIndex = random.nextInt(types.length);
        return new Candies(random.nextInt(101),types[randomTypeIndex]);
    }
}
