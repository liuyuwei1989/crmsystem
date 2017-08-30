package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.crm.mapper.BasDictMapper;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml","springmvc-config.xml");
		
		BasDictMapper basDictMapper = (BasDictMapper)context.getBean("basDictMapper");
		
		System.out.println(basDictMapper.selectByPrimaryKey(2).getDictIsEditable());
	}
}
