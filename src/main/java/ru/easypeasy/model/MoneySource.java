package ru.easypeasy.model;

import java.math.BigDecimal;

/**
 * Источник денег
 */
public class MoneySource {

    /**
     * Идентификатор источника
     */
    private Long id;

    /**
     * Наименование источника
     */
    private String name;

    private Long userId;

    /**
     * Счёт
     */
    private BigDecimal account;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getAccount() {
        return account;
    }

    public void setAccount(BigDecimal account) {
        this.account = account;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
