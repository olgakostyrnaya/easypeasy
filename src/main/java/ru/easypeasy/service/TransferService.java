package ru.easypeasy.service;

import ru.easypeasy.model.MoneyTransfer;

public interface TransferService {

    void doTransfer(MoneyTransfer moneyTransfer);

    void editTransfer(MoneyTransfer moneyTransfer);

}
