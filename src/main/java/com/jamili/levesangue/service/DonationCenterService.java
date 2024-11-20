package com.jamili.levesangue.service;

import com.jamili.levesangue.model.DonationCenter;
import com.jamili.levesangue.repository.DonationCenterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DonationCenterService {

    @Autowired
    private DonationCenterRepository donationCenterRepository;

    public DonationCenter createDonationCenter(DonationCenter donationCenter) {
        return donationCenterRepository.save(donationCenter);
    }

    public List<DonationCenter> getAllDonationCenters() {
        return donationCenterRepository.findAll();
    }

    public DonationCenter getDonationCenterByCnpj(String cnpj) {
        return donationCenterRepository.findByCnpj(cnpj);
    }

}
