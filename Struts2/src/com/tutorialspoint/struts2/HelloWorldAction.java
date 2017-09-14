package com.tutorialspoint.struts2;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

import com.tutorialspoint.struts2.dto.NameListInterfice;

public abstract class HelloWorldAction extends HttpServlet  implements NameListInterfice {

	// ①Loggerを取得
	private static Logger logger = Logger.getLogger("HelloWorldAction");

	public HelloWorldAction() {
		// 設定ファイルを読み込む
		DOMConfigurator.configure("log4j.xml");

		// プロパティファイルのパスを取得する
        ServletContext context = this.getServletContext();
		DOMConfigurator.configure(context.getRealPath("log4j.xml"));

/*		String rootPath = "./WEB-INF/log4j.xml";
		System.setProperty("user.dir", rootPath);

		Properties props = ...; // どこかから持ってくる！

		PropertyConfigurator.configure(props.toString());
*/	}

	public String execute() throws Exception {


		logger.info("テスト開始ログ");
		return "success";
	}

}