package com.example.evolenta5_2.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@NoArgsConstructor(force = true)
@AllArgsConstructor
@Data
public class Weather {
    @Id
    @GeneratedValue
    private int id;

    @NonNull
    private String name;

    @NonNull
    private String description;

    @NonNull
    private int temp;

    public Weather(@NonNull String name, @NonNull String description, @NonNull int temp) {
        this.name = name;
        this.description = description;
        this.temp = temp;
    }
}
