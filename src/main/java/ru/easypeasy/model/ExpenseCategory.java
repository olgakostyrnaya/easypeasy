package ru.easypeasy.model;

import java.math.BigDecimal;

/**
 * Категория траты
 */
public class ExpenseCategory {

    /**
     * Идентификатор категории
     */
    private Long id;

    /*
     * Название категории
     */
    private String name;

    /**
     * Лимит расходов по данной категории
     */
    private BigDecimal limit;

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

    public BigDecimal getLimit() {
        return limit;
    }

    public void setLimit(BigDecimal limit) {
        this.limit = limit;
    }
}
