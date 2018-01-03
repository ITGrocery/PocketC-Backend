package cn.itgrocery.pocketc.service.impl;

import cn.itgrocery.pocketc.app.config.exception.MyException;
import cn.itgrocery.pocketc.dao.VerifyCodeDao;
import cn.itgrocery.pocketc.entity.VerifyCoderEntity;
import cn.itgrocery.pocketc.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Random;

/**
 * @ author chenxl
 * @ date 2018/1/2 10:37
 * @ describe
 */
@Service
public class UserServiceImpl implements UserService{

    private Logger logger = LoggerFactory.getLogger(getClass());

    public static final int MAX_TIMES_OF_VERIFY_CODE_REQUEST_ONE_DAY = 10;

    public static final int VERIFY_CODE_BEGIN = 1000;
    public static final int VERIFY_CODE_END = 9999;

    @Resource
    private VerifyCodeDao verifyCodeDao;

    @Override
    public int getVerifyCodeByPhone(HttpServletRequest request, long phoneNum) {
        //检查次数是否已超过上限
        if(verifyCodeDao.countRequestNumOfVerifyCode(phoneNum) > MAX_TIMES_OF_VERIFY_CODE_REQUEST_ONE_DAY){

            throw new MyException("该手机当天获取验证码的次数已达到上限，请明天再试");
        }
        String remoteHost = request.getRemoteHost();
        Random random = new Random();
        int i = random.nextInt(VERIFY_CODE_END - VERIFY_CODE_BEGIN) + VERIFY_CODE_BEGIN;

        VerifyCoderEntity verifyCoderEntity = new VerifyCoderEntity(phoneNum,i,remoteHost);
        verifyCodeDao.insert(verifyCoderEntity);
        return i;
    }
}
