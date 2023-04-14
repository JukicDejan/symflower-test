package com.example.demo.service;

import com.example.demo.period.Period;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

import static com.example.demo.utils.DateUtils.numberOfPeriods;

@Service
public class SomeService {

  public void someLogic() {
    LocalDate from = LocalDate.of(2022, 1,1);
    LocalDate to = from.plusYears(1);

    long numberOfPeriods = numberOfPeriods(from, to, Period.DAILY);

    if (numberOfPeriods > 0) {
      System.out.println("yay periods");
    } else {
      System.out.println("Nothing to do");
    }
  }
}
