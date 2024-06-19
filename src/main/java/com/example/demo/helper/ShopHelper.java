package com.example.demo.helper;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ShopHelper {

    public List<String> getBeverages(){
        List<String> beverageList = new ArrayList<>();
        beverageList.add("small coffee");
        beverageList.add("medium coffee");
        beverageList.add("large coffee");
        beverageList.add("orange juice");
        return beverageList;
    }

    public Map<String, Double> getSnacks(){
        Map<String, Double> map = new HashMap<>();
        map.put("bacon roll", 4.5);
        return map;
    }

    public Map<String, Double> getAllItemsPrice(){
        Map<String, Double> map = new HashMap<>();
        map.put("small coffee", 2.5);
        map.put("medium coffee", 3.0);
        map.put("large coffee", 3.5);
        map.put("bacon roll", 4.5);
        map.put("orange juice", 3.95);
        map.put("extra milk", 0.3);
        map.put("foamed milk", 0.5);
        map.put("special roast coffee", 0.9);
        return map;
    }
}
