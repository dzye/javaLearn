package com.lagou.task10;

/**
 * 编程实现普通内部类
 */
public class NormalOuter {
    private int cnt = 1;
    private int cnt2 = 1;
    public final    class NormalInner {
        private int ia = 2;
        private int cnt2 = 2;
        public NormalInner() {
        }

        public void show(){
            System.out.println("外部类中变量cnt2的数值为：" + NormalOuter.this.cnt2);
            System.out.println("内部类中变量为cnt2的数值为：" + this.cnt2);
        }
    }
}
