package calculator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalcTest {
	
	Calc_backend test = new Calc_backend(); //obj for class calc_backend
	
	//Creating multiple test cases for addition
	@Test
	public void add1() {
		double output = test.add(5, 6); //adding positive integers
		assertEquals(11, output);
	}
	
	@Test
	public void add2() {
		double output = test.add(-6, -4); //adding negative integers
		assertEquals(-10, output);
	}
	
	@Test
	public void add3() {
		double output = test.add(5, -6); //adding positive and negative integers
		assertEquals(-1, output);
	}
	
	@Test
	public void add4() {
		double output = test.add(5.5, 7.3); //adding decimal numbers
		assertEquals(12.8, output);
	}
	
	//Creating multiple test cases for subtraction
	@Test
	public void sub1() {
		double output = test.subtract(46, 23); //subtracting positive integers
		assertEquals(23, output);
	}
	
	@Test
	public void sub2() {
		double output = test.subtract(-26, -23); //subtracting negative integers
		assertEquals(-49, output);
	}
	
	@Test
	public void sub3() {
		double output = test.subtract(26, -23); //subtracting positive integers
		assertEquals(-3, output);
	}
	
	@Test
	public void sub4() {
		double output = test.subtract(26, 23); //subtracting positive integers
		assertEquals(3, output);
	}
}
