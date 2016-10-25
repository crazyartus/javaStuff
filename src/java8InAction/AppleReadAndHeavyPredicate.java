package java8InAction;
public class AppleReadAndHeavyPredicate implements ApplePredicate {

    @Override
    public boolean Test(Apple apple) {
        return "red".equals(apple.getColor()) && apple.getWeight() > 110;
    }
}
