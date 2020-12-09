package com.qf.dao;

import com.qf.pojo.Bankcard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankcardRespository  extends JpaRepository<Bankcard,Integer> {
}
