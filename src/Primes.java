import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by poca01 on 2016-09-08.
 */
public class Primes {
    public static List<Integer> of(int i) {

        if (i == 1) {
            return Arrays.asList(i);
        }

        List<Integer> result = new ArrayList<>();
        for (int divisor = 2; i > 1; divisor++) {
            for (; i % divisor == 0; i /= divisor) {
                result.add(divisor);
            }
        }

        return result;
    }
}
