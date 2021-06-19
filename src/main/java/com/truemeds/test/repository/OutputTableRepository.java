package com.truemeds.test.repository;

import com.truemeds.test.model.OutputTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OutputTableRepository extends JpaRepository<OutputTable, Integer> {
}
