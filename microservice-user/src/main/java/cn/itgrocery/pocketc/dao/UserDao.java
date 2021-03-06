package cn.itgrocery.pocketc.dao;

import cn.itgrocery.pocketc.entity.UserEntity;
import org.springframework.stereotype.Repository;

/**
 * @ author chenxl
 * @ date 2017/12/29 16:16
 * @ describe
 */
@Repository
public interface UserDao {

    UserEntity selectByUsername(String username);
}
