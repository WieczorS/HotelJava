package pl.wsb.hotel;

import java.util.Date;

public class TimeService extends SpecialService {
    @Override
    void orderService() {
        System.out.println(Date.from(java.time.Instant.now()));
    }
}