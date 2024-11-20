package com.jamili.levesangue.controller;

import com.jamili.levesangue.model.Donor;
import com.jamili.levesangue.service.DonorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/donors")
public class DonorController {
    @Autowired
    private DonorService donorService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Donor createDonor(@RequestBody Donor donor) {
        return donorService.createDonor(donor);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping
    public List<Donor> getAllDonors() {
        return donorService.getAllDonors();
    }
}
