package practicum1.demo;

import practicum1.demo.service.IPrimeService;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/primes")
public class PrimeController {
    IPrimeService primeService;
    public PrimeController(IPrimeService primeService)
    {
        this.primeService = primeService;
    }

    @GetMapping("/{n}")
    public boolean isPrime(@PathVariable int n){
        return primeService.isPrime(n);
    }
} {
    
}
