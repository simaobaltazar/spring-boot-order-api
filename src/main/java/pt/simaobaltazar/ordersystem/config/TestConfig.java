package pt.simaobaltazar.ordersystem.config;


import pt.simaobaltazar.ordersystem.entities.*;
import pt.simaobaltazar.ordersystem.entities.enums.OrderStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import pt.simaobaltazar.ordersystem.repositories.*;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile({"test", "dev"})
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private OrderItemRepository orderItemRepository;

    @Override
    public void run(String... args) throws Exception {

        //Not duplicate the data
        if (userRepository.count() > 0) {
            return;
        }

        Category cat1 = new Category(null, "Electronics");
        Category cat2 = new Category(null, "Books");
        Category cat3 = new Category(null, "Computers");
        Category cat4 = new Category(null, "Gaming");
        Category cat5 = new Category(null, "Home & Kitchen");
        Category cat6 = new Category(null, "Sports");

        Product p1 = new Product(null, "The Lord of the Rings", "Lorem ipsum dolor sit amet, consectetur.", 90.5, "");
        Product p2 = new Product(null, "Smart TV", "Nulla eu imperdiet purus. Maecenas ante.", 2190.0, "");
        Product p3 = new Product(null, "Macbook Pro", "Nam eleifend maximus tortor, at mollis.", 1250.0, "");
        Product p4 = new Product(null, "PC Gamer", "Donec aliquet odio ac rhoncus cursus.", 1200.0, "");
        Product p5 = new Product(null, "Rails for Dummies", "Cras fringilla convallis sem vel faucibus.", 100.99, "");
        Product p6 = new Product(null, "Clean Code", "Sed ut perspiciatis unde omnis iste natus.", 42.9, "");
        Product p7 = new Product(null, "Wireless Headphones", "Quis autem vel eum iure reprehenderit.", 249.99, "");
        Product p8 = new Product(null, "Smartphone X12", "Ut enim ad minima veniam, quis nostrum.", 799.0, "");
        Product p9 = new Product(null, "27 Monitor", "Neque porro quisquam est qui dolorem.", 329.0, "");
        Product p10 = new Product(null, "Mechanical Keyboard", "At vero eos et accusamus et iusto odio.", 89.9, "");
        Product p11 = new Product(null, "Game Console", "Nam libero tempore, cum soluta nobis.", 549.99, "");
        Product p12 = new Product(null, "Wireless Controller", "Temporibus autem quibusdam et aut officiis.", 69.99, "");
        Product p13 = new Product(null, "Espresso Machine", "Itaque earum rerum hic tenetur a sapiente.", 189.0, "");
        Product p14 = new Product(null, "Air Fryer", "Excepteur sint occaecat cupidatat non proident.", 119.5, "");
        Product p15 = new Product(null, "Running Shoes", "Duis aute irure dolor in reprehenderit.", 129.95, "");
        Product p16 = new Product(null, "Yoga Mat", "Fusce sit amet lacus vel nisl aliquam.", 24.99, "");

        categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3, cat4, cat5, cat6));
        productRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16));

        p1.getCategories().add(cat2);
        p2.getCategories().add(cat1);
        p2.getCategories().add(cat3);
        p3.getCategories().add(cat3);
        p4.getCategories().add(cat3);
        p4.getCategories().add(cat4);
        p5.getCategories().add(cat2);
        p6.getCategories().add(cat2);
        p7.getCategories().add(cat1);
        p8.getCategories().add(cat1);
        p9.getCategories().add(cat1);
        p9.getCategories().add(cat3);
        p10.getCategories().add(cat3);
        p10.getCategories().add(cat4);
        p11.getCategories().add(cat1);
        p11.getCategories().add(cat4);
        p12.getCategories().add(cat4);
        p13.getCategories().add(cat5);
        p14.getCategories().add(cat5);
        p15.getCategories().add(cat6);
        p16.getCategories().add(cat6);

        productRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16));

        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
        User u3 = new User(null, "Joana Silva", "joana@gmail.com", "966666666", "123456");
        User u4 = new User(null, "Pedro Costa", "pedro@gmail.com", "955555555", "123456");
        User u5 = new User(null, "Ana Ferreira", "ana@gmail.com", "944444444", "123456");
        User u6 = new User(null, "Rui Martins", "rui@gmail.com", "933333333", "123456");

        Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, u1);
        Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.WAITING_PAYMENT, u2);
        Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.WAITING_PAYMENT, u1);
        Order o4 = new Order(null, Instant.parse("2019-08-01T10:05:00Z"), OrderStatus.SHIPPED, u3);
        Order o5 = new Order(null, Instant.parse("2019-08-15T21:30:45Z"), OrderStatus.CANCELED, u4);
        Order o6 = new Order(null, Instant.parse("2019-09-07T08:12:33Z"), OrderStatus.DELIVERED, u5);
        Order o7 = new Order(null, Instant.parse("2019-09-22T17:48:09Z"), OrderStatus.PAID, u6);
        Order o8 = new Order(null, Instant.parse("2019-10-11T12:00:00Z"), OrderStatus.WAITING_PAYMENT, u3);
        Order o9 = new Order(null, Instant.parse("2019-10-30T14:25:51Z"), OrderStatus.SHIPPED, u2);
        Order o10 = new Order(null, Instant.parse("2019-11-05T09:40:16Z"), OrderStatus.DELIVERED, u4);

        userRepository.saveAll(Arrays.asList(u1, u2, u3, u4, u5, u6));
        orderRepository.saveAll(Arrays.asList(o1, o2, o3, o4, o5, o6, o7, o8, o9, o10));

        OrderItem oi1 = new OrderItem(o1, p1, 2, p1.getPrice());
        OrderItem oi2 = new OrderItem(o1, p3, 1, p3.getPrice());
        OrderItem oi3 = new OrderItem(o2, p3, 2, p3.getPrice());
        OrderItem oi4 = new OrderItem(o3, p5, 2, p5.getPrice());
        OrderItem oi5 = new OrderItem(o3, p6, 1, p6.getPrice());
        OrderItem oi6 = new OrderItem(o4, p2, 1, p2.getPrice());
        OrderItem oi7 = new OrderItem(o4, p7, 1, p7.getPrice());
        OrderItem oi8 = new OrderItem(o5, p8, 1, p8.getPrice());
        OrderItem oi9 = new OrderItem(o6, p4, 1, p4.getPrice());
        OrderItem oi10 = new OrderItem(o6, p9, 2, p9.getPrice());
        OrderItem oi11 = new OrderItem(o6, p10, 1, p10.getPrice());
        OrderItem oi12 = new OrderItem(o7, p11, 1, p11.getPrice());
        OrderItem oi13 = new OrderItem(o7, p12, 2, p12.getPrice());
        OrderItem oi14 = new OrderItem(o8, p13, 1, p13.getPrice());
        OrderItem oi15 = new OrderItem(o8, p14, 1, p14.getPrice());
        OrderItem oi16 = new OrderItem(o9, p15, 1, p15.getPrice());
        OrderItem oi17 = new OrderItem(o9, p16, 3, p16.getPrice());
        OrderItem oi18 = new OrderItem(o10, p7, 1, p7.getPrice());
        OrderItem oi19 = new OrderItem(o10, p6, 2, p6.getPrice());

        orderItemRepository.saveAll(Arrays.asList(oi1, oi2, oi3, oi4, oi5, oi6, oi7, oi8, oi9, oi10,
                oi11, oi12, oi13, oi14, oi15, oi16, oi17, oi18, oi19));

        Payment pay1 = new Payment(null, Instant.parse("2019-06-20T21:53:07Z"), o1);
        o1.setPayment(pay1);
        Payment pay2 = new Payment(null, Instant.parse("2019-08-01T11:30:00Z"), o4);
        o4.setPayment(pay2);
        Payment pay3 = new Payment(null, Instant.parse("2019-09-07T09:00:00Z"), o6);
        o6.setPayment(pay3);
        Payment pay4 = new Payment(null, Instant.parse("2019-09-22T18:10:00Z"), o7);
        o7.setPayment(pay4);
        Payment pay5 = new Payment(null, Instant.parse("2019-10-30T15:00:00Z"), o9);
        o9.setPayment(pay5);
        Payment pay6 = new Payment(null, Instant.parse("2019-11-05T10:15:00Z"), o10);
        o10.setPayment(pay6);

        orderRepository.saveAll(Arrays.asList(o1, o4, o6, o7, o9, o10));
    }
}
