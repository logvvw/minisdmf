package net.logvv.minisdmfer.model;

import java.util.Date;

/**
 * Author : logvvw
 * Created on 2018/10/17 1:06.
 */
public class UserToken {

    private String token;
    private Date expireTime;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Date getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }
}
