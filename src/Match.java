import java.util.Date;

public class Match {
    private Date creation;
    private Date date;
    private TeamSeason localTeam;
    private TeamSeason visitantTeam;
    private String location;
    private MatchResult result;

    Match() {
        this.creation = new Date();
        this.result = new MatchResult();
    }

    Match(String location, Date date) {
        this.creation = new Date();
        this.result = new MatchResult();
        this.setLocation(location);
        this.setDate(date); //asigne fecha
    }

    Match(String location, Date date, TeamSeason localTeam, TeamSeason visitantTeam) {
        this.creation = new Date();
        this.result = new MatchResult();
        this.setLocation(location);
        this.setDate(date); //asigne fecha
        this.setLocalTeam(localTeam);
        this.setVisitantTeam(visitantTeam);
    }

    public String generateMarker() {
        return String.format("%s %s %s ",
            this.getLocalTeam().getName(),
            this.result.generateMarker(),
            this.getVisitantTeam().getName()
        );
    }

    private void makeGoal(TeamSeason team, Player player) {
        if(team.getName() != this.localTeam.getName() && team.getName() != this.visitantTeam.getName()) return;
        player.setGoalCounter(player.getGoalCounter() + 1);

    }

    public void makeLocalGoal(int position) {
        Player player = this.localTeam.getPlayers().get(position);
        this.makeGoal(this.localTeam, player);
        this.result.incrementMarkerLocal();
    }

    public void makeVisitantGoal(int position) {
        Player player = this.visitantTeam.getPlayers().get(position);
        this.makeGoal(this.visitantTeam, player);
        this.result.incremgetMarkerVisitant();
    }


    public void setDate(Date newDate){
        this.date = newDate;
        return;
    }
    public void setLocalTeam(TeamSeason local){
        this.localTeam = local;
        return;
    }
    public void setVisitantTeam(TeamSeason visitant){
        this.visitantTeam = visitant;
        return;
    }

    public void setLocation(String newLocation){
        this.location = newLocation;
        return;
    }


    public String getResult(){
        return "";
    }

    public TeamSeason getLocalTeam() {
        return localTeam;
    }

    public TeamSeason getVisitantTeam() {
        return visitantTeam;
    }

    public Date getCreation() {
        return creation;
    }
}
