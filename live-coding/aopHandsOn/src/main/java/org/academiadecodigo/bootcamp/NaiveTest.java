package org.academiadecodigo.bootcamp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class NaiveTest {

    private NaiveBean naiveBean;

    public NaiveTest(NaiveBean naiveBean) {
        this.naiveBean = naiveBean;
    }

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/spring/spring-config.xml");
        NaiveTest naiveTest = context.getBean(NaiveTest.class);

        naiveTest.talk();
    }

    private void talk() {
       naiveBean.talk();
    }
}
