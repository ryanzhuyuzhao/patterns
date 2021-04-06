package org.mine.patterns.proxy;

import java.lang.reflect.Proxy;

/**
 * @ClassName MatchMakingTestDrive
 * @Description
 * @Author Administrator
 * @Date 2021/4/6 0006 21:51
 * @Version 1.0
 */
public class MatchMakingTestDrive {

    public static void main(String[] args) {
        MatchMakingTestDrive testDrive = new MatchMakingTestDrive();
        testDrive.drive();
    }

    public void drive() {
        PersonBean joe = new PersonBeanImpl();
        joe.setName("joe");
        joe.setGender("Male");
        joe.setHotOrNotRating(0);
        joe.setInterests("Swimming");
        PersonBean ownerProxy = getOwnerProxy(joe);
        System.out.println("Name is " + ownerProxy.getName());
        ownerProxy.setInterests("bowling, Go");
        System.out.println("Interests set from owner proxy");
//        try {
//            ownerProxy.setHotOrNotRating(10);
//        } catch (Throwable e) {
//            System.out.println("Can't set rating from owner proxy");
//        }
        System.out.println("Rating is " + ownerProxy.getHotOrNotRating());
        PersonBean nonOwnerProxy = getNonOwnerProxy(joe);
        System.out.println("Name is " + nonOwnerProxy.getName());
//        try {
//            nonOwnerProxy.setInterests("bowling, Go");
//        } catch (Exception e) {
//            System.out.println("Can't set interests from non owner prxoy");
//        }
        nonOwnerProxy.setHotOrNotRating(1);
        System.out.println("Rating set from non owner prxoy");
        System.out.println("Rating is " + nonOwnerProxy.getHotOrNotRating());

    }

    public PersonBean getOwnerProxy(PersonBean person) {

                PersonBean personBean=  (PersonBean) Proxy.newProxyInstance(person.getClass().getClassLoader(), person.getClass().getInterfaces(),new OwnerInvocationHandler(person));

                return personBean;
    }

    public PersonBean getNonOwnerProxy(PersonBean person) {
        return (PersonBean) Proxy.newProxyInstance(person.getClass().getClassLoader(), person.getClass().getInterfaces(),new NonOwnerInvocationHandler(person));
    }
}
