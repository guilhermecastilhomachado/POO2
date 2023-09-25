package Questao1;

public class Xiaomi implements FabricanteCelular{
    @Override
    public Celular constroiCelular(String modelo) {
        if(modelo.equals("xiaomiMi9")){
            return new XiaomiMi9();
        }
        return null;
    }
}
