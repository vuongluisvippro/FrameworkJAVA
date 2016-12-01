package vuongluis.dut.udn.vn.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import vuongluis.dut.udn.vn.spring.lang.Language;
import vuongluis.dut.udn.vn.spring.lang.impl.Vietnamese;

@Configuration
@ComponentScan({"vuongluis.dut.udn.vn.spring.bean"})
public class AppConfiguration {
	@Bean(name="language")
	public Language getLanguage(){
		return new Vietnamese();
	}
}
