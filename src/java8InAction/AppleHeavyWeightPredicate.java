package java8InAction;

/**
 * Created by lila on 25.10.16.
 */
public class AppleHeavyWeightPredicate implements ApplePredicate {
    @Override
    public boolean Test(Apple apple) {
        return apple.getWeight() > 110;
    }
}
