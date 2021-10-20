package com.mycompany.firstproject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@RequestMapping("/")
    public String index(@RequestParam(value="name", defaultValue="Human") String name, @RequestParam(value="last_name", defaultValue="") String last_name) {
		String button="";
		if (!name.equals("Human")) {
			button = "<a href='/'>Go back</a>";
		}
		
        return String.format("<h1>Hello %s %s</h1> <p>Welcome to SpringBoot!</p> %s", name, last_name, button);
    }
}
