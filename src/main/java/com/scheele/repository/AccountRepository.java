package com.scheele.repository;

import com.scheele.entity.Account;

import java.util.List;

public interface AccountRepository {
    int save(Account account);
    int update(Account account);
    int deleteById(Long id);
    List<Account> findAll();
    Account findById();
}
