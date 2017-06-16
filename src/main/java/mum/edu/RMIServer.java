package mum.edu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RMIServer {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"springconfigserver.xml");
		System.out.println("Server is running ...");
	}
}
