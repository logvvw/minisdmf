package net.logvv.minisdmfer.service;

import net.logvv.minisdmfer.model.UserToken;

/**
 * ID生成器
 * Author : wangwei
 * Created on 2018/10/17 0:10.
 */
public interface IUserService {

    /**
     * 生成accessToken
     * @return
     */
    UserToken generateToken();

}
