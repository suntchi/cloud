package com.stc.cloud.provider.controller;

import com.stc.cloud.provider.service.HelloCloudService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 * 你好 cloud
 * </p>
 *
 * @author Tianchi Sun
 * @since 2020/10/20
 */
@RestController
@RequestMapping
public class HelloCloudController {

    @Resource
    private HelloCloudService helloCloudService;

    @GetMapping("/hello/{str}")
    public void helloCloud(@PathVariable String str) {
         helloCloudService.helloCloud(str);
    }
}
