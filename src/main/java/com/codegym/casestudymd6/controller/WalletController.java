package com.codegym.casestudymd6.controller;

import com.codegym.casestudymd6.model.Wallet;
import com.codegym.casestudymd6.service.wallet.IWalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("wallet")
@CrossOrigin("*")
public class WalletController {
    @Autowired
    private IWalletService walletService;

    @GetMapping("/list")
    public ResponseEntity<Iterable<Wallet>> showAllWallet(){
        return new ResponseEntity<>(walletService.findAll(), HttpStatus.OK);
    }
}
