package workspace.springframework.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping({"","/","Index"})
	public String getValue() {
		
		return "Index";
	}
}
