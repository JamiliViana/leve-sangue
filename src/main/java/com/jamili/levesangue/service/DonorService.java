package com.jamili.levesangue.service;


import com.jamili.levesangue.model.Donor;
import com.jamili.levesangue.repository.DonorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DonorService {
    @Autowired
    private DonorRepository donorRepository;

    public Donor createDonor (Donor donor){
        return this.donorRepository.save(donor);
    }

    public List<Donor> getAllDonors() {
        return donorRepository.findAll();
    }

    public Donor getDonorByCpf(String cpf) {
        return donorRepository.findByCpf(cpf);
    }
}
