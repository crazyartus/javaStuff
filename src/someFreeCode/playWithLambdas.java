package someFreeCode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by lila on 24.10.16.
 */
public class playWithLambdas {
    public static void main(String[] arg){

//implementacja interfejsu.
        Formula formula = new Formula() {
            @Override
            public double calculate(int a) {
                return sqrt(a * 100);
            }
        };

        System.out.println(formula.calculate(100)+" "+  formula.sqrt(15));

//operacje na lambdach

        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");

//Stara werja jakiej do tej pory uzywalismy.
//        Collections.sort(names, new Comparator<String>(){
//            @Override
//            public int compare(String s, String b) {
//                return b.compareTo(a);
//            }
//        } );

        Collections.sort(names, (String a, String b) -> {
                return b.compareTo(a);
        });

        // lub nawet

        Collections.sort(names, (String a, String b) -> b.compareTo(a));


    }
}
