package com.heqilin.util;

import com.heqilin.util.plugin.cache.CacheFactory;
import com.heqilin.util.plugin.cache.ICache;

/**
 *
 *
 * @author heqilin
 * date:  2018-12-26 ok
 **/
public class CacheUtil {
    public static ICache instance = CacheFactory.create(null);

    /**
     * 获取自定义Cache客户端实现
     * @param cacheType
     * @return
     */
    public  static  ICache getCacheClient(String cacheType){
        return  CacheFactory.create(cacheType);
    }
}