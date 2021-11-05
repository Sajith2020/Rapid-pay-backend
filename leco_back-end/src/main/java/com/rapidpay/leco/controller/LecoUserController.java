package com.rapidpay.leco.controller;

import java.util.List;
import java.util.Optional;
import com.rapidpay.leco.model.LecoUser;
import com.rapidpay.leco.service.custom.LecoUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/leco_user")
public class LecoUserController {

    @Autowired
    private LecoUserService lecoUserService;

    @GetMapping("/")
    public String get() {
        try {
            return "Rapid Pay - LECO Backend Up & Running...";
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    @GetMapping("/getAllLecoUsers")
    public List<LecoUser> getAllLecoUsers() {
        try {
            return lecoUserService.getAllLecoUsers();
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    @GetMapping("/getLecoUser/{id}")
    public Optional<LecoUser> getLecoUser(@PathVariable("id") int id) {
        try {
            return lecoUserService.getLecoUser(id);
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    @PostMapping("/saveLecoUser")
    public LecoUser saveLecoUser(@RequestBody LecoUser lecoUser) {
        try {
            return lecoUserService.saveLecoUser(lecoUser);
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    @PutMapping("/updateLecoUser")
    public void updateLecoUser(@RequestBody LecoUser lecoUser) {
        try {
            lecoUserService.updateLecoUser(lecoUser);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @DeleteMapping("/deleteLecoUser/{id}")
    public void deleteLecoUser(@PathVariable("id") int id) {
        try {
            lecoUserService.deleteLecoUser(id);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
