package com.pm.patientservice.dto;

public record PatientResponseDTO(String id, String name, String email, String address, String dateOfBirth,
                                 String registeredDate) {
    @Override
    public String id() {
        return id;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public String email() {
        return email;
    }

    @Override
    public String address() {
        return address;
    }

    @Override
    public String dateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public String registeredDate() {
        return registeredDate;
    }
}
