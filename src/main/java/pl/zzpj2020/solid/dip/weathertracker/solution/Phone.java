package pl.zzpj2020.solid.dip.weathertracker.solution;

public class Phone implements Receiver {

    @Override
    public String generateWeatherAlert(String currentConditions) {
        return "It is " + currentConditions;
    }
}
