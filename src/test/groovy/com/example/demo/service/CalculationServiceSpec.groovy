//para probar test de funiconalidades

package com.example.demo.service

import groovy.util.logging.Slf4j
import spock.lang.Specification
import spock.lang.Unroll

@Slf4j
@Unroll
class CalculationServiceSpec extends Specification {

  CalculationService calculationService

  def setup() {
    calculationService = new CalculationService()
  }

  void "if we list all the natural numbers below 10 that are multiples of 3 or 5"() {
    given: "a number"
      Integer number = _number
    when: "the method is called"
      Integer result = calculationService.sum(number)
    then:
      assert result == _result
    where:
      _number || _result
      10      || 23
      4       || 3
      5       || 3
      6       || 8
      13      || 45
  }

  void "Santa's floor"() {
    given: "a list of string"
      String directions = _directions
    when: "the floor where is Santa"
      Integer floor = calculationService.getFloor(directions)
    then:
      assert floor == _result
    where:
      _directions || _result
      "(())"      || 0
      "()()"      || 0
      "((("       || 3
      "(()(()("   || 3
      new File("C:/Users/USUARIO/desktop/spring/demo/src/test/resources/santa.txt").text || 232
  }

  void "The first -1 position of Santa"() {
    given: "a list of strings"
      String directions = _directions
    when: "The floor where is santa"
      Integer position = calculationService.firstBasement(directions)
    then:
      assert position == _result
    where:
      _directions || _result
      ")"         || 1
      "()())"     || 5
      "()()()()())" || 11
      new File("C:/Users/USUARIO/desktop/spring/demo/src/test/resources/santa.txt").text || 1783
  }

}
