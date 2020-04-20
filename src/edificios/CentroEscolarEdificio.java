package edificios;

import interfaces.Educativo;

public class CentroEscolarEdificio extends edificio implements Educativo {


    public CentroEscolarEdificio(boolean chalet, int baños, boolean servilliance, boolean patio,int cuartos,int nCanchas, boolean banquillos) {

        this.crearChalet(chalet);
        this.crearBaños(baños);
        this.crearVigilancia(servilliance);
        this.crearPatio(patio);
        this.crearCuartos(cuartos);
        this.crearCanchas(nCanchas);
        this.crearBanquillos(banquillos);

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

    @Override
    public void crearVigilancia(boolean servilliance) {
    this.surveillance = servilliance;
    }

    @Override
    public void crearPatio(boolean patio) {
    this.backyarn = patio;
    }

    @Override
    public void crearCuartos(int cuartos) {
    this.nRooms = cuartos;
    }
}