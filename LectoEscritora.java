
package POO;
 import java.io.*;
/**
 *
 * @author hebertromero
 */
public class LectoEscritora {

 private BufferedReader br;
 private String texto;


 /**
  * Este método nos permite obtener una cadena desde la consola.
  * @return
  */
 public String leerDato(){
  try {
   //Creamos un Stream de entrada
   InputStreamReader is=new InputStreamReader(System.in);
   //Instanciamos nuestro buffer de lectura con el stream antes creado
   br=new BufferedReader(is);
   //Leemos un dato por consola y lo guardamos en la variable texto
   texto=br.readLine();
  } catch (IOException e) {
   //Se ha presentado algún error
  }
  return texto;
 }

 /**
  * Este método nos permite obtener un entero desde la consola.
  * @return
  */
 public int leerEntero(){
  //Booleano para determinar si hay error al ocnvertir la cadena a número
  boolean band=false;
  int numero=0;
  do {//Todo esto se repetirá si se cumple la condición del while
   try {
    texto=leerDato();
    //Convertimos el texto a entero
    numero=Integer.parseInt(texto);
    //Si es un entero válido y lo convirtió a int entonces  band es falso
    band=false;
   } catch (Exception e) {
    //No se ingreso un entero valido
    System.out.println("'"+texto+"' No es un entero válido, por favor ingrese un entero");
    //Si la cadena no es válida entonces su valor es verdadero
    band=true;
   }

  } while (band); //Si band es verdadero vuelve a ejecutar el codigo después del do
  return numero;
 }


 /**
  * Este método nos permite obtener un double(Número decimal) desde la consola.
  * @return
  */
 public double leerDoble(){
  boolean band=false;
  double numero=0;
  do {
   try {
    texto=leerDato();
    numero=Double.parseDouble(texto);
    band=false;
   } catch (Exception e) {
    System.out.println("'"+texto+"' No es un decimal válido, por favor ingrese un entero");
    band=true;
   }

  } while (band);
  return numero;
 }

 /**
  * Muestra un mensaje (Parámetro recibido) por consola
  * @param mensaje
  */
 public void mostrarMensaje(String mensaje){
  System.out.println(mensaje);
 }

}