package com.example.demo.service;

import com.example.demo.dto.OrderItem;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ShopService {

    List<OrderItem> getOrderedItems();

}
