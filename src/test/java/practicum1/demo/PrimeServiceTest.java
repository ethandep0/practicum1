package practicum1.demo;
import org.junit.jupiter.api.Test;
import practicum1.demo.service.*;

import static org.junit.jupiter.api.Assertions.*;

class PrimeServiceTest {

    PrimeService primeService = new PrimeService();

    @Test
    void _23IsPrime() {

        int n = 23;
        boolean expected = true;
        boolean acutal = primeService.isPrime(n);
        assertEquals(expected,acutal);
    }

    @Test
    void _24IsPrime() {

        int n = 24;
        boolean expected = false;
        boolean acutal = primeService.isPrime(n);
        assertEquals(expected,acutal);
    }
}