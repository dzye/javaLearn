package com.lagou.task13;

import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class InstantTest {
    public static void main(String[] args) {
        Instant i1 = Instant.now();
        System.out.println(i1);
        ZoneOffset offset = ZoneOffset.ofHours(8);
        OffsetDateTime odt = i1.atOffset(offset);
        System.out.println(odt);
        System.out.println("---------------------------");
        long g1 = i1.toEpochMilli();
        System.out.println(g1);
        Instant i2 = Instant.ofEpochMilli(g1);
        System.out.println(i2);
    }
}
