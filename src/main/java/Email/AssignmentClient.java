package Email;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AssignmentClient {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(AppConfigEmail.class);
        EmailService emailService=applicationContext.getBean(EmailService.class);
        emailService.sendEmail();
    }
}
