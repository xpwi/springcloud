package com.xiaopengwei.controller;

import com.xiaopengwei.entity.EShop;
import com.xiaopengwei.repository.EShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EShopController {

    @Autowired
    private EShopRepository eShopRepository;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/list")
    public String list() {
        List<EShop> eShopList = eShopRepository.findAll();
        return eShopList.toString();
    }

    @GetMapping("/save")
    public String save(@RequestParam Integer id, @RequestParam String name) {
        EShop eShop = new EShop();
        eShop.setId(id);
        eShop.setName(name);

        EShop save = eShopRepository.save(eShop);

        if (save != null) {

            return "保存成功";
        } else {
            return "保存识别";
        }
    }

}