package com.athena.accounts.dao;

import com.athena.accounts.model.AccountsModel;
import org.hibernate.Session;
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
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(accountsModel);
    }

    public void updateAccount(AccountsModel accountsModel) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(accountsModel);
    }

    public AccountsModel getAccountById(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        AccountsModel accountsModel = (AccountsModel) session.load(AccountsModel.class, new Integer(id));
        return accountsModel;
    }

    public void deleteAccount(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        AccountsModel accountsModel = (AccountsModel) session.load(AccountsModel.class, new Integer(id));
        if(null != accountsModel){
            session.delete(accountsModel);
        }
    }

    public List<AccountsModel> listofAccounts() {
        return null;
    }

    public List<AccountsModel> deleteAccounts(List<Integer> id) {
        return null;
    }
}
