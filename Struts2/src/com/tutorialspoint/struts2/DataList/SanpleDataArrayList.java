package com.tutorialspoint.struts2.DataList;

import java.util.ArrayList;
import java.util.HashMap;

public class SanpleDataArrayList {

	public SanpleDataArrayList() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public String getArrayListData() {

		//データの設定
		ArrayList<String> testdata = new ArrayList<String>();

		testdata.add("でーた１");
		testdata.add("でーた２");
		testdata.add("でーた３");
		testdata.add("でーた４");
		testdata.add("でーた５");
		testdata.add("でーた６");
		testdata.add("でーた７");

		//データの取り出し
		String ret = testdata.get(3);

		//値の返却
		return ret;

	}

	public String getHashMapData() {

		//データの設定
		HashMap<String,String> dataMap = new HashMap<String,String>();

		dataMap.put("name", "名前");
		dataMap.put("add", "住所");
		dataMap.put("tel", "電話番号");

		//データの取り出し
		String ret = dataMap.get("name");

		//値の返却
		return ret;

	}


}
