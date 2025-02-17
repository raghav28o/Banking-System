package net.javaguides.banking.service;

import net.javaguides.banking.dto.AccountDto;
import net.javaguides.banking.entity.Account;

import java.util.List;

public interface AccountService {
    AccountDto createAccount(AccountDto accountDto);
    AccountDto getAccountById(Long id);

    AccountDto deposit(Long id, Double balance);

    AccountDto withdraw(Long id, Double balance);

    List<AccountDto> getAllAccounts();

    void deleteAccount(Long id);
}
