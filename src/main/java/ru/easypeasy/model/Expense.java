package ru.easypeasy.model;

/**
 * Трата
 */
public class Expense extends Operation {

    /**
     * Категория траты
     */
    private ExpenseCategory category;

    public ExpenseCategory getCategory() {
        return category;
    }

    public void setCategory(ExpenseCategory category) {
        this.category = category;
    }
}
