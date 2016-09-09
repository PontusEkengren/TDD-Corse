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
        for (; i % 2 == 0; i /= 2) {
            result.add(2);
        }
        for (; i % 3 == 0; i /= 3) {
            result.add(3);
        }
        return result;
    }
}
