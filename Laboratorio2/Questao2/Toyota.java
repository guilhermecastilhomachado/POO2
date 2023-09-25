package Questao2;

import Questao1.Galaxy8;

public class Toyota implements IVehicleMaker{
    @Override
    public IVehicle makeVehicle(String modelo) {
        if(modelo.equals("corolla")){
            return new Corolla();
        }
        return null;
    }
}
