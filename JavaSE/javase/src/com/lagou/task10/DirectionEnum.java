package com.lagou.task10;

public enum DirectionEnum implements DirectionInterface {
    UP("向上"){
        @Override
        public void show(){
            System.out.println("向上重写");
        }
    }, DOWN("向下") {
        @Override
        public void show() {
            System.out.println("向下重写");
        }
    }, LEFT("向左") {
        @Override
        public void show() {
            System.out.println("向左重写");
        }
    }, RIGHT("向右") {
        @Override
        public void show() {
            System.out.println("向右重写");
        }
    };
    private final String desc;
    private DirectionEnum(String desc){
        this.desc = desc;
    }
    public String getDesc() {
        return desc;
    }

    /*@Override
    public void show() {
        System.out.println("实现接口方法");
    }*/

}
