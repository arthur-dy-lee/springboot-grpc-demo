package arthur.dy.lee.helloworld;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Arthur.li
 * @since 2022/7/3 22:23
 */
@RestController
@EnableAutoConfiguration
public class HelloWorldController {

    private static final Logger log = LoggerFactory.getLogger(HelloWorldController.class);

    @Resource HelloWorldClient helloWorldClient;

    @RequestMapping("/client-invoke")
    public String clientInvoke() throws Exception {
        log.info("begin");
        String firstName = "firstName1";
        String lastName = "lastName2";
        String result = helloWorldClient.sayHello(firstName, lastName);
        log.info("invok end. result={}", result);
        return result;
    }
}
