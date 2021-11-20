package corequestion5.resourceAnno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ResMain {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("resource-annotation.xml");
		 
		Employee emp = ac.getBean("myemployee", Employee.class);
        System.out.println(emp.toString());
        ClassPathXmlApplicationContext cxt = (ClassPathXmlApplicationContext)ac;
		cxt.close();

	}

}
