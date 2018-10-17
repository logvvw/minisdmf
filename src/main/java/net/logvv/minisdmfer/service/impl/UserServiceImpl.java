package net.logvv.minisdmfer.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import net.logvv.minisdmfer.model.UserToken;
import net.logvv.minisdmfer.service.IUserService;
import org.joda.time.DateTime;
import org.springframework.stereotype.Service;


/**
 * Author : logvvw
 * Created on 2018/10/17 0:15.
 */
@Service
public class UserServiceImpl implements IUserService {

    @Reference
    private IUniqueIDService uniqueIDService;

    @Override
    public UserToken generateToken() {

        UserToken token = new UserToken();
        token.setToken(uniqueIDService.generateUniqueId());

        DateTime dt = new DateTime();
        dt.plusMinutes(30);
        token.setExpireTime(dt.toDate());

        return token;
    }

}
