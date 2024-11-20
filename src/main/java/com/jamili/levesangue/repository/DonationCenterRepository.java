package com.jamili.levesangue.repository;

import com.jamili.levesangue.model.DonationCenter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DonationCenterRepository extends JpaRepository<DonationCenter, Long> {
    DonationCenter findByCnpj(String cnpj);
}