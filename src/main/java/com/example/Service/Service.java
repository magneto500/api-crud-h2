package com.example.Service;

import com.example.Entity.Cars;
import com.example.Enum.Kolor;
import com.example.Repo.CarRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.EventListener;

import java.time.LocalDate;
import java.util.Optional;


@org.springframework.stereotype.Service
public class Service {
				public CarRepo carRepo;


				@Autowired
				public Service(CarRepo carRepo) {
								this.carRepo = carRepo;
				}

				public Cars addCars( Cars cars){
								return carRepo.save(cars);
				}

				public Optional<Cars>findById(Long id){
								return carRepo.findById(id);
				}
				public Iterable<Cars> showAll(){
								return carRepo.findAll();
				}
				public void deleteById(Long id){
								carRepo.deleteById(id);
				}








				@EventListener(ApplicationEvent.class)
				public void addToDB(){
								carRepo.save(new Cars(1L, Kolor.Czerwony, "Opel Astra J",
																LocalDate.of(2014,01,14)));

								carRepo.save(new Cars(2L, Kolor.Czarny, "Opel Calibra",
																LocalDate.of(1997,07,24)));

								carRepo.save(new Cars(3L, Kolor.Niebieski, "suzuki sx4 s-cross",
																LocalDate.of(2006,06,1)));
				}

}
