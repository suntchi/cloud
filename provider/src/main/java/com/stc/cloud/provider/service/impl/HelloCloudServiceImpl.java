package com.stc.cloud.provider.service.impl;

import com.stc.cloud.provider.service.HelloCloudService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 你好cloud
 * </p>
 *
 * @author Tianchi Sun
 * @since 2020/10/20
 */
@Service(value = "HelloCloudServiceImpl")
@RefreshScope
public class HelloCloudServiceImpl implements HelloCloudService {

    @Value("${test}")
    private String userName;

    @Override
    public void helloCloud(String str) {
        System.out.println("hello: " + str + userName);
    }
}
