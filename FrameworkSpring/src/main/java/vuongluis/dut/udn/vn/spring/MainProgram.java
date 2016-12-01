package vuongluis.dut.udn.vn.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import vuongluis.dut.udn.vn.spring.bean.GreetingService;
import vuongluis.dut.udn.vn.spring.bean.MyComponent;
import vuongluis.dut.udn.vn.spring.config.AppConfiguration;
import vuongluis.dut.udn.vn.spring.lang.Language;

@SuppressWarnings("all")
public class MainProgram {
	public static void main(String[]args){
		// Tạo ra một đối tượng ApplicationContext bằng cách đọc cấu hình
		// trong class AppConfiguration
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
		
		System.out.println("------------");
		Language language = (Language) context.getBean("language");
		
		System.out.println("Bean Language: "+language);
		System.out.println("Call language.sayBye(): "+ language.getByte());
	      
		System.out.println("----------");
  
		GreetingService service = (GreetingService) context.getBean("greetingService");
  
 
        service.sayGreeting();
  
        System.out.println("----------");
  
        MyComponent myComponent = (MyComponent) context.getBean("myComponent");
  
        myComponent.showAppInfo();
	}
}
