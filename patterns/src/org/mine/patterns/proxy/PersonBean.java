package org.mine.patterns.proxy;

/**
 * @ClassName PersonBean
 * @Description
 * @Author Administrator
 * @Date 2021/4/6 0006 21:19
 * @Version 1.0
 */
public interface PersonBean {

    String getName();

    String getGender();

    String getInterests();

    int getHotOrNotRating();

    void setName(String name);

    void setGender(String gender);

    void setInterests(String interests);

    void setHotOrNotRating(int hotOrNotRating);
}
