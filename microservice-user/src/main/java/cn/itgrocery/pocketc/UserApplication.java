package cn.itgrocery.pocketc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ author chenxl
 * @ date 2017/12/29 16:00
 * @ describe
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("cn.itgrocery.pocketc.dao")
public class UserApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(UserApplication.class, args);
    }
}
