package com.xiaopengwei.repository;

import com.xiaopengwei.entity.EShop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EShopRepository extends JpaRepository<EShop,Long> {

}