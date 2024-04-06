package pl.wsb.hotel;

public class Hotel {
    //  fields  //

    private String name;

    private SpecialService[] specialService;
    private Client[] clients;
    private RoomReservation[] reservations;
    private Room[] rooms;

    //  getters  //

    public String getName() {
        return name;
    }

    //  setters  //

    public void setName(String name) {
        this.name = name;
    }

    //constructors  //

    public Hotel(String name) {
        this.name = name;
        this.specialService = new SpecialService[0];
        this.clients = new Client[0];
        this.reservations = new RoomReservation[0];
        this.rooms = new Room[0];
    }
}
