package com.example.fisairlinepassenge.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.fisairlinepassenge.modal.Passengerrole;
import com.example.fisairlinepassenge.repo.PassengerRepository;

@Service
public class PassengerServiceImpl implements PassengerService {
	
	@Autowired
	PassengerRepository repo;

	
	
	
	@Override
	public Passengerrole addData(Passengerrole pass) {
		// TODO Auto-generated method stub
		return repo.save(pass);
	}

	@Override
	public Passengerrole updateData(Passengerrole pass) {
		// TODO Auto-generated method stub
		return repo.save(pass);
	}

	@Override
	public String deleteData(int PassengerId) {
		// TODO Auto-generated method stub
		repo.deleteById(PassengerId);
		return "deleted";
	}

	@Override
	public String deletePassenger(int PassengerId) {
		// TODO Auto-generated method stub
	repo.deleteById(PassengerId);
	return "Passenger deleted..";
	}

	

	

	

}
