package com.codegym.casestudymd6.repository;

import com.codegym.casestudymd6.model.Wallet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IWalletRepository extends CrudRepository<Wallet, Long> {
}
