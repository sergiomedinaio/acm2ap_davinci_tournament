import java.util.Date;

public class Main {
    public static void main(String args[]) {
        System.out.println("Da Vinci Tournament");

        Season torneoDaVinci = new Season();   //creamos torneo
        Match primerParcial = new Match();     // creamos partido
        Date fechaPosibleParcial = new Date(); //creamos fecha


        fechaPosibleParcial.setYear(2022);
        fechaPosibleParcial.setMonth(8);       //un numero menos
        fechaPosibleParcial.setDate(29);

        primerParcial.setDate(fechaPosibleParcial); //asigne fecha
        String lugarDelParcial = new String("Aula 116, Da Vinci");
        primerParcial.setLocation(lugarDelParcial);
        primerParcial.setMarkerLocal(0);
        primerParcial.setMarkerVisitant(0);

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