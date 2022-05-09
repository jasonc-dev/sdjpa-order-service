package jason.springboot.sdjpa.orderservice.repositories;

import jason.springboot.sdjpa.orderservice.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
