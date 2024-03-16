package pl.wsb.hotel;

import java.time.LocalDate;

public class Client {
    private int id;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private String email;
    private String phoneNumber;
    private String address;
    private String city;
    private String postalCode;

    private int getAge() {
        if (this.birthDate == null) {
            return 0;
        }
        return LocalDate.now().getYear() - this.birthDate.getYear();
    }

    private String getFullName() {
        return this.firstName + " " + this.lastName;
    }
}
