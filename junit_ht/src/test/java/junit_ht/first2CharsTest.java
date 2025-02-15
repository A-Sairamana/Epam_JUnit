 package junit_ht;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;




class first2CharsTest {
	
	TestString tStr;
	
	@BeforeEach
	void setUp()
	{
		tStr=new TestString();
	}

	@Test
	void test1A() {
		 assertEquals("BCD",tStr.checkFirst2Chars("ABCD"));
	}
	
	@Test
	void test2A() {
		 assertEquals("CD",tStr.checkFirst2Chars("AACD"));
	}
	
	@Test
	void test1Ain2Position() {
		 assertEquals("BCD",tStr.checkFirst2Chars("BACD"));
	}
	
	@Test
	void testNoA() {
		 assertEquals("BCD",tStr.checkFirst2Chars("BBAA"));
	}
	
	@Test
	void test2ANLength() {
		 assertEquals("BAA",tStr.checkFirst2Chars("AABAA"));
	}
	
	void testA() {
		 assertEquals("",tStr.checkFirst2Chars("A"));
	}
	
	@Test
	void emptyString() {
		 assertEquals("",tStr.checkFirst2Chars(""));
	}
	

}
