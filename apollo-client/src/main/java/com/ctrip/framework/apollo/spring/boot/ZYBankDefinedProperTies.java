package com.ctrip.framework.apollo.spring.boot;

public class ZYBankDefinedProperTies {

    private static String[] ZYBANK_SYSTEM_PROPERTIES = new String[]{
            "apollo.refreshInterval",   //客户端定时刷新间隔 5分钟
            "apollo.connectTimeout",    //连接超时时间 1秒
            "apollo.readTimeout",   //读取超时时间 5秒
            "apollo.loadConfigQPS",
            "apollo.longPollQPS",
            "apollo.configCacheSize",   //配置缓存池，500
            "apollo.longPollingInitialDelayInMills",
            "apollo.onErrorRetryInterval",  //新增，错误重试时间间隔，1秒
            "apollo.configCacheExpireTime"  //新增，缓存过期时间，1分钟

    };

    public static String[] getZybankSystemProperties() {
        return ZYBANK_SYSTEM_PROPERTIES;
    }
}
