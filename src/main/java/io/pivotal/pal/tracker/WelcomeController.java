package io.pivotal.pal.tracker;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    private String wellcomMessage;

    public WelcomeController(@Value("${welcome.message}") String wellcomMessage) {
        this.wellcomMessage = wellcomMessage;
    }

    @GetMapping("/")
    public String sayHello() {
        return wellcomMessage;
    }
}
