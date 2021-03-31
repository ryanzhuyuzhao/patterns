package org.mine.patterns.iteratorpattern.compose;

/**
 * @ClassName MenuTestDrive
 * @Description
 * @Author Administrator
 * @Date 2021/3/31 0031 8:05
 * @Version 1.0
 */
public class MenuTestDrive {
    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU","Breakfast");
        MenuComponent dinnerMenu = new Menu("DINNER MENU","Lunch");
        MenuComponent cafeMenu = new Menu("DESSERT MENU","Dessert of course!");
        MenuComponent dessertMenu = new Menu("DESSERT MENU","Dessert of course!");

        MenuComponent allMenu = new Menu("ALL MENUS","All menus combined");

        allMenu.add(pancakeHouseMenu);
        allMenu.add(dinnerMenu);
        allMenu.add(cafeMenu);
        allMenu.add(dessertMenu);

        dinnerMenu.add(new MenuItem("Pasta","Spaghetti with Marinara Sauce, and a slice of sourdough bread",true,3.89));
        dessertMenu.add(new MenuItem("Apple Pie","Apple pie with a flakey crust, topped with vanilla ice cream",true,1.59));
        Waitress waitress = new Waitress(allMenu);
        waitress.printMenu();
        waitress.printVegetarianMenu();
    }
}
