package net.logvv.minisdmfer.controller;

import net.logvv.minisdmf.common.model.GeneralResult;
import net.logvv.minisdmfer.model.UserToken;
import net.logvv.minisdmfer.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author : logvvw
 * Created on 2018/10/17 1:05.
 */
@RestController
public class UserController {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private IUserService userService;

    @RequestMapping(value = "/access/token", method = RequestMethod.GET)
    public GeneralResult getAccessToken(){
        LOGGER.info("Begin to get token.");
        GeneralResult result = new GeneralResult();

        UserToken token = userService.generateToken();
        result.setResultData(token);
        result.setResultStatus(true);

        return result;
    }
}
