package com.codegym.casestudymd6.controller;

import com.codegym.casestudymd6.model.Category;
import com.codegym.casestudymd6.model.Transaction;
import com.codegym.casestudymd6.model.Wallet;
import com.codegym.casestudymd6.service.category.ICategoryService;
import com.codegym.casestudymd6.service.transaction.ITransactionService;
import com.codegym.casestudymd6.service.wallet.IWalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@CrossOrigin("*")
@RequestMapping("transaction")
public class TransactionController {

    @Autowired
    private ITransactionService transactionService;

    @PostMapping("/create")
    public ResponseEntity<Transaction> saveTransaction(@RequestBody Transaction transaction){
        return new ResponseEntity<>(transactionService.save(transaction), HttpStatus.CREATED);
    }
    @Autowired
    private ICategoryService categoryService;

    @GetMapping("/listCate")
    public ResponseEntity<Iterable<Category>> showAllCategory(){
        return new ResponseEntity<>(categoryService.findAll(), HttpStatus.OK);
    }

    @Autowired
    private IWalletService walletService;

    @GetMapping("/listWallet")
    public ResponseEntity<Iterable<Wallet>> showAllWallet(){
        return new ResponseEntity<>(walletService.findAll(), HttpStatus.OK);
    }
}
