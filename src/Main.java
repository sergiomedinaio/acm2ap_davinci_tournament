import java.util.Date;

public class Main {
    public static void main(String args[]) {
        System.out.println("Da Vinci Tournament");
        String lugarDelParcial = new String("Aula 116, Da Vinci");

        Season torneoDaVinci = new Season();   //creamos torneo

        Match primerParcial = new Match(
                lugarDelParcial,
                new Date(2022,8,29)
        );     // creamos partido

        TeamSeason profesoresPOO = new TeamSeason("Profes POO");
        TeamSeason estudiantesFC = new TeamSeason("Estudiantes FC");
        TeamSeason recursantesFC = new TeamSeason("Recursantes FC");

        Player profeSergio = new Player("Sergio Medina", 1, "Goalkeeper");
        Player profeSuplente = new Player("Profe suplente", 3, "Defender");

        profesoresPOO.setPosition(1);
        estudiantesFC.setPosition(0);

        primerParcial.setLocalTeam(profesoresPOO);
        primerParcial.setVisitantTeam(estudiantesFC);

    }
}