package com.tutorialspoint.struts2;

import com.tutorialspoint.struts2.dto.NameList;


public class HelloWorldAction extends NameList {

	   public String execute() throws Exception {
			  return "success";
		   }

}