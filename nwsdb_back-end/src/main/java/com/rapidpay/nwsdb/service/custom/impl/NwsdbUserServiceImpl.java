package com.rapidpay.nwsdb.service.custom.impl;

import java.util.List;
import java.util.Optional;
import com.rapidpay.nwsdb.model.NwsdbUser;
import com.rapidpay.nwsdb.repo.custom.NwsdbUserRepo;
import com.rapidpay.nwsdb.service.custom.NwsdbUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NwsdbUserServiceImpl implements NwsdbUserService{

    @Autowired
    private NwsdbUserRepo nwsdbUserRepo;

    @Override
    public List<NwsdbUser> getAllNwsdbUsers() throws Exception {
        return nwsdbUserRepo.findAll();
    }

    @Override
    public Optional<NwsdbUser> getNwsdbUser(int id) throws Exception {
        return nwsdbUserRepo.findById(id);
    }

    @Override
    public NwsdbUser saveNwsdbUser(NwsdbUser nwsdbUser) throws Exception {
        return nwsdbUserRepo.save(nwsdbUser);
    }

    @Override
    public void updateNwsdbUser(NwsdbUser nwsdbUser) throws Exception {
        // TODO Auto-generated method stub

    }

    @Override
    public void deleteNwsdbUser(int id) throws Exception {
        // TODO Auto-generated method stub

    }

}
