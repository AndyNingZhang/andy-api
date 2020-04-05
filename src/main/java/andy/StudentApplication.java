package andy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;


/**
*@Descripption
*@Author:zn
*@CreateDate:2020/4/4/004 21:42
*@UpdateDate:2020/4/4/004 21:42
*Version:1.0
*/

@EnableScheduling
@EnableAsync
@SpringBootApplication
public class StudentApplication {
    public static void main(String[] args) {
        ApplicationContext ctx =   SpringApplication.run(StudentApplication.class, args);


    }
}
