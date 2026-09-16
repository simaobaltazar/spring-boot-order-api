package pt.simaobaltazar.ordersystem.repositories;


import pt.simaobaltazar.ordersystem.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
