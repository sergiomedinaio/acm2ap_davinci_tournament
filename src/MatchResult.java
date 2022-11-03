public class MatchResult {
    private int markerLocal;
    private int markerVisitant;

    MatchResult() {
        this.setMarkerLocal(0);
        this.setMarkerVisitant(0);
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

    public void incrementMarkerLocal() {
        int marker = this.getMarkerLocal();
        marker++;
        this.setMarkerLocal(marker);
    }

    public void incremgetMarkerVisitant() {
        int marker = this.getMarkerVisitant();
        marker++;
        this.setMarkerVisitant(marker);
    }
    public String generateMarker() {
        return String.format("(%d) - (%d)",
                this.getMarkerLocal(),
                this.getMarkerVisitant()
        );
    }

}
