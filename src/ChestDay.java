public class ChestDay {
    private String  workout;
    private int     weight;
    private int     reps;
    private int     sets;

    ChestDay(){

    }

    ChestDay(String workout, int weight, int sets, int reps){
        this.workout = workout;
        this. weight = weight;
        this.sets = sets;
        this. reps =reps;
    }

    public int getReps() {
        return reps;
    }

    public int getSets() {
        return sets;
    }

    public int getWeight() {
        return weight;
    }

    public String getWorkout() {
        return workout;
    }

    public void setReps(int reps) {
        this.reps = reps;
    }

    public void setSets(int sets) {
        this.sets = sets;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setWorkout(String workout) {
        this.workout = workout;
    }


}
