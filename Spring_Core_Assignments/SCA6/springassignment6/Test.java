package springassignment6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext con= new AnnotationConfigApplicationContext(DBConfig.class);
		BasicDataSource ds= (BasicDataSource) con.getBean("dataSource");
		System.out.println(ds);

	}

}
