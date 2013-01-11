<?php

require_once 'PHPUnit/Extensions/SeleniumTestCase.php';

class Example extends PHPUnit_Extensions_SeleniumTestCase
{
  protected function setUp()
  {
    $this->setBrowser("*chrome");
    $this->setBrowserUrl("http://sebuilder.github.com");
  }

  public function testMyTestCase()
  {
    $this->open("/se-builder/");
    $this->waitForPageToLoad("60000");
  }
}
?>