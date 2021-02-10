package dateassigment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller

public class MyController {
    @GetMapping("/date")
    @ResponseBody
    public String calcDate(@RequestParam int year, int month, int day){
        CalculateDate calcdate = new CalculateDate();
        return "" + calcdate.calcdate(year, month, day);
    }
}
