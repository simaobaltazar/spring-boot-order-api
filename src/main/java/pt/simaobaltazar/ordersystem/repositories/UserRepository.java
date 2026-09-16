package pt.simaobaltazar.ordersystem.repositories;

import pt.simaobaltazar.ordersystem.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {


}
