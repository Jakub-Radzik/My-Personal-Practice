package com.example.springtransactions.JDBCExample;

import com.example.springtransactions.model.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class BookingService {
    private final static Logger logger = LoggerFactory.getLogger(BookingService.class);

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public BookingService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Transactional
    public void book(Customer... customers){
        for(Customer customer: customers) {
            logger.info("Booking for {} {}", customer.getFirstName(), customer.getLastName());
            String statement = String.format("INSERT INTO BOOKINGS(FIRST_NAME, LAST_NAME) values ('%s', '%s');", customer.getFirstName(), customer.getLastName());
            logger.info("SQL: {}", statement);
            jdbcTemplate.update(statement);
        }
    }

    public List<String> findAllBookings() {
        return jdbcTemplate.query("select FIRST_NAME, LAST_NAME  from BOOKINGS",
                (rs, rowNum) -> rs.getString("FIRST_NAME")+" "+rs.getString("LAST_NAME"));
    }
}
