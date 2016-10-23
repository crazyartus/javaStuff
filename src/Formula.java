/**
 * Created by lila on 24.10.16.
 */
public interface Formula {
    double calculate(int a);

    default double sqrt(int a){
        return Math.sqrt(a);
    }
}
