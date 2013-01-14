using System;
using System.Text;
using System.Text.RegularExpressions;
using System.Threading;
using NUnit.Framework;
using Selenium;

namespace SeleniumTests
{
	[TestFixture]
	public class Untitled
	{
		private ISelenium selenium;
		private StringBuilder verificationErrors;
		
		[SetUp]
		public void SetupTest()
		{
			selenium = new DefaultSelenium("localhost", 4444, "*chrome", "http://sebuilder.github.com");
			selenium.Start();
			verificationErrors = new StringBuilder();
		}
		
		[TearDown]
		public void TeardownTest()
		{
			try
			{
				selenium.Stop();
			}
			catch (Exception)
			{
				// Ignore errors if unable to close the browser
			}
			Assert.AreEqual("", verificationErrors.ToString());
		}
		
		[Test]
		public void TheUntitledTest()
		{
			selenium.Open("/se-builder/");
			selenium.WaitForPageToLoad("50000");
		}
	}
}
