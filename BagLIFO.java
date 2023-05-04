package P2;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
class BagLIFO implements IBag {

    // TO DO: define fields
    ArrayList<ISurprise> lifoBag;

    BagLIFO() {
        // TO DO:
        lifoBag = new ArrayList<>();
    }

    @Override
    public void put(ISurprise newSurprise) {
        // TO DO:
        lifoBag.add(newSurprise);
    }

    @Override
    public void put(IBag bagOfSurprises) {
        // TO DO:
        while (!bagOfSurprises.isEmpty()) {
            lifoBag.add(bagOfSurprises.takeOut());
        }
    }

    @Override
    public ISurprise takeOut() {
        // TO DO:
        if (!lifoBag.isEmpty()) {
            ISurprise getLastSurprise = lifoBag.get(lifoBag.size() - 1);
            lifoBag.remove(lifoBag.size() - 1);
            return getLastSurprise;
        } else {
            System.out.println("No surprise to get!");
            return null;
        }
    }

    @Override
    public boolean isEmpty() {
        // TO DO:
        return lifoBag.size() == 0;
    }

    @Override
    public int size() {
        // TO DO:
        return lifoBag.size();
    }
}
