import java.util.Date;

public class Main {
    public static void main(String args[]) {
        System.out.println("Da Vinci Tournament");
        String lugarDelParcial = new String("Aula 116, Da Vinci");

        Season torneoDaVinci = new Season();   //creamos torneo
        Date fechaPosibleParcial = new Date(); //creamos fecha

        fechaPosibleParcial.setYear(2022);
        fechaPosibleParcial.setMonth(8);       //un numero menos
        fechaPosibleParcial.setDate(29);

        Match primerParcial = new Match(lugarDelParcial, fechaPosibleParcial);     // creamos partido

        TeamSeason profesoresPOO = new TeamSeason();
        TeamSeason estudiantesFC = new TeamSeason();
        profesoresPOO.setPosition(1);
        estudiantesFC.setPosition(0);

        profesoresPOO.setName("Profes POO");
        estudiantesFC.setName("Estudiantes FC");
        // hay que terminar de definir los equipos

        primerParcial.setLocalTeam(profesoresPOO);
        primerParcial.setVisitantTeam(estudiantesFC);

    }
}