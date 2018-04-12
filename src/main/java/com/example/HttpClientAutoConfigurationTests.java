package com.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;



@RestController
//public class HttpClientAutoConfigurationTests {
public class HttpClientAutoConfigurationTests {
	
	

	@RequestMapping({"/"})
	
	String index()
	  {
	    return "Hello from tierCall";
	  }
	
	//@RequestMapping({"/HttpCall/{id}"})
	
	@RequestMapping({"/HttpCall"})
	
	//void threadCallOut(@PathVariable("id") String id) throws InterruptedException
	
	void threadCallOut() throws InterruptedException
	  {
		
		String var1;
		
		//String id = var1;
		String var2;
		//String name = var2;
		//System.out.println("ID from URL is " + id);
		////String url = "http://localhost:8080/tiercall?id=" + id + "&name=netstorm";
		boolean endLoop = false;
		String url = "http://localhost:8080/tiercall";
		System.out.println("URL is " + url);
//		String url1 = "http://10.10.30.30:17010/crs/storeus/browse/productDetailColorSizePicker.jsp?categoryNavIds=catMen%3acatMenShirts&categoryNav=true&navAction=jump&navCount=0&productId=prod10002&categoryId=catMenShirts";
	while (true) {
		for (int i=0; i< 100; i++) {
			
	
		HttpClient client = HttpClientBuilder.create().build();
		HttpGet request = new HttpGet(url);
//		 HttpGet request1 = new HttpGet(url1);
		// add request header
		//request.addHeader("User-Agent", USER_AGENT);
		HttpResponse response = null;
//		HttpResponse response1 = null;
		try {
			response = client.execute(request);
		//	response1 = client.execute(request1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	//	System.out.println("Response Code : " + response.getStatusLine().getStatusCode());

		System.out.println("Header  " + response.getAllHeaders());
//		System.out.println("Header Response1  " + response1.getAllHeaders());

}
}
		}
		}



