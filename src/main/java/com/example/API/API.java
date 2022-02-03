package com.example.API;


import com.example.Entity.Cars;
import com.example.Service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cars")
public class API {

				Service service;

				@Autowired
				public API(Service service) {
								this.service = service;
				}


				@GetMapping("/show")
				public Iterable<Cars> showAll() {
								return service.showAll();
				}


				@DeleteMapping("/delete/{id}")
				public String deleteById(@PathVariable Long id) {
								service.deleteById(id);
								return "redirect:";
				}
				@GetMapping("/show/{id}")
				public Iterable<Cars> findById(@PathVariable Long id){
								service.findById(id);
								
				}
}
