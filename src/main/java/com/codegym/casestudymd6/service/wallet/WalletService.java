package com.codegym.casestudymd6.service.wallet;

import com.codegym.casestudymd6.model.Wallet;
import com.codegym.casestudymd6.repository.IWalletRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class WalletService implements IWalletService{

    @Autowired
    private IWalletRepository walletRepository;

    @Override
    public Iterable<Wallet> findAll() {
        return walletRepository.findAll();
    }

    @Override
    public Optional<Wallet> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Wallet save(Wallet wallet) {
        return null;
    }

    @Override
    public void remove(Long id) {

    }
}
