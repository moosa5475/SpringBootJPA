package com.jpa;

import com.jpa.PolicyDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserListInterface extends JpaRepository<PolicyDetails, Long> {
    List<PolicyDetails> findAll();
}
