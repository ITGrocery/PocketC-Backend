package cn.itgrocery.pocketc.controller;

import cn.itgrocery.pocketc.dao.UserDao;
import cn.itgrocery.pocketc.entity.UserEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ author chenxl
 * @ date 2017/12/29 16:01
 * @ describe
 */
@RestController
public class UserController {

    @Resource
    private UserDao userDao;

    @RequestMapping("/")
    public UserEntity test() {
        return userDao.selectByUsername("admin");
    }
}
