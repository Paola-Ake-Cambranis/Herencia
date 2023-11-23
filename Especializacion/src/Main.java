public class Main {
    public static void main(String[] args) {
        Tenista tenista = new Tenista();
        tenista.entrenar();
        tenista.golpearPelota();

        JugadorBaloncesto jugadorBaloncesto = new JugadorBaloncesto();
        jugadorBaloncesto.entrenar();
        jugadorBaloncesto.encestar();

        Futbolista futbolista = new Futbolista();
        futbolista.entrenar();
        futbolista.marcarGol();

        Voleibolista voleibolista = new Voleibolista();
        voleibolista.entrenar();
        voleibolista.rematar();

        JugadorGolf jugadorGolf = new JugadorGolf();
        jugadorGolf.entrenar();
        jugadorGolf.golpearBola();

        Nadador nadador = new Nadador();
        nadador.entrenar();
        nadador.nadarEstilo();

        Ciclista ciclista = new Ciclista();
        ciclista.entrenar();
        ciclista.pedalear();

        Beisbolista beisbolista = new Beisbolista();
        beisbolista.entrenar();
        beisbolista.batear();

        Surfista surfista = new Surfista();
        surfista.entrenar();
        surfista.surfarOla();

        JugadorRugby jugadorRugby = new JugadorRugby();
        jugadorRugby.entrenar();
        jugadorRugby.marcarTry();
    }
}