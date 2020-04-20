package edificios;

public class edificio {

    public int nRooms;
    public boolean parkingLot;
    public boolean backyarn;
    public boolean surveillance;
    public boolean foodCourtDR;
    public String name;
    public boolean banquillos;
    public int baños;
    public int canchas;

    public int getnRooms() {
        return nRooms;
    }

    public void setnRooms(int nRooms) {
        this.nRooms = nRooms;
    }

    public boolean isParkingLot() {
        return parkingLot;
    }

    public void setParkingLot(boolean parkingLot) {
        this.parkingLot = parkingLot;
    }

    public boolean isBackyarn() {
        return backyarn;
    }

    public void setBackyarn(boolean backyarn) {
        this.backyarn = backyarn;
    }

    public boolean isSurveillance() {
        return surveillance;
    }

    public void setSurveillance(boolean surveillance) {
        this.surveillance = surveillance;
    }

    public boolean isFoodCourtDR() {
        return foodCourtDR;
    }

    public void setFoodCourtDR(boolean foodCourtDR) {
        this.foodCourtDR = foodCourtDR;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isBanquillos() {
        return banquillos;
    }

    public void setBanquillos(boolean banquillos) {
        this.banquillos = banquillos;
    }

    public int getBaños() {
        return baños;
    }

    public void setBaños(int baños) {
        this.baños = baños;
    }

    public int getCanchas() {
        return canchas;
    }

    public void setCanchas(int canchas) {
        this.canchas = canchas;
    }
}
