package com.xyzcorp.tdd;

import java.time.LocalDate;
import java.util.function.Supplier;

public class Programmer {

    private String firstName;
    private LocalDate birthDate;
    private Supplier<LocalDate> localDateSupplier;
    private String lastName;

    public Programmer(String firstName, String lastName, 
                      LocalDate birthDate, Supplier<LocalDate> localDateSupplier) {
                        this.firstName = firstName;
                        this.lastName = lastName;
                        this.birthDate = birthDate;
                        this.localDateSupplier = localDateSupplier;                
    }

    public Object getFullName() {
        return firstName + " " + lastName;
    }

}
