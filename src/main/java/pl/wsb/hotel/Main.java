package pl.wsb.hotel;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Client client1 = new Client("1", "Jan", "Paweł", LocalDate.of(1950, 5, 15), "karolwojtyla@gmail.com", "123123123", "Papieska", "55-555", "Wadowice");
        Client client2 = new Client("2", "Sebastian", "Alvarez", LocalDate.of(1980, 5, 15), "sentence@gmail.com", "12312355", "Uberstrasse", "55-155", "Berlin");
        Client client3 = new Client("3", "Will", "Smith", LocalDate.of(1990, 5, 15), "willsmith@gmail.com", "993123", "RodeoDrive", "5-155", "Los Angeles");

        Room room1 = new Room("101", "Zjawiskowy", 30.00, 10, true, false, true, false, true);
        Room room2 = new Room("102", "Piękny", 25.00, 10, true, false, true, false, true);
        Room room3 = new Room("103", "Wybitny", 35.00, 10, true, true, true, true, true);

        RoomReservation reservation1 = new RoomReservation(LocalDate.of(2024, 4, 10), client1, room1);
        RoomReservation reservation2 = new RoomReservation(LocalDate.of(2024, 4, 12), client2, room2);
        RoomReservation reservation3 = new RoomReservation(LocalDate.of(2024, 4, 15), client3, room3);

        System.out.println("Rezerwacja 1:");
        System.out.println("Klient: " + reservation1.getClient().getFullName());
        System.out.println("Pokój: " + reservation1.getRoom().getId());
        System.out.println("Data: " + reservation1.getDate());
        System.out.println("Potwierdzona: " + reservation1.isConfirmed());

        System.out.println("\nRezerwacja 2:");
        System.out.println("Klient: " + reservation2.getClient().getFullName());
        System.out.println("Pokój: " + reservation2.getRoom().getId());
        System.out.println("Data: " + reservation2.getDate());
        System.out.println("Potwierdzona: " + reservation2.isConfirmed());

        System.out.println("\nRezerwacja 3:");
        System.out.println("Klient: " + reservation3.getClient().getFullName());
        System.out.println("Pokój: " + reservation3.getRoom().getId());
        System.out.println("Data: " + reservation3.getDate());
        System.out.println("Potwierdzona: " + reservation3.isConfirmed());

        reservation1.confirmReservation();

        System.out.println("\n Potwierdzenie dla rezerwacji 1 " + reservation1.isConfirmed());

    }
}