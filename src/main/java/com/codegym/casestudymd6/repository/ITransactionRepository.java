package com.codegym.casestudymd6.repository;

import com.codegym.casestudymd6.model.Transaction;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITransactionRepository extends CrudRepository<Transaction, Long> {
}
