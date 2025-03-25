package org.example.transactiondemo.service;

import org.example.transcation.entity.Account;

@Service
@RequiredArgsConstructor
public class AccountService {

    private final AccountDao accountDao;

    public double getBalance(int id) {
        return accountDao.findById(id)
                .orElseThrow().getAmount();

    }
    @Transcational
    public void deposit(int id, double amount) {
        double currentBalance = getBalance(id);
        Account account= getAccount(id);
        account.setAmount (updatedAmount);

    }
    @Transcational
    public void withdraw(int id, double amount) {
        int currentBalance = getBalance(id);
        if(amount > currentBalance) {
            throw new RuntimeException("Insufficient amount");

        }
        int updatedAmount = currentBalance -amount;
        Account account= getAccount(id);
        account.setAmount (updatedAmount);
    }
    private Account getAccount(int id) {
        return accountDao.findById().get();

    }
}
