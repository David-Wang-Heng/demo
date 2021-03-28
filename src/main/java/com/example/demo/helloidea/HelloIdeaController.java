package com.example.demo.helloidea;
/*
 * @author wang heng
 * @date 2021/3/28-8:43
 *
 */

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloIdeaController {

    @GetMapping("/helloidea")
    public String helloidea(){
        return "hello,idea,how are you?";
    }

}
