package com.jamili.levesangue.service;

import com.jamili.levesangue.repository.DonationCenterRepository;
import com.jamili.levesangue.repository.DonorRepository;
import com.jamili.levesangue.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private DonorRepository donorRepository;

    @Autowired
    private DonationCenterRepository donationCenterRepository;

}
