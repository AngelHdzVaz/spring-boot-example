package com.example.demo.service

import groovy.util.logging.Slf4j
import org.springframework.stereotype.Service



@Slf4j
@Service
class CalculationService{

	Integer sum(Integer numValue){
		(0..<numValue).inject(0) { Integer numero, num ->
			if(num%3 == 0 || num%5 == 0)
				numero += num
			numero
		}
	}

	Integer getFloor(String s){
		Integer floor = 0
		s.each{ parenthesis ->
			if(parenthesis == "(")
				floor = floor + 1
			else
				floor = floor - 1
		}
		floor
	}

	Integer firstBasement(String s){
		Integer floor = 0
		Integer position = 0
		char valString;
		for(int x =0; x < s.length();x++){
			valString = s.charAt(x);
			if(valString == "("){
				floor = floor + 1
				position++;	
			}else{
				floor = floor - 1
				position++;
			}
			if(floor==-1){
				break
			}

		}
		position
	}

}