package pt.simaobaltazar.ordersystem.repositories;

import pt.simaobaltazar.ordersystem.entities.OrderItem;
import pt.simaobaltazar.ordersystem.entities.pk.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
}
