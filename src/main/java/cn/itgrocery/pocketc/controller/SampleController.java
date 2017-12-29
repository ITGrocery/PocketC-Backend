package cn.itgrocery.pocketc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ author chenxl
 * @ date 2017/12/29 16:01
 * @ describe
 */
@RestController
public class SampleController {

    @RequestMapping("/")
    public String test() throws Exception {
        throw new Exception("抛出异常");
    }
}
