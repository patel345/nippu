package com.nippu.repository;

import com.nippu.entity.Bank;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankRepository extends JpaRepository<Bank,Long> {
}
