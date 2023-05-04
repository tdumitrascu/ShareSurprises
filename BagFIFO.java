package P2;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
class BagFIFO implements IBag {

    // TO DO: define fields
    ArrayList<ISurprise> fifoBag;

    BagFIFO() {
        // TO DO:
        fifoBag = new ArrayList<>();
    }

    @Override
    public void put(ISurprise newSurprise) {
        // TO DO:
        fifoBag.add(newSurprise);
    }

    @Override
    public void put(IBag bagOfSurprises) {
        // TO DO:
        while (!bagOfSurprises.isEmpty()) {
            fifoBag.add(bagOfSurprises.takeOut());
        }
    }

    @Override
    public ISurprise takeOut() {
        // TO DO:
        if (!fifoBag.isEmpty()) {
            ISurprise getFirstSurprise = fifoBag.get(0);
            fifoBag.remove(0);
            return getFirstSurprise;
        } else {
            System.out.println("No surprise to get!");
            return null;
        }
    }

    @Override
    public boolean isEmpty() {
        // TO DO:
        return fifoBag.size() == 0;
    }

    @Override
    public int size() {
        // TO DO:
        return fifoBag.size();
    }
}
