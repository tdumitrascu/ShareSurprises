package P2;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
class BagRandom implements IBag {

    // TO DO: define fields
    Random random = new Random();
    ArrayList<ISurprise> randomBag;

    BagRandom() {
        // TO DO:
        randomBag = new ArrayList<>();
    }

    @Override
    public void put(ISurprise newSurprise) {
        // TO DO:
        randomBag.add(newSurprise);
    }

    @Override
    public void put(IBag bagOfSurprises) {
        // TO DO:
        while (!bagOfSurprises.isEmpty()) {
            randomBag.add(bagOfSurprises.takeOut());
        }
    }

    @Override
    public ISurprise takeOut() {
        // TO DO:
        if (!randomBag.isEmpty()) {
            int randomBagIndex = random.nextInt(randomBag.size());
            ISurprise randomSurprise = randomBag.get(randomBagIndex);
            randomBag.remove(randomBagIndex);
            return randomSurprise;
        } else {
            System.out.println("No surprise to get!");
            return null;
        }


    }

    @Override
    public boolean isEmpty() {
        // TO DO:
        return randomBag.size() == 0;
    }

    @Override
    public int size() {
        // TO DO:
        return randomBag.size();
    }
}
