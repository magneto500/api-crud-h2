package com.example.ControllerAPI;


import com.example.Entity.Cars;
import com.example.Service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/cars")
public class ControllerApi {

				Service service;

				@Autowired
				public ControllerApi(Service service) {
								this.service = service;
				}

				@GetMapping("/show")
				public Iterable<Cars> showAll() {
								return service.showAll();
				}

				@DeleteMapping("/delete/{id}")
				public String deleteById(@PathVariable Long id) {
								service.deleteById(id);
								return "redirect:/show";
				}

				@GetMapping("/show/{id}")
				public Optional<Cars> findById(@PathVariable Long id) {
								return service.findById(id);
				}

				@PostMapping("/add/4")
				public void addCar() {
								service.saveItem();
				}
}
