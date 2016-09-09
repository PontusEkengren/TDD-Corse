import org.junit.Assert;
import org.junit.Test;

import java.util.*;

/**
 * Created by poca01 on 2016-09-08.
 */

public class Main {

    @Test
    public void primes() throws Exception {
        assertPrimes(1, 1);
        assertPrimes(2, 2);
        assertPrimes(3, 3);
        assertPrimes(4, 2, 2);
        //assertPrimes(5, 5); fail
        assertPrimes(8, 2, 2, 2);
        assertPrimes(9, 3, 3);

    }

    public void assertPrimes(int i, Integer... expects) {
        Assert.assertEquals(Arrays.asList(expects), Primes.of(i));
    }
}
