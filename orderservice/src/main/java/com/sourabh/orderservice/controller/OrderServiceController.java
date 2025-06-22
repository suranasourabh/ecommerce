package com.sourabh.orderservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/rs/v1/")
public class OrderServiceController {

  @GetMapping(path = "/test")
  public ResponseEntity<String> test() {
    return ResponseEntity.ok("Order service running");
  }
}
