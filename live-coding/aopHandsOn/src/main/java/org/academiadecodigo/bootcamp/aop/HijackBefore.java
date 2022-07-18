package org.academiadecodigo.bootcamp.aop;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class HijackBefore implements MethodBeforeAdvice {

    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("I can not stand beans who talk out loud!");
    }
}
