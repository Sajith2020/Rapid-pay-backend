package com.rapidpay.leco.service.custom.impl;

import java.util.List;
import java.util.Optional;

import com.rapidpay.leco.model.LecoUser;
import com.rapidpay.leco.repo.custom.LecoUserRepo;
import com.rapidpay.leco.service.custom.LecoUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LecoUserServiceImpl implements LecoUserService {

    @Autowired
    private LecoUserRepo lecoUserRepo;

    @Override
    public List<LecoUser> getAllLecoUsers() throws Exception {
        return lecoUserRepo.findAll();
    }

    @Override
    public Optional<LecoUser> getLecoUser(int id) throws Exception {
        return lecoUserRepo.findById(id);
    }

    @Override
    public LecoUser saveLecoUser(LecoUser lecoUser) throws Exception {
        return lecoUserRepo.save(lecoUser);
    }

    @Override
    public void updateLecoUser(LecoUser lecoUser) throws Exception {
        // TODO Auto-generated method stub

    }

    @Override
    public void deleteLecoUser(int id) throws Exception {
        // TODO Auto-generated method stub

    }

}
