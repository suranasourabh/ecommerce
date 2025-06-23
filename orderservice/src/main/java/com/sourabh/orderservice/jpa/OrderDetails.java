package com.sourabh.orderservice.jpa;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDateTime;

@Table(name = "order_details")
@Entity
@Data
public class OrderDetails {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Integer id;
  @Column(name = "order_number", nullable = false)
  String orderNumber;
  @Column(name = "customer_id", nullable = false)
  String customerId;
  @Column(name = "order_date", nullable = false)
  LocalDateTime orderDate;
  @Column(name = "order_status", nullable = false)
  String orderStatus;
}
