package org.mine.patterns.iteratorpattern.compose;

/**
 * @ClassName Waitress
 * @Description
 * @Author Administrator
 * @Date 2021/3/31 0031 7:57
 * @Version 1.0
 */
public class Waitress {
    private MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
    }
}
