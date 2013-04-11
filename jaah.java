package com.example.tests;

import com.thoughtworks.selenium.*;
import java.util.regex.Pattern;

public class wfe extends SeleneseTestCase {
	public void setUp() throws Exception {
		setUp("http://www.metafilter.com", "*chrome");
	}
	public void testWfe() throws Exception {
		selenium.open("/");
		selenium.waitForPageToLoad("aa");
	}
}
