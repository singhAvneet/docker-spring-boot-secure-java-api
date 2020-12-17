package api;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    private Greeting g1,g2;
    private Greeting[] g;
    List<Greeting> arrayList ;

//    @RequestMapping("/greeting")
//    public ArrayList greeting(@RequestParam(value="result", defaultValue="20") Integer result)  {
//        return  new Greeting().getArrayList(result);
//    }
//http://localhost:8080/greeting?result=jasp
//    @RequestMapping("/greeting")
//    public String greeting(@RequestParam(value="result", defaultValue="World") String result)  {
//        return template+" "+result;
//    }

    @PostMapping(value = "/greeting", consumes = "application/json", produces = "application/json")
    public Object createPerson(@RequestBody Object person) {
        return person;
    }


}