require 'rubygems'
require 'selenium-webdriver'
wd = Selenium::WebDriver.for :firefox

wd.get "http://sebuilder.github.com/se-builder/fish"
wd.quit
