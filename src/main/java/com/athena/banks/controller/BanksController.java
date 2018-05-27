package com.athena.banks.controller;

import com.athena.banks.services.BanksServices;

@Controller
public class BanksController {
    private BanksServices banksServices;

    @Autowired(required=true)
    @Qualifier(value="banksServices")
    public void setPersonService(BanksServices banksServices){
        this.banksServices = banksServices;
    }
}
