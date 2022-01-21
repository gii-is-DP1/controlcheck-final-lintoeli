package org.springframework.samples.petclinic.care;


import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;

import org.springframework.samples.petclinic.model.BaseEntity;
import org.springframework.samples.petclinic.pet.Visit;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "CaresProvision")
public class CareProvision extends BaseEntity{   
    @NotNull
    @DecimalMin("0.0") 
    @DecimalMax("10.0")
	double duration;
    
    @ManyToOne
    Visit visit;
    
    @NotNull
    @ManyToOne
    Care care;   
}
