package ru.easypeasy.model;

import java.math.BigDecimal;
import java.util.Date;

public class Operation {
    /**
     * Идентификатор операции
     */
    protected Long id;
    /**
     * Источник (наличные, карта 1, карта 2..)
     */
    protected MoneySource source;
    /**
     * Сумма
     */
    private BigDecimal sum;
    /**
     * Дата операции
     */
    private Date operationDate;
    /**
     * Комментарий
     */
    private String comment;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public MoneySource getSource() {
        return source;
    }

    public void setSource(MoneySource source) {
        this.source = source;
    }

    public BigDecimal getSum() {
        return sum;
    }

    public void setSum(BigDecimal sum) {
        this.sum = sum;
    }

    public Date getOperationDate() {
        return operationDate;
    }

    public void setOperationDate(Date operationDate) {
        this.operationDate = operationDate;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
