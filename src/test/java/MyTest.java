import ch.qos.logback.core.db.BindDataSourceToJNDIAction;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by 郑晨星 on 2021/9/11 22:30
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:spring.xml" })
public class MyTest {


    @Test
    public void test(){

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Object a = context.getBean("a");
        System.out.println(a);

//        Object bean = context.getBean("");

    }
}
