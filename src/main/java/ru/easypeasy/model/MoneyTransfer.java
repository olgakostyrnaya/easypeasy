package ru.easypeasy.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Перемещение доходов между истоничками денег
 */
public class MoneyTransfer {

    /**
     * Идентификатор операции перемещения
     */
    private Long id;

    /**
     * Источник, из которого перемещают деньги
     */
    private MoneySource sourceFrom;

    /**
     * Источник, в который перемещают деньги
     */
    private MoneySource sourceTo;

    /**
     * Сумма
     */
    private BigDecimal amount;

    /**
     * Дата операции
     */
    private Date operationDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public MoneySource getSourceFrom() {
        return sourceFrom;
    }

    public void setSourceFrom(MoneySource sourceFrom) {
        this.sourceFrom = sourceFrom;
    }

    public MoneySource getSourceTo() {
        return sourceTo;
    }

    public void setSourceTo(MoneySource sourceTo) {
        this.sourceTo = sourceTo;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
