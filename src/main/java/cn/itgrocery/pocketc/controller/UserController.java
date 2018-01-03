package cn.itgrocery.pocketc.controller;

import cn.itgrocery.pocketc.base.BaseController;
import cn.itgrocery.pocketc.base.BaseResponse;
import cn.itgrocery.pocketc.dao.UserDao;
import cn.itgrocery.pocketc.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @ author chenxl
 * @ date 2017/12/29 16:01
 * @ describe
 */
@RestController
@RequestMapping("/user")
public class UserController implements BaseController{

    @Resource
    private UserDao userDao;
    @Resource
    private UserService userService;

    @RequestMapping("/test")
    public BaseResponse test() {
        return getResponse(userDao.selectByUsername("admin"));
    }

    @RequestMapping("/getVerifyCode")
    public BaseResponse getVerifyCode(HttpServletRequest request, @RequestParam("phoneNum") long phoneNum){
        return getResponse(userService.getVerifyCodeByPhone(request,phoneNum));
    }
}
