@RestController
public class HomeController {
    @GetMapping("/")
    public String greet() {
        return "Welcome to the Prime Number API!";
    }
}
