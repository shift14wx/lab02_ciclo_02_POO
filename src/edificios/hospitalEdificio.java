package edificios;

import interfaces.Hospital;

public class hospitalEdificio extends edificio implements Hospital {

    public hospitalEdificio(boolean chalet, int baños, boolean servilliance, boolean patio,int cuartos) {
        this.crearChalet(chalet);
        this.crearBaños(baños);
        this.crearVigilancia(servilliance);
        this.crearPatio(patio);
        this.crearCuartos(cuartos);
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
