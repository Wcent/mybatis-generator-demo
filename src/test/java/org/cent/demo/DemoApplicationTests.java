package org.cent.demo;

import lombok.extern.slf4j.Slf4j;
import org.cent.demo.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
class DemoApplicationTests {

	@Autowired
	private UserMapper userMapper;

	@Test
	void contextLoads() {
	}

	@Test
	void testUserMapper() {
		log.info(userMapper.selectByPrimaryKey(1).getName());
	}

}
