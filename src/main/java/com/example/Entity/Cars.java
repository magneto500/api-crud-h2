package com.example.Entity;


import com.example.Enum.Kolor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data

public class Cars {
				@Id
				@GeneratedValue(strategy = GenerationType.AUTO)
				private Long id;
				@Enumerated(EnumType.STRING)
				private Kolor kolor;
				private String model;
				private LocalDate dataProdukcji;
}
