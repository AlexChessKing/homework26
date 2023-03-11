package ru.netology;

public class Person {
    private final String name;
    private final String surname;
    private int numOfTickets;

    public Person (String name, String surname, int numOfTickets) {
        this.name = name;
        this.surname = surname;
        this.numOfTickets = numOfTickets;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getNumOfTickets() {
        return numOfTickets;
    }

    public void spendTicket() {
        numOfTickets--;
    }
}
