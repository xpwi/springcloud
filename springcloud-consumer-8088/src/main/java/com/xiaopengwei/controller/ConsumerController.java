package com.xiaopengwei.controller;

import com.xiaopengwei.entity.EShop;
import com.xiaopengwei.remote.EShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    EShopRepository eShopRepository;
	
    @GetMapping("/save")
    public String index(@RequestParam Integer id, @RequestParam String name) {
        EShop eShop = new EShop();
        eShop.setId(id);
        eShop.setName(name);

        String save = eShopRepository.save(eShop);
        return save;
    }

    @GetMapping("/list")
    public String getShopList(){
        return eShopRepository.list();
    }

}