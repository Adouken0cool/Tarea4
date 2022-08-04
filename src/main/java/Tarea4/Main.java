package Tarea4;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();
        cliente.setEdad(25);
        System.out.println("Edad: "+ cliente.getEdad());
        cliente.setNombre("Juan Perez");
        System.out.println("Nombre: "+ cliente.getNombre());
        cliente.setTelefono(21521235);
        System.out.println("Tel: "+ cliente.getTelefono());
        cliente.setCredito("Activo");
        System.out.println("Credito: "+cliente.getCredito());
        trabajador.setSalario(2000);
        System.out.println("Salario: $"+trabajador.getSalario());
    }
}
class Persona{
    private Integer edad;
    private String nombre;
    private Integer telefono;

    public void setEdad(Integer edad){
        this.edad = edad;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setTelefono (Integer telefono){
        this.telefono =telefono;
    }


    public Integer getEdad(){
        return this.edad;
    }
    public String getNombre(){
        return  this.nombre;
    }
    public Integer getTelefono(){
        return this.telefono;
    }


}

class Cliente extends Persona {
    private String credito;

    public void setCredito(String credito) {
        this.credito = credito;
    }

    public String getCredito() {
        return this.credito;
    }
}
class Trabajador extends Persona{
    private Integer salario;

    public void setSalario(Integer salario) {
        this.salario = salario;
    }
    public Integer getSalario(){return this.salario;}
}

