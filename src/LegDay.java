public class LegDay {

    private float timeRun;
    private float speedNumber;
    private float incline;


    LegDay(){}

    LegDay(float timeRun, float speedNumber, float incline){
        this.incline =incline;
        this.speedNumber = speedNumber;
        this.timeRun = timeRun;
    }

    public float getIncline() {
        return incline;
    }

    public float getSpeedNumber() {
        return speedNumber;
    }

    public float getTimeRun() {
        return timeRun;
    }

    public void setIncline(float incline) {
        this.incline = incline;
    }

    public void setSpeedNumber(float speedNumber) {
        this.speedNumber = speedNumber;
    }

    public void setTimeRun(float timeRun) {
        this.timeRun = timeRun;
    }
}
