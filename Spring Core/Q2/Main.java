package que2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[]args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("NewQ2.xml");
		Question question =(Question) context.getBean("question");
		System.out.println(question);
		
		//
		Question1 question1 =(Question1) context.getBean("question1");
		System.out.println(question1);
		
		//
		Question2 question2 =(Question2) context.getBean("question2");
		System.out.println(question2);
	}		
}	