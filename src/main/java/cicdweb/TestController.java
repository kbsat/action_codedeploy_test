package cicdweb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/")
	public String test() {
		String str = "Hello CI/CD";
		System.out.println(str);
		return str;
	}
}
