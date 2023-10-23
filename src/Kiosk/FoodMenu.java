package Kiosk;

import java.awt.*;

public class FoodMenu extends Menu {
    private int time;
    private String name;
    private int price;
    private String catal;

    public FoodMenu(int time, String name, int price, String catal) {
        this.time = time;
        this.name = name;
        this.price = price;
        this.catal = catal;
    }

    public int gettime() {
        return time;
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
