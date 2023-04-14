package com.example.demo.controller;

import com.example.demo.service.SomeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/period")
@RequiredArgsConstructor
public class PeriodController {

  private final SomeService someService;

  @GetMapping
  public void period() {
    someService.someLogic();
  }
}
