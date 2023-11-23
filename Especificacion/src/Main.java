public class Main {
    public static void main(String[] args) {
        // Crear instancias de las subclases
        Perro miPerro = new Perro();
        Gato miGato = new Gato();
        Vaca miVaca = new Vaca();
        Caballo miCaballo = new Caballo();
        Conejo miConejo = new Conejo();
        Elefante miElefante = new Elefante();
        Oveja miOveja = new Oveja();
        Oso miOso = new Oso();
        Cerdo miCerdo = new Cerdo();
        Mono miMono = new Mono();

        // Llamar a métodos de las subclases
        miPerro.amamantar();
        miPerro.ladrar();

        miGato.amamantar();
        miGato.maullar();

        miVaca.amamantar();
        miVaca.mugir();

        miCaballo.amamantar();
        miCaballo.relinchar();

        miConejo.amamantar();
        miConejo.brincar();

        miElefante.amamantar();
        miElefante.trompetear();

        miOveja.amamantar();
        miOveja.balar();

        miOso.amamantar();
        miOso.gruñir();

        miCerdo.amamantar();
        miCerdo.gruñir();

        miMono.amamantar();
        miMono.aullar();
    }
}