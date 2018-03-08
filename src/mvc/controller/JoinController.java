package mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/account")
public class JoinController {

	@RequestMapping("/join")
	public String accountJoinHandle(){
		return "account/join";
	}
}
