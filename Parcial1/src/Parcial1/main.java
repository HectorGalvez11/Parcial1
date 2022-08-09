package Parcial1;

public class main {

    public static void main(String[] args) {

        Directivo empleado1 = new Directivo();
        empleado1.setNombre("Hector Alfredo");
        empleado1.setEdad(21);
        empleado1.setCategoria("Jefe");
        empleado1.setSueldo_bruto(25.00);
        empleado1.calcular_salario_neto();

        new Empresa("La Moderna");
        System.out.println("Nombre del empleado: "+empleado1.getNombre());
        System.out.println("Edad del empleado "+empleado1.getEdad());
        System.out.println("Categoria del empleado " +empleado1.getCategoria());
        System.out.println("Sueldo del empleado "+empleado1.getSueldo_bruto());
        System.out.println("Salario neto "+empleado1.calcular_salario_neto()+"\n");

        Cliente cliente1 = new Cliente();
        cliente1.setNombre("Francisco");
        cliente1.setEdad(50);
        cliente1.getTelefono_de_contacto();

        new Cliente();
        System.out.println("Nombre del cliente "+cliente1.getNombre());
        System.out.println("Edad del cliente "+cliente1.getEdad());
        System.out.println("Numero del cliente "+cliente1.getTelefono_de_contacto());





    }
}
