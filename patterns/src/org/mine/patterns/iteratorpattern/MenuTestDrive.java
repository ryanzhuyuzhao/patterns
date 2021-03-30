package org.mine.patterns.iteratorpattern;

import java.util.ArrayList;

/**
 * @ClassName MenuTestDrive
 * @Description
 * @Author Administrator
 * @Date 2021/3/30 0030 19:56
 * @Version 1.0
 */
public class MenuTestDrive {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        pancakeHouseMenu.setMenuItems(new ArrayList<MenuItem>());
        pancakeHouseMenu.getMenuItems().add(new MenuItem("K&B's Pancake Breakfast","Pancakes with scrambled eggs, and toast",true,2.99));
        pancakeHouseMenu.getMenuItems().add(new MenuItem("Regular Panckae Breakfast","Pancakes with fried eggs, sausage",false,2.99));
        pancakeHouseMenu.getMenuItems().add(new MenuItem("Blueberry Pancakes","Pancakes made with fresh blueberries",true,3.49));
        pancakeHouseMenu.getMenuItems().add(new MenuItem("Waffles","Waffles, with your choice of blueberries or strawberries",true,3.59));

        DineMenu dineMenu = new DineMenu();
        dineMenu.addItem("Vegetarian BLT", "(Fakin') Bacon with lettuce & toamto on whole wheat",true,2.99);
        dineMenu.addItem("Soup of the day","Soup of the day, with a side of potato salad",false,3.29);
        dineMenu.addItem("Hotdog","Ahot dog, with saurkraut, relish, onions, topped with cheese",false, 3.05);

        CafeMenu cafeMenu = new CafeMenu();
        cafeMenu.addItem("Veggie Burger and Qir Fries","Veggie burger on whole wheat bun, lettuce, tomato, and fries",true, 3.99);
        cafeMenu.addItem("Soup of the day","A cup of the soup of the day,with a side salad",false, 3.69);
        cafeMenu.addItem("Burrito","A large burrito, with whole pinto beans, salsa,guacamole",true, 4.29);



        Waitress waitress = new Waitress(pancakeHouseMenu,dineMenu,cafeMenu);
        waitress.printMenu();
    }
}
