package pl.wsb.hotel;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


public class HotelTest {

    private Hotel hotel;

    @BeforeEach
    void setUp() {
        hotel = new Hotel("Test Hotel");
    }

    @Test
    void testGetName() {
        assertEquals("Test Hotel", hotel.getName());
    }

    @Test
    void testSetName() {
        hotel.setName("New Hotel Name");
        assertEquals("New Hotel Name", hotel.getName());
    }

    @Test
    void testGetFullName() {
        Client client = new Client("1", "John", "Doe", LocalDate.of(1990, 1, 1), "john.doe@example.com", "123456789", "123 Main St", "12345", "Anytown");
        assertEquals("John Doe", client.getFullName());
    }

    @Test
    void testGetId() {
        Client client = new Client("1", "John", "Doe", LocalDate.of(1990, 1, 1), "john.doe@example.com", "123456789", "123 Main St", "12345", "Anytown");
        assertEquals("1", client.getId());
    }

    @Test
    void testSetId() {
        Client client = new Client();
        client.setId("2");
        assertEquals("2", client.getId());
    }

    @Test
    void testOrderService() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        LuggageService luggageService = new LuggageService();
        luggageService.orderService();

        String expected = "Hotel will take care of your luggage.\n";
        assertEquals(expected, outContent.toString());

        System.setOut(System.out);
    }

    @Test
    void testOrderServiceDog() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        LuggageService luggageService = new LuggageService();
        luggageService.orderServiceDog();

        String expected = "Hotel will store your Dog's toys\n";
        assertEquals(expected, outContent.toString());

        System.setOut(System.out);
    }

    @Test
    void testOrderServiceKid() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        LuggageService luggageService = new LuggageService();
        luggageService.orderServiceKid();

        String expected = "Hotel will store your Kid's toys\n";
        assertEquals(expected, outContent.toString());

        System.setOut(System.out);
    }

    @Test
    void testRoomConstructorAndGetters() {
        Room room = new Room("101", "Standard Room", 25.0, 1, true, false, true, false, true);

        assertEquals("101", room.getId());
        assertEquals("Standard Room", room.getDescription());
        assertEquals(25.0, room.getArea());
        assertEquals(1, room.getFloor());
        assertTrue(room.getHasKingSizeBed());
        assertFalse(room.getHasBalcony());
        assertTrue(room.getHasBathroom());
        assertFalse(room.getHasTV());
        assertTrue(room.getHasAirConditioning());
    }

    @Test
    void testRoomSetters() {
        Room room = new Room();

        room.setId("102");
        room.setDescription("Deluxe Room");
        room.setArea(30.0);
        room.setFloor(2);
        room.setHasKingSizeBed(false);
        room.setHasBalcony(true);
        room.setHasBathroom(true);
        room.setHasTV(false);
        room.setHasAirConditioning(true);

        assertEquals("102", room.getId());
        assertEquals("Deluxe Room", room.getDescription());
        assertEquals(30.0, room.getArea());
        assertEquals(2, room.getFloor());
        assertFalse(room.getHasKingSizeBed());
        assertTrue(room.getHasBalcony());
        assertTrue(room.getHasBathroom());
        assertFalse(room.getHasTV());
        assertTrue(room.getHasAirConditioning());
    }

    @Test
    void testRoomReservationConstructorAndGetters() {
        Client client = new Client("1", "John", "Doea", LocalDate.of(1990, 1, 1), "john.doe@example.com", "123456789", "123 Main St", "12345", "Anytown");
        Room room = new Room("101", "Standard Room", 25.0, 1, true, false, true, false, true);

        RoomReservation reservation = new RoomReservation(LocalDate.of(2024, 4, 10), client, room);

        assertEquals(LocalDate.of(2024, 4, 10), reservation.getDate());
        assertFalse(reservation.isConfirmed());
        assertEquals(client, reservation.getClient());
        assertEquals(room, reservation.getRoom());
    }

    @Test
    void testRoomReservationSetters() {
        Client client = new Client("2", "Jane", "Smith", LocalDate.of(1985, 3, 15), "jane.smith@example.com", "987654321", "456 Elm St", "54321", "Othertown");
        Room room = new Room("102", "Deluxe Room", 30.0, 2, false, true, true, false, true);

        RoomReservation reservation = new RoomReservation(null, null, null);

        reservation.setDate(LocalDate.of(2024, 4, 12));
        reservation.setConfirmed(true);
        reservation.setClient(client);
        reservation.setRoom(room);

        assertEquals(LocalDate.of(2024, 4, 12), reservation.getDate());
        assertTrue(reservation.isConfirmed());
        assertEquals(client, reservation.getClient());
        assertEquals(room, reservation.getRoom());
    }

    @Test
    void testConfirmReservation() {
        Client client = new Client("3", "Alice", "Johnson", LocalDate.of(1975, 8, 20), "alice.johnson@example.com", "135792468", "789 Maple St", "67890", "Somewhere");
        Room room = new Room("103", "Premium Room", 35.0, 3, true, true, true, true, true);

        RoomReservation reservation = new RoomReservation(LocalDate.of(2024, 4, 15), client, room);

        reservation.confirmReservation();

        assertTrue(reservation.isConfirmed());
    }
}
