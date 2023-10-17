import com.kong.mapper.UserMapper;
import com.kong.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1   {
    @Test
    public void test(){
     ApplicationContext content = new ClassPathXmlApplicationContext("spring-dao.xml");
        UserMapper mapper = content.getBean("userMapper", UserMapper.class);
        for (User user : mapper.selectUser()) {
            System.out.println(user);
        }
    }

}

