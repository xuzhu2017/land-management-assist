package com.xz.landmangementassist.utils;

import com.xz.landmangementassist.constant.GeneralConstant;
import com.xz.landmangementassist.domain.entity.admin.UserEntity;

import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.SimpleHash;

/**
 * 服务层工具类
 * 
 * @author xuzhu
 * @date 2021-2-26 16:46:42
 */
public class ServiceUtil {
    /**
     * 用户密码加密
     * 
     * @param userEntity
     */
    public static void passwordEncryption(UserEntity userEntity) {
        // 默认生成 16 位盐
        String salt = new SecureRandomNumberGenerator().nextBytes().toString();
        String encodedPassword = new SimpleHash(GeneralConstant.ALGORITHM_NAME, userEntity.getPassword(), salt,
                GeneralConstant.HASH_ITERATIONS).toString();

        userEntity.setSalt(salt);
        userEntity.setPassword(encodedPassword);
    }
}
