import java.util.Date;

public class Match {
    private Date creation;
    private Date date;
    private TeamSeason localTeam;
    private TeamSeason visitantTeam;
    private String location;
    private int markerLocal;
    private int markerVisitant;

    Match() {
        this.creation = new Date();
        this.setMarkerLocal(0);
        this.setMarkerVisitant(0);
    }

    Match(String location, Date date) {
        this.creation = new Date();
        this.setMarkerLocal(0);
        this.setMarkerVisitant(0);
        this.setLocation(location);
        this.setDate(date); //asigne fecha
    }

    Match(String location, Date date, TeamSeason localTeam, TeamSeason visitantTeam) {
        this.creation = new Date();
        this.setMarkerLocal(0);
        this.setMarkerVisitant(0);
        this.setLocation(location);
        this.setDate(date); //asigne fecha
        this.setLocalTeam(localTeam);
        this.setVisitantTeam(visitantTeam);
    }

    public String generateMarker() {
        return String.format("%s (%d) - (%d) %s ",
            this.getLocalTeam().getName(),
            this.getMarkerLocal(),
            this.getMarkerVisitant(),
            this.getVisitantTeam().getName()
        );
    }

    private void makeGoal(TeamSeason team, Player player) {
        if(team.getName() != this.localTeam.getName() && team.getName() != this.visitantTeam.getName()) return;
        player.setGoalCounter(player.getGoalCounter() + 1);

    }

    public void makeLocalGoal(int position) {
        int marker = this.getMarkerLocal();
        Player player = this.localTeam.getPlayers().get(position);
        marker++;
        this.makeGoal(this.localTeam, player);
        this.setMarkerLocal(marker);
    }

    public void makeVisitantGoal(int position) {
        int marker = this.getMarkerVisitant();
        Player player = this.visitantTeam.getPlayers().get(position);
        marker++;
        this.makeGoal(this.visitantTeam, player);
        this.setMarkerVisitant(marker);
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

    public void setMarkerLocal(int markerLocal){
        this.markerLocal=markerLocal;
        return;
    }

    public int getMarkerLocal(){
        return this.markerLocal;
    }

    public void setMarkerVisitant(int markerVisitant){
        this.markerVisitant=markerVisitant;
        return ;
    }

    public int getMarkerVisitant(){
        return this.markerVisitant;
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
