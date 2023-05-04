package P2;
import java.util.ArrayList;
import java.util.Random;

final class GatherSurprises {

    // TO DO: define fields
    static Random random = new Random();
    static ArrayList<ISurprise> gatherSurprises = new ArrayList<>();

    private GatherSurprises() {
    }

    public static ArrayList<ISurprise> gather(int n) {
        // TO DO:
        for(int i = 0; i < n; i++) {
            int randomSurprise = random.nextInt(3) + 1;
            switch(randomSurprise) {
                case 1:
                    gatherSurprises.add(FortuneCookie.generate());
                    break;
                case 2:
                    gatherSurprises.add(Candies.generate());
                    break;
                case 3:
                    gatherSurprises.add(MinionToy.generate());
                    break;
            }
        }
        return gatherSurprises;
    }

    public static ISurprise gather() {
        // TO DO:
        int randomIndex = random.nextInt(gatherSurprises.size());
        return gatherSurprises.get(randomIndex);

    }
}
