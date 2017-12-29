package cn.itgrocery.pocketc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ author chenxl
 * @ date 2017/12/29 16:00
 * @ describe
 */
@SpringBootApplication
@MapperScan("cn.itgrocery.pocketc.dao")
public class Application {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }
}
