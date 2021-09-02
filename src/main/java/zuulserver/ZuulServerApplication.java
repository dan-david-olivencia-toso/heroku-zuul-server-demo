package zuulserver;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;

@SpringBootApplication
@Configuration
@Controller
@EnableZuulProxy
@CrossOrigin(maxAge = 86400)
public class ZuulServerApplication {
  public static void main(String[] args) {
    new SpringApplicationBuilder(ZuulServerApplication.class).web(true).run(args);
  }
}
