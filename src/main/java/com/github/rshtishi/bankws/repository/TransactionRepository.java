package com.github.rshtishi.bankws.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.github.rshtishi.bankws.entity.Transaction;

@Repository
public interface TransactionRepository extends CrudRepository<Transaction, Integer>{
	
	List<Transaction> findAll();
	
	List<Transaction> findByClient(String client);

}
