package com.lagou.task14;

import java.util.LinkedList;
import java.util.Queue;

public class QueueList {
    public static void main(String[] args) {
        Queue list = new LinkedList();
        list.offer(1);
        list.offer(2);
        list.offer(3);
        list.offer(4);
        list.offer(5);
        System.out.println(list);
        System.out.println(list.poll());
        System.out.println(list.poll());
        System.out.println(list.poll());
        System.out.println(list.poll());
        System.out.println(list.poll());
    }
}
