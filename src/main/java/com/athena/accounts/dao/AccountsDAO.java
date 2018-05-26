package com.athena.accounts.dao;

import com.athena.accounts.model.AccountsModel;

import java.util.List;

public interface AccountsDAO {

    public void createNewAccount(AccountsModel accountsModel);
    public void updateAccount(AccountsModel accountsModel);
    public void getAccountById(int id);
    public void deleteAccount(int id);
    public List<AccountsModel> listofAccounts();
    public List<AccountsModel> deleteAccounts(List<Integer> id);
}
