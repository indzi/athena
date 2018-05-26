package com.athena.accounts.dao;

import com.athena.accounts.model.AccountsModel;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AccountsDAOImp implements AccountsDAO{
    private SessionFactory sessionFactory;
    public void setSessionFactory(SessionFactory sf) {
        this.sessionFactory = sf;
    }
    public void createNewAccount(AccountsModel accountsModel) {

    }

    public void updateAccount(AccountsModel accountsModel) {

    }

    public void getAccountById(int id) {

    }

    public void deleteAccount(int id) {

    }

    public List<AccountsModel> listofAccounts() {
        return null;
    }

    public List<AccountsModel> deleteAccounts(List<Integer> id) {
        return null;
    }
}
