package com.moblog.dev;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class BlogController {
    @GetMapping({"/","/blogs"})
       public String blogs(){
         return "blog";
    }
@GetMapping("/blog")
public String blog() {
    return "blog";
}

@GetMapping("/add-blog")
public String addBlog() {
    return "add-blog";
}

}
