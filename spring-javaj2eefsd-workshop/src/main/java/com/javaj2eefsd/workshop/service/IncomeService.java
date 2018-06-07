package com.javaj2eefsd.workshop.service;

import java.util.List;
import com.javaj2eefsd.workshop.model.Income;

/**
 * @author Nagarjuna - IncomeService interface used to validate the business logic and help to call the dao layer
 */
public interface IncomeService {
	/**
     * getIncomeAll method used to retrieve the income data from db
     *
     * @param incomeId
     * @return
     * @throws Exception
     */
    List<Income> getIncomeAll(String userId) throws Exception;

    /**
     * createIncome method used to create new income data in db
     *
     * @param incomeObj
     * @return
     * @throws Exception
     */
    Income createIncome(Income incomeObj) throws Exception;

    /**
     * deleteIncome method used to delete the income data based on user input
     *
     * @param incomeId
     * @return
     * @throws Exception
     */
    void deleteIncome(String incomeId) throws Exception;

    /**
     * updateIncome method used to update the income data in db
     *
     * @param incomeObj
     * @return
     * @throws Exception
     */
    Income updateIncome(Income incomeObj) throws Exception;

    /**
     * searchIncome method used to search the income data based on user inputs
     *
     * @param incomeKey
     * @return
     * @throws Exception
     */
    List<Income> searchIncome(String incomeKey) throws Exception;
}
