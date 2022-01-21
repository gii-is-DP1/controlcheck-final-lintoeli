package org.springframework.samples.petclinic.care;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface CareProvisionRepository extends CrudRepository<CareProvision, Integer>{
    @Query("SELECT capr FROM CareProvision capr")
	List<CareProvision> findAll(); 
    
    //@Query("SELECT carepro FROM CareProvision carepro.id=?1")
   // Optional<CareProvision> findById(int id);
    
    //CareProvision save(CareProvision p);
	@Query("SELECT care FROM Care care")
    List<Care> findAllCares();
    
	
	//List<Care> findCompatibleCares(String petTypeName);
    //Care findCareByName(String name);
   // List<CareProvision> findCaresProvidedByVisitId(Integer visitId);
}
