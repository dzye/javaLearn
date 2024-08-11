package com.lagou.task10;

@MyAnnotation(value2 = "world")
public class Person {
    /**
     * name是用于描述姓名的成员变量
     */
    private String name;
    /**
     * age是用于描述年龄的成员变量
     */
    private int age;

    /**
     * 无参构造方法
     */
    public Person() {
    }

    /**
     * 有参构造方法
     * @param name
     * @param age
     */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取成员变量姓名的值
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * 设置成员变量姓名的值
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取成员变量年龄的值
     * @return
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置成员变量年龄的值
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }
}
