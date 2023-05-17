package ru.job4j.stream;

/**
 * @author sveet
 * @date 17.05.2023
 */
public class Profile {
    private Address address;

    public Profile(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }
}
