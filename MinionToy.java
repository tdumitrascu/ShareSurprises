package P2;
import java.sql.SQLOutput;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
class MinionToy implements ISurprise {

    private static final String[] names = { "Dave", "Carl", "Kevin", "Stuart", "Jerry", "Tim" };

    // TO DO: define fields
    static int contor = 0;
    String name;
    public MinionToy(String name) {
        // TO DO:
        this.name = name;
    }

    @Override
    public void enjoy() {
        // TO DO:
        System.out.println("You got a minion named " + name + "!");
    }

    @Override
    public String toString() {
        // TO DO:
        return "[Minion] name = " + name;
    }

    public static MinionToy generate() {
        // TO DO:
        if (contor < names.length) {
            contor++;
        } else {
            contor = 1;
        }
        return new MinionToy(names[contor -1]);
    }
}
