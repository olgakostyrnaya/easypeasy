package ru.easypeasy.service;

import ru.easypeasy.model.ExpenseCategory;
import ru.easypeasy.model.Operation;

import java.util.Date;
import java.util.List;

public interface OperationService {

    /**
     * @param operation - операция пользователя
     * @return true, если операция добавлена успешно
     */
    boolean add(Operation operation);

    /**
     * @param operation - операция пользователя
     * @return true, если операция отредактирована успешно
     */
    boolean edit(Operation operation);

    /**
     * @param operation - операция пользователя
     * @return true, если операция удалена успешно
     */
    boolean delete(Operation operation);

    List<Operation> getOperationsForPeriod(Date startDate, Date endDate);

    List<Operation> getOperationsByExpenseCategoryForPeriod(ExpenseCategory category, Date startDate, Date endDate);

}
