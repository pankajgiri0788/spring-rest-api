package techlearn.springboot.restapi.persistance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import techlearn.springboot.restapi.persistance.domain.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
