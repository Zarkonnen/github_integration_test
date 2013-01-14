from selenium.webdriver.firefox.webdriver import WebDriver
wd = WebDriver()
wd.implicitly_wait(60)
wd.get("http://sebuilder.github.com/se-builder/fishy")
wd.close()
