package Kiosk;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Order { //주문 클래스
    //private List<FoodMenu> shop;

    private Map<FoodMenu, Integer> shop;
    private int ordernum;

    public Order() {
        // shop = new ArrayList<>();
        shop = new HashMap<>();
        ordernum = 1;
    }

    public int getOrdernum() {
        return ordernum;
    }


    public void setOrdernum(int ordernum) {
        this.ordernum = ordernum;
    }

    public void addshop(FoodMenu menu) {
        shop.putIfAbsent(menu, 0);
        shop.computeIfPresent(menu, (key, value) -> {
            return value + 1;
        });
    }

    public Map<FoodMenu,Integer> getShop() {
        return shop;
    }

    public void Outshop() {
        shop.clear();
    }

    public void Receipt(){

    }

    public int totalprice() {
        int total = 0;
        for (var menu : shop.entrySet()) {
            total += menu.getKey().getPrice() * menu.getValue();
        }
        return total;
    }
}

