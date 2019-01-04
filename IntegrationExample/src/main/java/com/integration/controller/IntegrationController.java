package com.integration.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IntegrationController {

	@PostMapping(value = "/ccTransactionData")
	@ResponseBody
	public String getData(HttpServletRequest request, @RequestBody String data) {

		System.out.println(data);
		try {
			String prevURL = "";
			String decodeURL = data;
			String status = null;
			while (!prevURL.equals(decodeURL)) {
				prevURL = decodeURL;
				decodeURL = URLDecoder.decode(decodeURL, "UTF-8");
				System.out.println("decode dATA="+decodeURL);
				status = decodeURL.replace("initial", "APPROVED");
			}
			return status;
		} catch (UnsupportedEncodingException e) {
			return "Issue while decoding" + e.getMessage();
		}
		

	}

}
