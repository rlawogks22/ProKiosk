package Kiosk;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MainMenu {
    List<FoodMenu> coffeMenu = new ArrayList<>();
    List<FoodMenu> teeMenu = new ArrayList<>();
    List<FoodMenu> adeMenu = new ArrayList<>();
    Order order = new Order();
    Scanner scd = new Scanner(System.in);
    public MainMenu(){
        coffeMenu.add((new FoodMenu(0,"아메리카노" ,2500,"아메리카노")));
        coffeMenu.add((new FoodMenu(0,"에스프레소" ,1500,"에스프레소")));
        coffeMenu.add((new FoodMenu(0,"카페모카" ,1800,"카페모카")));
        coffeMenu.add((new FoodMenu(0,"카페라떼" ,1900,"카페라떼")));
        coffeMenu.add((new FoodMenu(0,"콜드브루" ,2000,"콜드브루")));


        teeMenu.add((new FoodMenu(0,"아이스티" ,3000,"아이스티")));
        teeMenu.add((new FoodMenu(0,"허브티" ,2500,"허브티")));
        teeMenu.add((new FoodMenu(0,"생강차" ,2000,"생강차")));
        teeMenu.add((new FoodMenu(0,"홍차" ,4000,"홍차")));

        adeMenu.add((new FoodMenu(0,"레몬에이드" ,3000,"레몬에이드")));
        adeMenu.add((new FoodMenu(0,"자몽에이드" ,2500,"자몽에이드")));
        adeMenu.add((new FoodMenu(0,"청포도에이드" ,2500,"청포도에이드")));
        adeMenu.add((new FoodMenu(0,"블루에이드" ,3300,"블루에이드")));
        adeMenu.add((new FoodMenu(0,"자두에이드" ,3100,"자두에이드")));

    }


    public void showMenu(){
        System.out.println(" == 과제 카페 == ");
        System.out.println(" == 메뉴판 ==");
        System.out.println();
        System.out.println("1. Coffe");
        System.out.println("2. Tee");
        System.out.println("3. Ade");
        System.out.println("=======================================");
        System.out.print("4. 주문   5. 주문취소");
        System.out.println();
        System.out.println("=======================================");
        System.out.println(" == 장바구니 메뉴 ==");
        Map<FoodMenu,Integer> shop = order.getShop();
        //List<FoodMenu> shop = order.getShop();
        for(FoodMenu menu : shop.keySet()){
            int i = 0;
            System.out.println(menu.getName()+", "+ menu.getPrice() +", " + shop.get(menu) + "개");
        }


//        for(Map.Entry<FoodMenu, Integer> entry : shop.entrySet()) {
//            System.out.println(entry.getValue() + entry.getKey());
//        }

//        for(int i = 0; i<shop.size(); i++){
//            //FoodMenu menu = shop.get(i);
//            FoodMenu menu = shop.get(i);
//            System.out.print(menu.getName()+ ","  + menu.getPrice());
//        }
        System.out.println("총 값 : " + order.totalprice()+" 원");
        System.out.println("=======================================");
        System.out.print("번호 입력 : ");
        int ch = scd.nextInt();
        scd.nextLine();

        switch (ch){
            case 1:
                showCoffe();
                break;
            case 2:
                showTee();
                break;
            case 3:
                showAde();
                break;
            case 4:
                showOrder();
                break;
            case 5:
                OrderCancel();
                break;
            default:
                System.out.println("1~5까지 입력 가능합니다.");
                break;
        }
    }
    public void showCoffe(){
        System.out.println();
        System.out.println("Coffe");
        for(int i = 0; i<coffeMenu.size(); i++){
            FoodMenu menu = coffeMenu.get(i);
            System.out.println((i+1) + ", " + menu.getName() +" , " + menu.getPrice() + "," + menu.getCatal());
        }
        System.out.print("상품선택 : ");
        int chCoffe = scd.nextInt();
        scd.nextLine();
        int coffeInfo = chCoffe -1;

        FoodMenu scCoffe = coffeMenu.get(coffeInfo);
        System.out.println(scCoffe.getName() + "|" + scCoffe.getPrice());
        System.out.print("장바구니 추가 : ");
        System.out.println("1. 추가  2. 취소");

        int ch = scd.nextInt();
        scd.nextLine();

        if(ch == 1){
            order.addshop(scCoffe);
            System.out.println(scCoffe.getName() + " 장바구니 추가");
            System.out.println();
        } else if (ch == 2 ) {
            System.out.println("추가 취소");
        } else System.out.println("입력 오류");

        showMenu();
    }
    public void showTee(){
        System.out.println();
        System.out.println("Tee");
        for(int i = 0; i<teeMenu.size(); i++){
            FoodMenu menu = teeMenu.get(i);
            System.out.println((i+1) + ", " + menu.getName()  +" , " +  menu.getPrice() + "," + menu.getCatal());
        }
        System.out.print("상품선택 : ");
        int chTee = scd.nextInt();
        scd.nextLine();
        int TeeInfo = chTee -1;

        FoodMenu scTee = teeMenu.get(TeeInfo);
        System.out.println(scTee.getName() + "|" + scTee.getPrice());
        System.out.print("장바구니 추가 : ");
        System.out.println("1. 추가  2. 취소");

        int ch = scd.nextInt();
        scd.nextLine();

        if(ch == 1){
            order.addshop(scTee);
            System.out.println(scTee.getName() + " 장바구니 추가");
            System.out.println();
        } else if (ch == 2 ) {
            System.out.println("추가 취소");
        } else System.out.println("입력 오류");

        showMenu();
    }
    public void showAde(){
        System.out.println();
        System.out.println("Ade");
        for(int i = 0; i<adeMenu.size(); i++){
            FoodMenu menu = adeMenu.get(i);
            System.out.println((i+1) + ", " + menu.getName()  +" , " +  menu.getPrice() + "," + menu.getCatal());
        }
        System.out.print("상품선택 : ");
        int chAde = scd.nextInt();
        scd.nextLine();
        int AdeInfo = chAde -1;

        FoodMenu scAde = adeMenu.get(AdeInfo);
        System.out.println(scAde.getName() + "|" + scAde.getPrice());
        System.out.print("장바구니 추가 : ");
        System.out.println("1. 추가  2. 취소");

        int ch = scd.nextInt();
        scd.nextLine();

        if(ch == 1){
            order.addshop(scAde);
            System.out.println(scAde.getName() + " 장바구니 추가");
            System.out.println();
        } else if (ch == 2 ) {
            System.out.println("추가 취소");
        } else System.out.println("입력 오류");
        showMenu();
    }

    public void showOrder(){ //장바구니
        System.out.println("주문 확인 ");
        System.out.println("[ 주문 ]");
        Map<FoodMenu,Integer> shop = order.getShop();
        //List<FoodMenu> shop = order.getShop();

//        for(int i = 0; i<shop.size(); i++){
//            FoodMenu menu = shop.get(i);
//            System.out.println(menu.getName() + menu.getPrice() + "," + menu.getCatal());
//        }
        System.out.println();
        System.out.println(" 총 값");
        System.out.println(order.totalprice() + "원 ");

        System.out.println("1.주문  2. 메뉴판");
        int chnum = scd.nextInt();
        scd.nextLine();

        if(chnum == 1){
            OrderComplte();
        } else if (chnum == 2) {
            showMenu();
        }
    }

    public void OrderComplte(){
        int ordernum = order.getOrdernum();

        System.out.println("주문 완료");



        order.Outshop();
        order.setOrdernum(ordernum + 1);

        showMenu();
    }

    public void OrderCancel(){
        System.out.println("주문취소");
        System.out.println("1,확인   2. 취소");

        int canclenum = scd.nextInt();
        scd.nextLine();

        if(canclenum == 1){
            order.Outshop();
            System.out.println("주문 취소 완료");
        } else if(canclenum == 2){
            System.out.println("메뉴판 복귀 ");
        }
        showMenu();
    }
}