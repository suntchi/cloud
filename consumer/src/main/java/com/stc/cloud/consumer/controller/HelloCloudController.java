package com.stc.cloud.consumer.controller;

import com.stc.cloud.consumer.feigns.CloudFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * cloud初步使用
 * </p>
 *
 * @author Tianchi Sun
 * @since 2020/10/20
 */
@RestController
@RequestMapping
public class HelloCloudController {

    @Autowired
    private CloudFeign cloudService;

    @GetMapping("/hello/{str}")
    public void hello(@PathVariable String str){
        cloudService.helloCloud(str);
    }
}
