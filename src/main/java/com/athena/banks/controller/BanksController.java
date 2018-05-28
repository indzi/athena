package com.athena.banks.controller;

import com.athena.banks.services.BanksServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class BanksController {
    private BanksServices banksServices;

    @Autowired(required=true)
    @Qualifier(value="banksServices")
    public void setPersonService(BanksServices banksServices){
        this.banksServices = banksServices;
    }
}
