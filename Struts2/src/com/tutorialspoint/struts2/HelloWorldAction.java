package com.tutorialspoint.struts2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.tutorialspoint.struts2.DataList.SanpleDataArrayList;
import com.tutorialspoint.struts2.chek.UserLogin;
import com.tutorialspoint.struts2.dto.NameList;

/**
 *
 * ログ出力テストメイン
 *
 * @author inokou
 *
 */
public class HelloWorldAction extends NameList {

	private final Logger logger = LogManager.getLogger(HelloWorldAction.class);

	public String execute() throws Exception {

		logger.trace("ログ出力テスト＝トランク");
		logger.debug("デバッグモード出力");

		// テスト出力
		SanpleDataArrayList sanpleDataArrayList = new SanpleDataArrayList();

		logger.info(sanpleDataArrayList.getArrayListData());
		logger.info(sanpleDataArrayList.getHashMapData());

		UserLogin userLogin = new UserLogin();

		// 入力値チェック
		boolean adderesRet = userLogin.addressSet(this.getAddress());
		boolean nameRet = userLogin.nameSet(this.getName());

		if (adderesRet == true && nameRet == true) {
			this.setRetMessage("成功でーーーす");
			return "success";
		} else {
			this.setRetMessage("つまりは失敗ってこと！[住所=" + adderesRet + "][名前="
					+ nameRet + "]");
			return "failure";
		}

	}

}