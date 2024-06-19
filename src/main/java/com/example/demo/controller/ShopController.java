package com.example.demo.controller;

import com.example.demo.dto.OrderItem;
import com.example.demo.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
public class ShopController {

    @Autowired
    private ShopService shopService;

    @GetMapping(value = "/getOrderItems")
    public ResponseEntity<List<OrderItem>> getOrderItems() {
        List<OrderItem> responseEntity = shopService.getOrderedItems();
        return new ResponseEntity<>(responseEntity, HttpStatus.OK);
    }
}

