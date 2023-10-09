package javaExercises.chapter3SkillBrain.needforspeed;

public class RaceTrack {
    int distance;

    public RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean finishCarRace(NeedForSpeed car) {
        if (!car.batteryDrained()) {
            return true;
        }
        return false;
    }
}
