package Kiosk;


import java.util.*;

public class Order { //주문 클래스
    //private List<FoodMenu> shop;

    private Map<FoodMenu, Integer> shop;
    private int ordernum;
    private Map<String, Integer> oderMap;
    public Order() {
        // shop = new ArrayList<>();
        shop = new HashMap<>();
        ordernum = 1;
        oderMap = new HashMap<String, Integer>();
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

    public int totalprice() {
        int total = 0;
        for (var menu : shop.entrySet()) {
            total += menu.getKey().getPrice() * menu.getValue();
        }
        return total;
    }

    public void totallist(){
        for(var menu : shop.entrySet()){
            oderMap.put(menu.getKey().getName(),menu.getKey().getPrice());
        }
        System.out.println(oderMap);
    }

    public void totaltime(){
        int totalti = 0;
        for(var menu : shop.entrySet()){
            totalti += menu.getKey().gettime() * menu.getValue();
        }
        int hour = (totalti/60)/60;
        int min = (totalti/60)%60;
        int sec = (totalti%60);
        System.out.println(hour + "시 " + min + "분 " + sec+" 초");

    }

}

