package mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/account")
public class LogoutController {
	@RequestMapping("/logout.do")
	public String accountLogoutHandle(){
		String a = "hi";
		return "account/logout";
	}
}
