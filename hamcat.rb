require 'rubygems'
require 'selenium-webdriver'
wd = Selenium::WebDriver.for :firefox

wd.get "http://sebuilder.github.com/se-builder/"
wd.find_element(:id, "ioj").submit
wd.quit
