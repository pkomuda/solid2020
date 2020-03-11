package pl.zzpj2020.solid.dip.weathertracker.solution;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class WeatherTracker {

    private String currentConditions;
    private Receiver receiver;

    public String generateWeatherAlert() {
        return receiver.generateWeatherAlert(currentConditions);
    }
}
