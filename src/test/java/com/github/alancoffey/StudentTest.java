package com.github.alancoffey;

import static org.junit.Assert.*;
import org.joda.time.*;


import org.junit.Test;

public class StudentTest {

	@Test
	public void getUsername() throws Exception {
		DateTime DOB = new DateTime(1995, 8, 16, 0,2,0);
        Student student = new Student("Alan Coffey", 22, 14509053,DOB);
        assertEquals("alan coffey22", student.getUsername());
	}
}
