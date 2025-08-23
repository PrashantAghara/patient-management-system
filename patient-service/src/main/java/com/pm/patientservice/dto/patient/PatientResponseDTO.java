package com.pm.patientservice.dto.patient;

public record PatientResponseDTO(String id, String name, String email, String address, String dateOfBirth) {
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
}
