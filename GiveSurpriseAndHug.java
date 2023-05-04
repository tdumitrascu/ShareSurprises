package P2;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
class GiveSurpriseAndHug extends AbstractGiveSurprises {

    public GiveSurpriseAndHug(String type, int waitTime) {
        // TO DO:
        super(type,waitTime);
    }

    @Override
    void giveWithPassion() {
        // TO DO:
        System.out.println("Warm wishes and a big hug!");
    }
}
