package Parcial1;



public class Empleado extends Persona {
    private double sueldo_bruto;
    private double resultado;

    public double calcular_salario_neto(){


        resultado = sueldo_bruto*12;
    return resultado;
    }

    public Empleado() {
        super();
    }

    public double getSueldo_bruto() {
        return sueldo_bruto;
    }
    public void setSueldo_bruto(double sueldo_bruto) {
        this.sueldo_bruto = sueldo_bruto;
    }


}

