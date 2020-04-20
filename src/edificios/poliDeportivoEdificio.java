package edificios;

import interfaces.Polideportivo;

public class poliDeportivoEdificio extends edificio implements Polideportivo {

    public poliDeportivoEdificio(int nCanchas, boolean banquillos, int Nbaños, boolean chalet){
        this.crearCanchas(nCanchas);
        this.crearBanquillos(banquillos);
        this.crearBaños(Nbaños);
        this.crearChalet(chalet);
    }


    @Override
    public void crearCanchas(int canchas) {
        this.canchas = canchas;
    }

    @Override
    public void crearBanquillos(boolean banquillos) {
        this.banquillos = banquillos;
    }

    @Override
    public void crearChalet(boolean chalet) {
    this.foodCourtDR = chalet;
    }

    @Override
    public void crearBaños(int Nbaños) {
    this.baños = Nbaños;
    }
}