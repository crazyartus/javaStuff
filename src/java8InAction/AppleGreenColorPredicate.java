package java8InAction;

//stosujemy wzorzec strategii - definiujemy rodzine algorytmow - appleHeavyWeightPredicate i appleGreenColorPredicate
// oraz enkapsulujemy je (rozdzielamy, kazdy osobno)
public class AppleGreenColorPredicate implements ApplePredicate {
    @Override
    public boolean Test(Apple apple) {
        return "green".equals(apple.getColor());
    }
}
