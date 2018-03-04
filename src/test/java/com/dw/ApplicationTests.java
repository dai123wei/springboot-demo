package com.dw;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dw.Application;
import com.dw.service.BlogProperties;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
public class ApplicationTests {

	@Autowired
	private BlogProperties blogProperties;
	
	private static Log log = LogFactory.getLog(ApplicationTests.class);

	@Test
	public void getHello() throws Exception {
		Assert.assertEquals(blogProperties.getName(), "程序员DW");
		Assert.assertEquals(blogProperties.getTitle(), "Spring Boot教程");
		System.out.println(blogProperties.getDesc());
		
		log.info("随机数测试输出：");
		log.info("随机字符串 : " + blogProperties.getValue());
		log.debug("随机int : " + blogProperties.getNumber());
		log.info("随机long : " + blogProperties.getBignumber());
		log.info("随机10以下 : " + blogProperties.getTest1());
		log.info("随机10-20 : " + blogProperties.getTest2());
	}

}
