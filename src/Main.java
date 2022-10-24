import java.util.Date;

public class Main {
    public static void main(String args[]) {
        System.out.println("Da Vinci Tournament");
        String lugarDelParcial = new String("Aula 116, Da Vinci");

        Season torneoDaVinci = new Season();   //creamos torneo


        TeamSeason profesoresPOO = new TeamSeason("Profes POO");
        TeamSeason estudiantesFC = new TeamSeason("Estudiantes FC");
        TeamSeason recursantesFC = new TeamSeason("Recursantes FC");

        profesoresPOO.addPlayer(new Player("Sergio Medina", 1, "Goalkeeper"));
        profesoresPOO.addPlayer(new Player("Profe suplente", 3, "Defender"));
        profesoresPOO.addPlayer(new Player("Profe pw1", 3, "Middle"));
        profesoresPOO.addPlayer(new Player("Profe pw2", 3, "Defender"));
        profesoresPOO.addPlayer(new Player("Profe ux", 3, "Defender"));

        estudiantesFC.addPlayer(new Player("Estudiante Poo", 1, "Goalkeeper"));
        estudiantesFC.addPlayer(new Player("Estudiante suplente", 3, "Defender"));
        estudiantesFC.addPlayer(new Player("Estudiante pw1", 3, "Middle"));
        estudiantesFC.addPlayer(new Player("Estudiante pw2", 3, "Defender"));
        estudiantesFC.addPlayer(new Player("Estudiante ux", 3, "Defender"));

        Match primerParcial = new Match(
                lugarDelParcial,
                new Date(2022,8,29),
                profesoresPOO,
                estudiantesFC
        );     // creamos partido

        profesoresPOO.setPosition(1);
        estudiantesFC.setPosition(0);


    }
}