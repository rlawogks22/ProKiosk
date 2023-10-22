package Kiosk;

import java.util.ArrayList;
import java.util.List;

public class Order { //주문 클래스
    private List<FoodMenu> shop;
    private int ordernum;
    public Order(){
        shop = new ArrayList<>();
        ordernum = 1;
    }
    public List<FoodMenu> getShop(){return shop;}
    public int getOrdernum(){return ordernum;};
    public void setOrdernum(int ordernum){this.ordernum = ordernum;}
    public void addshop(FoodMenu menu){shop.add(menu);}
    public void Outshop(){shop.clear();}
    public int totalprice(){
        int total = 0;
        for(FoodMenu menu : shop){
            total += menu.getPrice();
        }
        return total;
    }
}

