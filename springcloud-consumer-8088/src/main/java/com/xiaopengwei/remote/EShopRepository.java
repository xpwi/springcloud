package com.xiaopengwei.remote;

import com.xiaopengwei.entity.EShop;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name= "spring-cloud-producer")
public interface EShopRepository {

    @GetMapping(value = "/list")
    public String list();

    @GetMapping(value = "/save")
    public String save(EShop eshop);
}
