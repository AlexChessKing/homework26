package ru.netology;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Person> queue = new LinkedList<>(generateClients());

        while (true) {
            if (!queue.isEmpty()) {
                Person person = queue.poll();
                System.out.println(person.getName() + " " + person.getSurname() + " прокатился(лась) на аттракционе");
                person.spendTicket();
                if (person.getNumOfTickets() != 0) {
                    queue.add(person);
                }
            } else {
                break;
            }
        }
    }

    private static List<Person> generateClients() {
        return List.of(
            new Person("Дмитрий", "Яковлев", 5),
            new Person("Алексей", "Хасанов", 4),
            new Person("Арсений", "Яковлев", 3),
            new Person("Анастасия", "Хасанова", 2),
            new Person("Иван", "Яковлев", 1)
        );
    }
}
