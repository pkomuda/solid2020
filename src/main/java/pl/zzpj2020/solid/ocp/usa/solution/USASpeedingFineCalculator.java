package pl.zzpj2020.solid.ocp.usa.solution;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public abstract class USASpeedingFineCalculator {

    @Getter
    private final int speedLimit;

    public abstract double calculate(int speed);
}
