package com.stc.cloud.provider.service.impl;

import com.stc.cloud.provider.service.HelloCloudService;
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
public class HelloCloudServiceImpl implements HelloCloudService {
    @Override
    public void helloCloud(String str) {
        System.out.println("hello: " + str);
    }
}
