package nasaproject.mappers;

import nasaproject.commons.Mapper;
import nasaproject.models.Planet;
import nasaproject.models.dtos.PlanetDto;
import org.springframework.stereotype.Component;

@Component
public class PlanetMapper implements Mapper<Planet, PlanetDto> {
    @Override
    public PlanetDto map(Planet from) {
        return PlanetDto
                .builder()
                .planetName(from.getPlanetName())
                .distanceFromSun(from.getDistanceFromSun())
                .oneWayLightTimeToTheSun(from.getOneWayLightTimeToTheSun())
                .lengthOfYear(from.getLengthOfYear())
                .planetType(from.getPlanetType())
                .planetInfo(from.getPlanetInfo())
                .planetImage(from.getPlanetImage())
                .build();
    }

    @Override
    public Planet reverseMap(PlanetDto to) {
        return Planet
                .builder()
                .planetName(to.getPlanetName())
                .distanceFromSun(to.getDistanceFromSun())
                .oneWayLightTimeToTheSun(to.getOneWayLightTimeToTheSun())
                .lengthOfYear(to.getLengthOfYear())
                .planetType(to.getPlanetType())
                .planetInfo(to.getPlanetInfo())
                .planetImage(to.getPlanetImage())
                .build();
    }
}
