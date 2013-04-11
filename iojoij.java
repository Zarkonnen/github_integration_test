package com.example.tests;

import com.thoughtworks.selenium.*;
import java.util.regex.Pattern;

public class jaah extends SeleneseTestCase {
	public void setUp() throws Exception {
		setUp("http://www.metafilter.com", "*chrome");
	}
	public void testJaah() throws Exception {
		selenium.open("/");
		selenium.waitForPageToLoad("aa");
	}
}
