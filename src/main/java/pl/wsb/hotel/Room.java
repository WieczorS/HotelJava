package pl.wsb.hotel;

import java.time.LocalDate;


// fields  //

public class Room {
    public String id;
    public String description;
    public double area;
    public int floor;
    public Boolean hasKingSizeBed;
    public Boolean hasBalcony;
    public Boolean hasBathroom;
    public Boolean hasTV;
    public Boolean hasAirConditioning;

    // constructors  //
    public Room(String id, String description, double area, int floor, Boolean hasKingSizeBed, Boolean hasBalcony,
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

    public Room(){

    }

    // getters and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public Boolean getHasKingSizeBed() {
        return hasKingSizeBed;
    }

    public void setHasKingSizeBed(Boolean hasKingSizeBed) {
        this.hasKingSizeBed = hasKingSizeBed;
    }

    public Boolean getHasBalcony() {
        return hasBalcony;
    }

    public void setHasBalcony(Boolean hasBalcony) {
        this.hasBalcony = hasBalcony;
    }

    public Boolean getHasBathroom() {
        return hasBathroom;
    }

    public void setHasBathroom(Boolean hasBathroom) {
        this.hasBathroom = hasBathroom;
    }

    public Boolean getHasTV() {
        return hasTV;
    }

    public void setHasTV(Boolean hasTV) {
        this.hasTV = hasTV;
    }

    public Boolean getHasAirConditioning() {
        return hasAirConditioning;
    }

    public void setHasAirConditioning(Boolean hasAirConditioning) {
        this.hasAirConditioning = hasAirConditioning;
    }
}
