package com.athena.banks.dao;

import com.athena.banks.model.BanksModel;

import java.util.List;

public interface BanksDAO {
    public void createNewBank(BanksModel banksModel);
    public void updateBank(BanksModel banksModel);
    public BanksModel getBankById(int id);
    public void deleteBank(int id);
    public List<BanksModel> listofBanks();
    public List<BanksModel> deleteBanks(List<Integer> id);
}
