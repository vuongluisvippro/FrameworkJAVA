package vuongluis.dut.udn.vn.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyComponent {
	
	@Autowired
	private MyReponsitory reponsitory;
	
	public void showAppInfo(){
		System.out.println("Now is: "+ reponsitory.getSystemDateTime());
        System.out.println("App Name: "+ reponsitory.getAppName());
	}
}
