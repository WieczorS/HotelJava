package pl.wsb.hotel;

import java.util.Date;

public class TimeService extends SpecialService {
    @Override
    void orderService() {
        System.out.println(Date.from(java.time.Instant.now()));
    }

    @Override
    void orderServiceDog() {
        System.out.println("Hotel will take care of your dog");
    }

    @Override
    void orderServiceKid() {
        System.out.println("Hotel will take care of your Kid");
    }
}