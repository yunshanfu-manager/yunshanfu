package com.qf.dao;

import com.qf.pojo.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRespository extends JpaRepository<Card,Integer> {
}
