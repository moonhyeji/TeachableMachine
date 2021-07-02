package com.kh.bnpp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class MachineController {

	
	@RequestMapping(value = "/machine.do", method = RequestMethod.GET)
	public String machine() {
		
		return "machine";
	}
	

}
