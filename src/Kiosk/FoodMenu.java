package Kiosk;

import java.awt.*;

public class FoodMenu extends Menu {
    public int key;
    private String name;
    private int price;
    private String catal;

    public FoodMenu(int key, String name, int price, String catal) {
        this.key = key;
        this.name = name;
        this.price = price;
        this.catal = catal;
    }

    public int getKey() {
        return key+1;
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
