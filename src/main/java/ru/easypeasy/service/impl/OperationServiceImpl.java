package ru.easypeasy.service.impl;

import ru.easypeasy.model.ExpenseCategory;
import ru.easypeasy.model.Operation;
import ru.easypeasy.service.OperationService;

import java.util.Date;
import java.util.List;

public class OperationServiceImpl implements OperationService {

    @Override
    public List<Operation> getOperationsForPeriod(Date startDate, Date endDate) {
        return null;
    }

    @Override
    public List<Operation> getOperationsByExpenseCategoryForPeriod(ExpenseCategory category, Date startDate, Date endDate) {
        return null;
    }
}
