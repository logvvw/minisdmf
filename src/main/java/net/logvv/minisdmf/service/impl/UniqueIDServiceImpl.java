package net.logvv.minisdmf.service.impl;

import net.logvv.minisdmf.service.IUniqueIDService;
import net.logvv.minisdmf.utils.DateUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.UUID;

/**
 * Author : logvvw
 * Created on 2018/10/17 0:15.
 */
@Service
public class UniqueIDServiceImpl implements IUniqueIDService {


    @Override
    public String generateUniqueId() {
        return UUID.randomUUID().toString().replace("-","");
    }

    @Override
    public String generateShortTimeRandom() {
        String date = DateUtils.date2Str(new Date(),DateUtils.YYYYMMDDHHMMSS_FORMAT);
        String random = RandomStringUtils.randomNumeric(6);

        return date+random;
    }
}
