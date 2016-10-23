/**
 * Created by lila on 24.10.16.
 */
public class playWithLambdas {
    public static void main(String[] arg){
        Formula formula = new Formula() {
            @Override
            public double calculate(int a) {
                return sqrt(a * 100);
            }
        };

        System.out.println(formula.calculate(100)+" "+  formula.sqrt(15));


    }
}
