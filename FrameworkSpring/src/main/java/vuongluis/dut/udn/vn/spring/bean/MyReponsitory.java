package vuongluis.dut.udn.vn.spring.bean;

import java.util.Date;

import org.springframework.stereotype.Repository;

@Repository
public class MyReponsitory {
	
	public String getAppName(){
		return "Hello Spring App";
	}
	
	public Date getSystemDateTime(){
		return new Date();
	}
}
