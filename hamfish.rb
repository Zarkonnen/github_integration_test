require "test/unit"
require "rubygems"
gem "selenium-client"
require "selenium/client"

class Untitled < Test::Unit::TestCase

  def setup
    @verification_errors = []
    @selenium = Selenium::Client::Driver.new \
      :host => "localhost",
      :port => 4444,
      :browser => "*chrome",
      :url => "http://sebuilder.github.com",
      :timeout_in_second => 60

    @selenium.start_new_browser_session
  end
  
  def teardown
    @selenium.close_current_browser_session
    assert_equal [], @verification_errors
  end
  
  def test_untitled
    @selenium.open "/se-builder/"
    @selenium.wait_for_page_to_load "50000"
  end
end
