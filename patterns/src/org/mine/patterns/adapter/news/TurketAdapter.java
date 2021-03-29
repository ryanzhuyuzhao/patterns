package org.mine.patterns.adapter.news;

/**
 * @ClassName TurketAdapter
 * @Description 适配器类
 * @Author Administrator
 * @Date 2021/3/29 0029 19:58
 * @Version 1.0
 */
public class TurketAdapter implements Duck{
    private Turkey turkey;

    public TurketAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
