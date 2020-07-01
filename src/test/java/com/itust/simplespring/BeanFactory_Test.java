package com.itust.simplespring;

import com.itust.simplespring.factory.AutowireCapableBeanFactory;
import com.itust.simplespring.factory.BeanFactory;
import org.junit.Test;

public class BeanFactory_Test {

    @Test
    public void test() {

        // 初始化beanFactory
        BeanFactory beanFactory = new AutowireCapableBeanFactory();

        // 注册bean
        BeanDefinition beanDefinition = new BeanDefinition();
        beanDefinition.setBeanClassName("com.itust.simplespring.HelloWorldService");
        beanFactory.registerBeanDefinition("helloWorldService", beanDefinition);

        // 获取bean
        HelloWorldService helloWorldService = (HelloWorldService) beanFactory.getBean("helloWorldService");
        helloWorldService.hello();
    }
}
