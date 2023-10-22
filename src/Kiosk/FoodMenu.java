package Kiosk;

import java.awt.*;

public class FoodMenu extends Menu {
    private int key;
    private String name;
    private int price;
    private String catal;

    public FoodMenu(int key, String name, int price, String catal) {
        this.key = key;
        this.name = name;
        this.price = price;
        this.catal = catal;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getCatal() {
        return catal;
    }
}
