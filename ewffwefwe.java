package com.example.tests;

import com.thoughtworks.selenium.*;
import java.util.regex.Pattern;

public class ewffwefwe extends SeleneseTestCase {
	public void setUp() throws Exception {
		setUp("http://www.metafilter.com", "*chrome");
	}
	public void testEwffwefwe() throws Exception {
		selenium.open("/");
		selenium.waitForPageToLoad("60000");
	}
}
