package example.prometheus;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class ExamController {

    @GetMapping("/exam")
    public String exam() {
        return "exam";
    }
}
