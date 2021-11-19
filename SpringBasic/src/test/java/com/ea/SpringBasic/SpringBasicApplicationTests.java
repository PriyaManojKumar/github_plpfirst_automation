package com.ea.SpringBasic;

import com.ea.SpringBasic.pages.HomePage;
import com.ea.SpringBasic.pages.LoginPage;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBasicApplicationTests {

	@Test
	void contextLoads() {

		HomePage page =  new HomePage();
		LoginPage loginpage =page.ClickLogin();
		loginpage.ClickLogin();
	}

}
