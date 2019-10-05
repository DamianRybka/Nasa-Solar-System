package nasaproject.models;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "planets")

public class Planet {

    /*
     * @GeneratedValue(strategy = GenerationType.IDENTITY)
     * oznacza odpowiedzialnosc za generowanie wartosci kluczy glownych przez baze danych.
     *
     *
     *
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "planet_name", nullable = false, unique = true)
    private String planetName;

    @Column(name = "distance_from_sun")
    private long distanceFromSun;

    @Column(name = "one_Way_light_time_to_the_Sun")
    private double oneWayLightTimeToTheSun;

    @Column(name = "length_of_year")
    private double lengthOfYear;

    @Column(name = "planet_type")
    private String planetType;

    @Column(name = "planet_info")
    private String planetInfo;

    @Column(name = "planet_image")
    private String planetImage;
}
