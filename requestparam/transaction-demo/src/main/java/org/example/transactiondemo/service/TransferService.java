package org.example.transactiondemo.service;
@Service
@RequiredArgsConstructor
public class TransferService {
    private final AccountService accountService;
    @Transactional(propagation = Propagation.REQUIRED)
    public void transfer (final int fromId, final int toId, final double amount) {
        accountService.withdraw(fromId, amount);
        accountService.deposit(toId, amount);
    }

}
