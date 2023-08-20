package com.example.evolenta5_2.repositories;

import com.example.evolenta5_2.models.Weather;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WeatherRepository extends CrudRepository<Weather, Integer> {
}
