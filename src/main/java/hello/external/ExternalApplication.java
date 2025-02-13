package hello.external;

import hello.external.config.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Import;

//@Import(MyDataSourceEvcConfig.class)
//@Import(MyDataSourceValueConfig.class)
@Import(MyDataSourceConfigV3.class)
@SpringBootApplication(scanBasePackages = {"hello.external.datasource", "hello.external.pay"})
public class ExternalApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExternalApplication.class, args);
    }

}