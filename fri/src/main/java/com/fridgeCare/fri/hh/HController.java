package com.fridgeCare.fri.hh;


import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
@RequestMapping("/hh")
public class HController {
	@RequestMapping("/main.fri")
	public String getMain(HttpSession s) {
		
		return "hh/main";
	}
	@RequestMapping("/joinpage.fri")
	public String joinpage() {
		
		return "hh/joinpage";
	}
	@RequestMapping("/idCheck.fri")
	@ResponseBody
	public String idcheck(String id) {
		String view = "{\"result\" : \"NO\"}";
//		int cnt = mDao.idcheck(id);
//		if(cnt == 0) {
//			view = "{\"result\" : \"OK\"}";
//		}
		return view;
	}
}
