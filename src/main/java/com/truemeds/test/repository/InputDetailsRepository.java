package com.truemeds.test.repository;

import com.truemeds.test.model.InputDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InputDetailsRepository extends JpaRepository<InputDetails, Integer> {
}
