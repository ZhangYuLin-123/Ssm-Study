package org.example.anno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Advice {

    @Pointcut("execution(* org.example.anno.Target.*(..))")
    public void pointcut(){}

    @Before("Advice.pointcut()")
    public void before(){
        System.out.println("前置增强......");
    }

    public void afterReturning(){
        System.out.println("后置增强......");
    }

    // ProceedingJoinPoint：正在执行的连接点 == 切点
    public Object around(ProceedingJoinPoint pjd) throws Throwable {
        System.out.println("环绕前......");
        Object process = pjd.proceed();  //执行切点方法
        System.out.println("环绕后......");
        return process;
    }

    public void afterThrowing(){
        System.out.println("出错了......");
    }

    public void after(){
        System.out.println("最终......");
    }
}
