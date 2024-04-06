package pl.wsb.hotel;

public class PremiumClient extends Client {

    @Override
    public String getFullName() {
        return "[premium]" + super.getFullName();
    }

    public enum PremiumAccountType {
        PREMIUM, PREMIUM_PLUS
    }

}
