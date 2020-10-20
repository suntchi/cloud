package com.stc.cloud.consumer.feigns;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author Tianchi Sun
 * @since 2020/10/20
 */
@FeignClient(value = "CLOUD-PROVIDER")
public interface CloudFeign {
    /**
     *  cloud初步使用
     *
     * @param str：参数
     *
     * @since :  2020/10/20
     *
     */
    @GetMapping("/hello/{str}")
    void helloCloud(@PathVariable String str);
}
