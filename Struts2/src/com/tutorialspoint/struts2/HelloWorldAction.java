package com.tutorialspoint.struts2;

import com.tutorialspoint.struts2.chek.UserLogin;
import com.tutorialspoint.struts2.dto.NameList;


public class HelloWorldAction extends NameList {

	   public String execute() throws Exception {

		   UserLogin userLogin = new UserLogin();

		   //入力値チェック
		   boolean adderesRet = userLogin.addressSet(this.getAddress());
		   boolean nameRet = userLogin.nameSet(this.getName());

		   if(adderesRet == true && nameRet == true){
			   this.setRetMessage("成功でーーーす");
			   return "success";
		   }else{
			   this.setRetMessage("つまりは失敗ってこと！[住所=" + adderesRet + "][名前=" + nameRet + "]");
			   return "failure";
		   }




	   }

}