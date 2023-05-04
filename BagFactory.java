package P2;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
class BagFactory implements IBagFactory {

    // TO DO: define fields
    private static final BagFactory factory = new BagFactory();

    private BagFactory() {

    }

    public static BagFactory getInstance() {
        // TO DO:
        return factory;
    }

    @Override
    public IBag makeBag(String type) {
        // TO DO:
        switch (type.toUpperCase()) {
            case "RANDOM":
                BagRandom randomBag;
                randomBag = new BagRandom();
                return randomBag;
            case "FIFO":
                BagFIFO fifoBag;
                fifoBag = new BagFIFO();
                return fifoBag;
            case "LIFO":
                BagLIFO lifoBag;
                lifoBag = new BagLIFO();
                return lifoBag;
            default:
                System.out.println("Invalid bag type. Options are: RANDOM, FIFO and LIFO.");
        }
        return null;
    }
}
