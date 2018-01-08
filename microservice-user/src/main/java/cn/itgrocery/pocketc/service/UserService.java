package cn.itgrocery.pocketc.service;

import javax.servlet.http.HttpServletRequest;

/**
 * @ author chenxl
 * @ date 2018/1/2 10:36
 * @ describe
 */
public interface UserService {

    int getVerifyCodeByPhone(HttpServletRequest request, long phoneNum);
}
