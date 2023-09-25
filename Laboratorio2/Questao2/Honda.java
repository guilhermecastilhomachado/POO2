package Questao2;

public class Honda implements IVehicleMaker{
    @Override
    public IVehicle makeVehicle(String modelo) {
        if(modelo.equals("city")){
            return new City();
        }
        return null;
    }
}
