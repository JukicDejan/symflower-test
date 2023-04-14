package com.example.demo.utils;

import com.example.demo.period.Period;
import java.time.LocalDate;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class DateUtilsSymflowerTest {
	@Test
	public void numberOfPeriods1() {
		LocalDate from = null; // TODO This is a fallback value due to incomplete analysis.
		LocalDate to = null; // TODO This is a fallback value due to incomplete analysis.
		Period period = null; // TODO This is a fallback value due to incomplete analysis.
		long expected = 0L; // TODO This is a fallback value due to incomplete analysis.
		long actual = DateUtils.numberOfPeriods(from, to, period);

		assertEquals(expected, actual);
	}
}
