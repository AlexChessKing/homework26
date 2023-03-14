package ru.netology;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonTest {
    Person person;

    @BeforeEach
    void beforeEach() {
        person = new Person("Вася", "Петечкин", 2);
        System.out.println("Перед каждым тестом");
    }

    @AfterEach
    void afterEach(){
        System.out.println("После каждого теста");
    }

    @Test
    void test_positive_value_of_the_number_of_tickets() {
        Assertions.assertTrue(person.getNumOfTickets() > 0);
    }

    @Test
    void test_number_of_remaining_tickets() {
        person.spendTicket();
        Assertions.assertEquals(2 - 1, person.getNumOfTickets());
    }

    @Test
    void test_checking_the_name_input() {
        Assertions.assertFalse(person.getName().isEmpty());
    }
}