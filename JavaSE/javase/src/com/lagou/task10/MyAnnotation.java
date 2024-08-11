package com.lagou.task10;

import java.lang.annotation.*;

//@Retention(RetentionPolicy.SOURCE)
@Retention(RetentionPolicy.RUNTIME)
//@Retention(RetentionPolicy.CLASS)
@Documented
@Target({ElementType.TYPE,ElementType.METHOD, ElementType.CONSTRUCTOR})
@Inherited
public @interface MyAnnotation {
    public String value() default "默认值";
    public String value2();
}
