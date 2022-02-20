package que6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
    @Autowired
    private Serviceclass serviceclass;

    @GetMapping("/add/{a}/{b}")
    public String Addition(@PathVariable("a") int a, @PathVariable("b") int b) {
        return ("Addition of " + a + " and " + b + " = " + serviceclass.Addition(a, b));
    }

    @GetMapping("/sub/{a}/{b}")
    public String Subtraction(@PathVariable("a") int a, @PathVariable("b") int b) {
        return ("Subtraction of " + a + " by " + b + " = " + serviceclass.subtraction(a, b));
    }

    @GetMapping("/mul/{a}/{b}")
    public String Multiplication(@PathVariable("a") int a, @PathVariable("b") int b) {
        return ("Multiplication of " + a + " and " + b + " = " + serviceclass.multiplication(a, b));
    }

    @GetMapping("/div/{a}/{b}")
    public String Division(@PathVariable("a") int a, @PathVariable("b") int b) {
        return ("Division of " + a + " and " + b + " = " + serviceclass.division(a, b));
    }

    @GetMapping("/sqrt/{a}")
    public String SquareRoot(@PathVariable("a") int a) {
        return ("SquareRoot of " + a + " = " + serviceclass.square(a));
    }

}

