package com.tutorialspoint.struts2;

import org.apache.log4j.Logger;

public class HelloWorldAction {

	// ①Loggerを取得
	private static Logger logger = Logger.getLogger("HelloWorldAction");

		private String name;
		private String address;

	   public String execute() throws Exception {
		   logger.info("テスト開始ログ");
		   return "success";
	   }

	   public String getName() {
		  return name;
	   }

	   public void setName(String name) {
		  this.name = name;
	   }

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

}