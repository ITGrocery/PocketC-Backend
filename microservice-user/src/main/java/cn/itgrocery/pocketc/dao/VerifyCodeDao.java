package cn.itgrocery.pocketc.dao;

import cn.itgrocery.pocketc.entity.VerifyCoderEntity;
import org.springframework.stereotype.Repository;

/**
 * @ author chenxl
 * @ date 2018/1/3 13:50
 * @ describe
 */
@Repository
public interface VerifyCodeDao {

    int insert(VerifyCoderEntity verifyCoderEntity);

    int update(VerifyCoderEntity verifyCoderEntity);

    //查询该手机号在今日获取验证码的次数
    int countRequestNumOfVerifyCode(long phoneNum);
}
