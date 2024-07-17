package com.nt.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nt.model.Customer;


@Repository
public interface ICustmorRepo extends JpaRepository<Customer, Integer> {

}
