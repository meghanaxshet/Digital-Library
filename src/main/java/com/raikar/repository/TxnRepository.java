package com.raikar.repository;

import com.raikar.model.Txn;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TxnRepository extends JpaRepository<Txn,Integer> {
}
