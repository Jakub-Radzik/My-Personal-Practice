package com.example.springtransactions.JDBCExample;

import com.example.springtransactions.model.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class JDBCexec implements CommandLineRunner {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    private final JdbcTemplate jdbcTemplate;
    private final BookingService bookingService;

    @Autowired
    public JDBCexec(JdbcTemplate jdbcTemplate, BookingService bookingService) {
        this.jdbcTemplate = jdbcTemplate;
        this.bookingService = bookingService;
    }

    @Override
    public void run(String... args) throws Exception {

        jdbcTemplate.execute("DROP TABLE customers IF EXISTS");
        jdbcTemplate.execute("CREATE TABLE customers(id SERIAL, first_name VARCHAR(255), last_name VARCHAR(255))");

        AtomicInteger id = new AtomicInteger(1);

        List<Customer> customers = Stream.of("Jakub Radzik", "Piotr PAtalas", "Andrzej Gębura")
                .map(name -> name.split(" "))
                .map(tab -> new Customer((long) id.getAndIncrement(), tab[0], tab[1]))
                .collect(Collectors.toList());

        customers.forEach(bookingService::book);

    }
}
