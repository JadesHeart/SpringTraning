package lessonone;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        Pet pet = context.getBean("idPet", Pet.class);
        pet.say();

        context.close();
    }
}
