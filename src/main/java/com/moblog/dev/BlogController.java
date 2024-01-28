package com.moblog.dev;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class BlogController {
    @GetMapping({"/","/blogs"})
       public String blogs(){
         return "blogs";
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
