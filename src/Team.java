public class Team {
    private String name;
    private int winCounter;
    private int lossCounter;
    private int drawCounter = 0;

    //NAME SETTER
    public void setName(String name){
        this.name = name;
        return;
    }

    //NAME GETTER
    public String getName() {
        return this.name;
    }


    public void incrementWinCounter(){
        this.winCounter++;
        return;
    }

    public  int getWinCounter(){
        return this.winCounter;
    }

    public  int getLossCounter(){
        return this.lossCounter;
    }

    public void incrementlossCounter (){
        this.lossCounter = this.lossCounter + 1;
        return;
    }

    public  int getDrawCounter(){
        return this.drawCounter;
    }

    public void incrementDrawCounter(){
        //this.drawCounter = this.drawCounter + 1;
        this.drawCounter++;
        return;
    }
}
