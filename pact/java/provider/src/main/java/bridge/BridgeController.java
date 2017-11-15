package bridge;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/perform-rocks")
public class BridgeController {

    private static final String template = "Perform %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(method=RequestMethod.GET)
    public @ResponseBody Bridge sayPerform(@RequestParam(value="name", required=false, defaultValue="Rocks") String name) {
        return new Bridge(counter.incrementAndGet(), String.format(template, name));
    }

}