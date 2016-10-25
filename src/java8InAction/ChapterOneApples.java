package java8InAction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChapterOneApples {
    public static void main(String[] args){
        List<Apple> inventory = Arrays.asList(new Apple(80, "green"),
                                              new Apple(155, "red"),
                                              new Apple(120, "green"));
        //wyszukujemy tylko zielone jabluszka
        System.out.println(">> metoda zielone jabluszka.");
        List<Apple> lista = filtrujZieloneJabluszka(inventory);
        lista.forEach(System.out::println);

        //postep - wyszukujemy jabluszka po danym kolorze
        System.out.println(">> metoda filtruj jabluszka po kolorze.");
        List<Apple> lista2 = filtrujJabluszkaPoKolorze(inventory, "red");
        lista2.forEach(System.out::println);

        //postepowy rolnik chce tylko jablka pow 120g
        System.out.println(">> metoda jabluszka powyzej slusznej wagi.");
        List<Apple> lista3 = jabluszkaPowyzejSlusznejWagi(inventory, 110);
        lista3.forEach(System.out::println);

        //dynamiczny sposob FINAL
        System.out.println(">> zielone jabluszka - predicate");
        List<Apple> listaOst = filterApples(inventory, new AppleGreenColorPredicate());
        listaOst.forEach(System.out::println);

        System.out.println(">> czerwone jabluszka - predicate");
        List<Apple> listaOst2 = filterApples(inventory, new AppleReadAndHeavyPredicate());
        listaOst2.forEach(System.out::println);

        // kolejny sposob za pomoca anymous class
        System.out.println(">> Tylko czerwone jablka z wykorzystaniem metody anonimowej.");
        List<Apple> redApplesList = filterApples(inventory, new ApplePredicate(){

            @Override
            public boolean Test(Apple apple) {
                return "red".equals(apple.getColor());
            }
        });
        redApplesList.forEach(System.out::println);

        // piate podejscie z wykorzystaniem lambd
        System.out.println(">> Tylko zielone jablka z wykorzystaniem lambdy.");
        List<Apple> greenApplesList = filterApples(inventory, (Apple apple) -> "green".equals(apple.getColor()));
        greenApplesList.forEach(System.out::println);

    }

    public static List<Apple> filtrujZieloneJabluszka(List<Apple> inventory){
        List<Apple> result = new ArrayList<>();
        for(Apple apple : inventory){
            if ("green".equals(apple.getColor())){
                result.add(apple);
            }
        }
        return result;
    }

    public static List<Apple> filtrujJabluszkaPoKolorze(List<Apple> inventory, String color){
        List<Apple> result = new ArrayList<>();
        for(Apple apple : inventory){
            if (color.equals(apple.getColor())){
                result.add(apple);
            }
        }
        return result;
    }

    public static List<Apple> jabluszkaPowyzejSlusznejWagi(List<Apple> inventory, int waga){
        List<Apple> result = new ArrayList<>();
        for(Apple apple : inventory){
            if (apple.getWeight() > waga){
                result.add(apple);
            }
        }
        return result;
    }

    //metoda bazujaca na applePredicate interfejsiku
    public static List<Apple> filterApples (List<Apple> inventory, ApplePredicate p){
        List<Apple> result = new ArrayList<>();

        for(Apple apple : inventory){
            if(p.Test(apple)){ // czyli jesli dwa testy zostaja spelnione  = zielony i wazy > 110
                result.add(apple);
            }
        }

        return result;
    }
}
