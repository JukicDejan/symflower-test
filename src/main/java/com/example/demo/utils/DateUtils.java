package com.example.demo.utils;

import com.example.demo.period.Period;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateUtils {
  public static long numberOfPeriods(LocalDate from, LocalDate to, Period period) {
    switch (period) {
      case DAILY: return ChronoUnit.DAYS.between(from, to);
      case MONTHLY: return ChronoUnit.MONTHS.between(from, to);
      case YEARLY: return ChronoUnit.YEARS.between(from, to);
      default: return 0;
    }
  }
}
