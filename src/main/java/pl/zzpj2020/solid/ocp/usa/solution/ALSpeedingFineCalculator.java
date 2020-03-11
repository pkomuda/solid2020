package pl.zzpj2020.solid.ocp.usa.solution;

public class ALSpeedingFineCalculator extends USASpeedingFineCalculator {

    public ALSpeedingFineCalculator(int speedLimit) {
        super(speedLimit);
    }

    @Override
    public double calculate(int speed) {
        double fine = 0;
        if (speed > getSpeedLimit()) {
            // calculate...
        }
        return fine;
    }
}
