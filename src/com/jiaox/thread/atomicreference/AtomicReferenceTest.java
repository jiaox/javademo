package com.jiaox.thread.atomicreference;

import java.util.concurrent.atomic.AtomicReference;
/**
 * 新建AtomicReference对象ar时，将它初始化为p1。
 * 紧接着，通过CAS函数对它进行设置。如果ar的值为p1的话，则将其设置为p2。
 * 最后，获取ar对应的对象，并打印结果。p3.equals(p1)的结果为false，
 * 这是因为Person并没有覆盖equals()方法，
 * 而是采用继承自Object.java的equals()方法；
 * 而Object.java中的equals()实际上是调用"=="去比较两个对象，即比较两个对象的地址是否相等。
 * @author jiaox
 *
 */
public class AtomicReferenceTest {
	public static void main(String[] args){

        // 创建两个Person对象，它们的id分别是101和102。
		Person2 p1 = new Person2(101);
		Person2 p2 = new Person2(102);
        // 新建AtomicReference对象，初始化它的值为p1对象
        AtomicReference ar = new AtomicReference(p1);
        // 通过CAS设置ar。如果ar的值为p1的话，则将其设置为p2。
        ar.compareAndSet(p1, p2);

        Person2 p3 = (Person2)ar.get();
        System.out.println("p3 is "+p3);
        System.out.println("p3.equals(p1)="+p3.equals(p1));
    }
}
class Person2 {
    volatile long id;
    public Person2(long id) {
        this.id = id;
    }
    public String toString() {
        return "id:"+id;
    }
}