package com.xmltostring.main;

import java.io.IOException;

public class App {
	public static void main(String[] args) {

		CCTransactionData data = new CCTransactionData();

		try {
			data.sendPOST();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
