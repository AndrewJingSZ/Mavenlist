//

import javax.jws.WebService;
//import javax.xml.Endpoint;

//@WebService

public class ServiceHello {
	
	public String getValue(String username) {
		
		return "my name is " + username;
	}
    
	//public static void main(String[] args) {
	public static void main(String args[]) {
		
//		Endpoint.publish("http://localhost:8020/Service/ServiceHello", new ServiceHello());
		System.out.println("Service hello success!!!");
	}

}
