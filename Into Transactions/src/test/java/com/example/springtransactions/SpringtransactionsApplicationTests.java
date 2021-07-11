package com.example.springtransactions;

import com.example.springtransactions.JDBCExample.BookingService;
import com.example.springtransactions.model.Customer;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest()
class SpringtransactionsApplicationTests {

    @Autowired
    BookingService bookingService;

    @Test
    void contextLoads() {
    }

    @Test
    void bookingService(){

        Customer c1 = new Customer(1L, "Jakub", "Radzik");
        Customer c2 = new Customer(2L, "Piotr", "Patalas");
        bookingService.book(c1,c2);

        Assertions.assertAll(
                () -> Assertions.assertNotEquals(c1, c2),
                () -> Assertions.assertEquals(c1.getFirstName()+" "+c1.getLastName(), bookingService.findAllBookings().get(0)),
                () -> Assertions.assertEquals(c2.getFirstName()+" "+c2.getLastName(), bookingService.findAllBookings().get(1))
        );
    }


}
