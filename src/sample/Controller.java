package sample;

import edificios.CentroEscolarEdificio;
import edificios.hospitalEdificio;
import edificios.poliDeportivoEdificio;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller  implements Initializable {


    public poliDeportivoEdificio poliDeportivo;
    public hospitalEdificio hospital;
    public CentroEscolarEdificio centroEscolar;
    //polideportivo
    public Label nCanchas;
    public Label nBaños;
    public Label chalet;
    public Label banquillos;
    //hospital
    public Label nCuartosHospital;
    public Label nBañosHospital;
    public Label chaletHospital;
    public Label patioHospital;
    public Label vigilanciaHospital;
    //centro escolar
    public Label nCanchasEscolar;
    public Label nBañosEscolar;
    public Label chaletEscolar;
    public Label banquillosEscolar;
    public Label patioEscolar;
    public Label vigilanciaEscolar;
    public Label nCuartosEscolar;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        crearPolideportivo(); // creamos el polideportivo
        crearHospital(); //creamos el hospital
        crearCentroEscolar(); // creamos centro escolar
    }

    public void crearPolideportivo(){
        this.poliDeportivo = new poliDeportivoEdificio(2,true,2,true);
        this.nCanchas.setText(this.poliDeportivo.getCanchas()+"");
        this.nBaños.setText(this.poliDeportivo.getBaños()+"");
        this.chalet.setText(this.poliDeportivo.isFoodCourtDR() ? "si":"no");
        this.banquillos.setText(this.poliDeportivo.isBanquillos() ? "si":"no");
    }

    public void crearHospital(){
        this.hospital = new hospitalEdificio(true,100,true,true,100);
        this.nCuartosHospital.setText(this.hospital.getnRooms()+"");
        this.nBañosHospital.setText(this.hospital.getBaños()+"");
        this.chaletHospital.setText(this.hospital.isFoodCourtDR() ? "si":"no");
        this.vigilanciaHospital.setText(this.hospital.isSurveillance() ? "si":"no");
        this.patioHospital.setText(this.hospital.isBackyarn() ? "si":"no");
    }

    public void crearCentroEscolar(){
        this.centroEscolar = new CentroEscolarEdificio(true,100,true,true,100,2,true);
        this.nCuartosEscolar.setText(this.centroEscolar.getnRooms()+"");
        this.nBañosEscolar.setText(this.centroEscolar.getBaños()+"");
        this.chaletEscolar.setText(this.centroEscolar.isFoodCourtDR() ? "si":"no");
        this.vigilanciaEscolar.setText(this.centroEscolar.isSurveillance() ? "si":"no");
        this.nCanchasEscolar.setText(this.centroEscolar.getCanchas()+"");
        this.banquillosEscolar.setText(this.centroEscolar.isBanquillos() ? "si":"no");
        this.patioEscolar.setText(this.centroEscolar.isBackyarn() ? "si":"no");
    }
}
