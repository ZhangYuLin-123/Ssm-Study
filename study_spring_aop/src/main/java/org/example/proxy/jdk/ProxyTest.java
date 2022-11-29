package org.example.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyTest {

    public static void main(String[] args) {

        //目标对象
        final Target target = new Target();

        //增强对象
        final Advice advice = new Advice();

        //返回值 就是动态生成的代理对象（代理对象：增强后的对象）
        TargetInterface proxy = (TargetInterface) Proxy.newProxyInstance(
                target.getClass().getClassLoader(), //目标对象类加载器
                target.getClass().getInterfaces(), //目标对象相同的接口字节码对象数组

                // InvocationHandler：真实对象方法调用处理器，内置invoke方法，其功能：为真实对象定制代理逻辑
                new InvocationHandler() {
                    //调用代理对象的任何方法  实质执行的都是invoke方法
                    //参数1：代理对象
                    //参数2：真实对象的方法
                    //参数3：真实对象方法参数列表
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        advice.before(); //前置增强
                        Object invoke = method.invoke(target, args);//执行目标方法
                        advice.after(); //后置增强
                        return invoke;
                    }
                }
        );

        //调用代理对象的方法
        proxy.save();

    }

}