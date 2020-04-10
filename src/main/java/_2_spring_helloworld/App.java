package _2_spring_helloworld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld helloWorldBean1 =
                (HelloWorld) applicationContext.getBean("helloworld");

        HelloWorld helloWorldBean2 =
                (HelloWorld) applicationContext.getBean("helloworld");

        Cat catBean1 =
                (Cat) applicationContext.getBean("cat");

        Cat catBean2 =
                (Cat) applicationContext.getBean("cat");

        boolean isHelloWorldBeansEqual = helloWorldBean1 == helloWorldBean2;
        boolean isCatBeansEqual = catBean1 == catBean2;

        System.out.println("Бины helloWorld равны? " + isHelloWorldBeansEqual);
        System.out.println("Бины cat равны? " + isCatBeansEqual);

    }
}