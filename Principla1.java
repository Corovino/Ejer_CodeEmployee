/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;

/**
 *
 * @author hebertromero
 */
public class Principla1 {
     public static void main(String[] args) {
  LectoEscritora le=new LectoEscritora();
  int cantidad;
  le.mostrarMensaje("***** Bienvenido *****");
  le.mostrarMensaje("Cuantos empleados desea ingresar?");
  cantidad=le.leerEntero();
  Empleado[] empleados=new Empleado[cantidad];
  double totalSalarios = 0;
  for (int i = 0; i < empleados.length; i++) {
   empleados[i]=new Empleado();
   empleados[i].setCodigo(i+1);
   le.mostrarMensaje("Ingrese la sección del empleado");
   empleados[i].setCodigoSeccion(le.leerEntero());
   le.mostrarMensaje("Ingrese el departamento del empleado");
   empleados[i].setCodigoDepartamento(le.leerEntero());
   le.mostrarMensaje("Ingrese la sucursal del empleado");
   empleados[i].setCodigoSucursal(le.leerEntero());
   le.mostrarMensaje("Ingrese el salario del empleado");
   empleados[i].setSalario(le.leerDoble());
  }
  le.mostrarMensaje("********** Salarios **********");
  for (int i = 0; i < empleados.length; i++) {
   le.mostrarMensaje("Empleado: "+i+1);
   le.mostrarMensaje("Salario: "+empleados[i].getSalario());
   totalSalarios+=empleados[i].getSalario();
  }
  le.mostrarMensaje("Total Nómina: "+totalSalarios);
  
 }

}
    

