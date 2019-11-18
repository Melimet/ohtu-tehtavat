
package ohtu;

public class Player {
    private String name;
    private int goals;
    private int assists;
    private int penalties;
    private String nationality;
    private String team;



    public Player(String name, int goals, int assists, int penalties, String nationality, String team) {
        this.name = name;
        this.goals = goals;
        this.assists = assists;
        this.penalties = penalties;
        this.nationality = nationality;
        this.team = team;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {

        return getName() + "     " + getTeam() + "    " + getGoals() + " + " + getAssists() + " = " + getTotal();

    }

    public int getGoals() {
        return goals;
    }

    public int getAssists() {
        return assists;
    }

    public int getPenalties() {
        return penalties;
    }

    public String getNationality() {
        return nationality;
    }

    public String getTeam() {
        return team;
    }

    public int getTotal(){
        return this.goals + this.assists;
    }

}
