package ch.zli.m223.crm.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import ch.zli.m223.crm.model.Customer;
import ch.zli.m223.crm.model.impl.CustomerImpl;

public interface CustomerRepository extends JpaRepository<CustomerImpl, Long>{
	
	public Optional<CustomerImpl> findCustomerByName(String name);
	
	public default Customer add(String name, String street, String city) {
		return save(new CustomerImpl(name, street, city));
	}
}
