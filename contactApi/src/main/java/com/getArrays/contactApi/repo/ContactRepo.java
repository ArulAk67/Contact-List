package com.getArrays.contactApi.repo;

import com.getArrays.contactApi.domain.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ContactRepo extends JpaRepository<Contact,String> {
    Optional<Contact> findById(String id);
}