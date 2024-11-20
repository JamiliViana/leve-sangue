package com.jamili.levesangue.controller;

import com.jamili.levesangue.model.DonationCenter;
import com.jamili.levesangue.service.DonationCenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/centers")
public class DonationCenterController {
    @Autowired
    private DonationCenterService donationCenterService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public DonationCenter createDonationCenter(@RequestBody DonationCenter donationCenter) {
        return donationCenterService.createDonationCenter(donationCenter);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping
    public List<DonationCenter> getAllDonationCenters() {
        return donationCenterService.getAllDonationCenters();
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{cnpj}")
    public DonationCenter getDonationCenterByCnpj(@PathVariable String cnpj) {
        return donationCenterService.getDonationCenterByCnpj(cnpj);
    }
}