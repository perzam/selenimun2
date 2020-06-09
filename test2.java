package com.example.tests;

import com.thoughtworks.selenium.Selenium;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.regex.Pattern;
import static org.apache.commons.lang3.StringUtils.join;

public class UntitledTestCase {
	private Selenium selenium;

	@Before
	public void setUp() throws Exception {
		WebDriver driver = new FirefoxDriver();
		String baseUrl = "https://www.google.com/";
		selenium = new WebDriverBackedSelenium(driver, baseUrl);
	}

	@Test
	public void testUntitledTestCase() throws Exception {
		selenium.open("http://glpi.perzam.com.co/");
		selenium.type("id=login_password", "s0p0rt3.P3rZ4m.&2");
		selenium.type("id=login_name", "perzam");
		selenium.click("name=submit");
		selenium.click("link=Volver a conectarse");
		selenium.click("id=login_name");
		selenium.type("id=login_name", "admin");
		selenium.type("id=login_password", "s0p0rt3");
		selenium.sendKeys("id=login_password", "${KEY_ENTER}");
		selenium.click("link=Volver a conectarse");
		selenium.type("id=login_name", "glpi");
		selenium.type("id=login_password", "s0p0rt3.P3rZ4m.&2");
		selenium.sendKeys("id=login_password", "${KEY_ENTER}");
		selenium.click("id=page");
		selenium.click("//div[@id='bloc']/div[2]");
		selenium.click("link=Volver a conectarse");
		selenium.type("id=login_name", "glpi");
		selenium.type("id=login_password", "s0p0rt3.P3rZ4m");
		selenium.sendKeys("id=login_password", "${KEY_ENTER}");
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
