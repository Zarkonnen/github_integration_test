package com.example.tests;

import com.thoughtworks.selenium.*;
import java.util.regex.Pattern;

public class efwfewg extends SeleneseTestCase {
	public void setUp() throws Exception {
		setUp("http://www.metafilter.com", "*chrome");
	}
	public void testEfwfewg() throws Exception {
		selenium.open("/");
		selenium.waitForPageToLoad("60000");
	}
}
