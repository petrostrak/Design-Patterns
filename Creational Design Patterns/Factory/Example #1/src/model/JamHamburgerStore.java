package model;

import interfaces.HamburgerStore;

public class JamHamburgerStore extends HamburgerStore {
    @Override
    public Hamburger createHamburger(String type) {

        if (type.equals("cheese")) {
            return new JamaicanCheeseBurger();
        }else if (type.equals("veggie")) {
            return new JamaicanVeggieBurger();

        }else  return null;
    }
}
