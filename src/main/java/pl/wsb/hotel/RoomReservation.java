package pl.wsb.hotel;

import java.time.LocalDate;

public class RoomReservation {

    //  fields  //
    public LocalDate Date;
    public boolean IsConfirmed;
    public Client Client;
    public Room Room;


    //  getters  //

    public LocalDate getDate() {
        return Date;
    }

    public boolean isConfirmed() {
        return IsConfirmed;
    }

    public pl.wsb.hotel.Client getClient() {
        return Client;
    }

    public pl.wsb.hotel.Room getRoom() {
        return Room;
    }


    //  setters  //

    public void setDate(LocalDate date) {
        Date = date;
    }

    public void setConfirmed(boolean confirmed) {
        IsConfirmed = confirmed;
    }

    public void setClient(pl.wsb.hotel.Client client) {
        Client = client;
    }

    public void setRoom(pl.wsb.hotel.Room room) {
        Room = room;
    }

    //  constructors  //
    public RoomReservation(LocalDate date, Client client, Room room) {
        this.Date = date;
        this.Client = client;
        this.Room = room;
        this.IsConfirmed = false;
    }

    //  other methods  //
    public void ConfirmReservation() {
        this.IsConfirmed = true;
    }
}
