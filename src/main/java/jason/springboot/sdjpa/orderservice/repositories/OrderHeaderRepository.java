package jason.springboot.sdjpa.orderservice.repositories;

import jason.springboot.sdjpa.orderservice.domain.OrderHeader;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderHeaderRepository extends JpaRepository<OrderHeader, Long> {
}
