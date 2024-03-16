package pl.wsb.hotel;

import java.time.LocalDate;


// fields  //

public class Room {
    public int id;
    public String description;
    public double area;
    public int floor;
    public Boolean hasKingSizeBed;
    public Boolean hasBalcony;
    public Boolean hasBathroom;
    public Boolean hasTV;
    public Boolean hasAirConditioning;

    // constructors  //
    public Room(int id, String description, double area, int floor, Boolean hasKingSizeBed, Boolean hasBalcony,
                Boolean hasBathroom, Boolean hasTV, Boolean hasAirConditioning) {
        this.id = id;
        this.description = description;
        this.area = area;
        this.floor = floor;
        this.hasKingSizeBed = hasKingSizeBed;
        this.hasBalcony = hasBalcony;
        this.hasBathroom = hasBathroom;
        this.hasTV = hasTV;
        this.hasAirConditioning = hasAirConditioning;
    }
}
