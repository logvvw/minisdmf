package net.logvv.minisdmf.service;

/**
 * ID生成器
 * Author : wangwei
 * Created on 2018/10/17 0:10.
 */
public interface IUniqueIDService {

    /**
     * 生成唯一ID
     * @return
     */
    String generateUniqueId();

    /** 时间戳+随机数生成 */
    String generateShortTimeRandom();

}
