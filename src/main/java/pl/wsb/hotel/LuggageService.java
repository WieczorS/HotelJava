package pl.wsb.hotel;

public class LuggageService extends SpecialService{
    @Override
    void orderService() {
        System.out.println("Hotel will take care of your luggage.");
    }

    @Override
    void orderServiceDog() {
        System.out.println("Hotel will store your Dog's toys");
    }

    @Override
    void orderServiceKid() {
        System.out.println("Hotel will store your Kid's toys");
    }
}
