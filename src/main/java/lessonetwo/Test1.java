package lessonetwo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Persone persone = context.getBean("myPerson", Persone.class);
        persone.callYourPet();
        context.close();
    }
}
