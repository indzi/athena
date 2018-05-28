package com.athena.banks.dao;

import com.athena.banks.model.BanksModel;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BanksDAOImpl implements BanksDAO{
    private SessionFactory sessionFactory;
    public void setSessionFactory(SessionFactory sf) {
        this.sessionFactory = sf;
    }
    public void createNewAccount(BanksModel banksModel) {

    }
    @Override
    public void createNewBank(BanksModel banksModel) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(banksModel);
    }

    @Override
    public void updateBank(BanksModel banksModel) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(banksModel);
    }

    @Override
    public BanksModel getBankById(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        BanksModel bank = (BanksModel) session.load(BanksModel.class, new Integer(id));
        return bank;
    }

    @Override
    public void deleteBank(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        BanksModel bank = (BanksModel) session.load(BanksModel.class, new Integer(id));
        if(null != bank){
            session.delete(bank);
        }
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<BanksModel> listofBanks() {
        /*Session session = this.sessionFactory.getCurrentSession();
        List<BanksModel> banksModelList = session.createQuery("from BanksModel").list();
        return banksModelList;*/
        return null;
    }

    @Override
    public List<BanksModel> deleteBanks(List<Integer> id) {
        return null;
    }
}
