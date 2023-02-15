import java.util.*;
public class ejercicio1 {
    public static void main(String[] args) {
// Declara las opciones que tenemos en el menu controlado por un switch.
        System.out.println("Seleccion a: Mostrar 5 numeros en una lista");
        System.out.println("Seleccion b: Mostrar 5 numeros en una lista invertidos");
        System.out.println("Seleccion c: Mostrar la media de los numeros positivos, la media de los numeros negativos y el numero de ceros introducidos");
        System.out.println("Seleccion d: Recibir un texto y indicar el numero de caracteres");
        System.out.println("Seleccion e: Invertir un texto");
        System.out.println("Seleccion f: Eliminar espacios de un texto");
        System.out.println("Seleccion g: Sumar dos cadenas");
        System.out.println("Seleccion h: Sustituir vocales por otra vocal seleccionada");
        System.out.println("Seleccion i: Mostrar codigo ASCII de cada caracter");
        System.out.println("");
        System.out.println("Selecciona la opcion que desea realizar:");
        Scanner Eleccion = new Scanner(System.in);
        String eleccion = Eleccion.nextLine();
    switch (eleccion) {
        case "a":
        System.out.println("Has elegido la seleccion a: Mostrar 5 numeros en una lista");
        System.out.println("");
        Mostrar_5_Numeros();
        break;

        case "b":
        System.out.println("Has elegido la seleccion b: Mostrar 5 numeros en una lista invertidos");
        System.out.println("");
        Mostrar_5_Numeros_Invertidos();
        break;

        case "c":
        System.out.println("Has elegido la seleccion c: Mostrar la media de los numeros positivos, la media de los numeros negativos y el numero de ceros introducidos");
        System.out.println("");
        Media_Negativos_Positivos();
        break;

        case "d":
        System.out.println("Has elegido la seleccion d: Recibir un texto y indicar el numero de caracteres");
        System.out.println("");
        Scanner frase= new Scanner(System.in);
        String Frase = frase.nextLine();
        System.out.println(Caracteres_de_texto(Frase));
        break;

        case "e":
        System.out.println("Has elegido la seleccion e: Invertir un texto");
        System.out.println("");
        Scanner frase_invertir= new Scanner(System.in);
        String Frase_invertir = frase_invertir.nextLine();
        System.out.println(Texto_invertido(Frase_invertir));
        break;

        case "f":
        System.out.println("Has elegido la seleccion f: Eliminar espacio de un texto");
        System.out.println("");
        Scanner frase_sin_espacios= new Scanner(System.in);
        String Frase_sin_espacios = frase_sin_espacios.nextLine();
        System.out.println("");
        System.out.println(Eliminar_espacios(Frase_sin_espacios));
        break;

        case "g":
        System.out.println("Has elegido la seleccion g: Sumar dos cadenas");
        System.out.println("");
        System.out.println("Escribe la primera cadena");
        Scanner CadenaA= new Scanner(System.in);
        String cadenaA = CadenaA.nextLine();
        System.out.println("");
        System.out.println("Escribe la segunda cadena");
        Scanner CadenaB= new Scanner(System.in);
        String cadenaB = CadenaB.nextLine();
        System.out.println("");
        System.out.println(Sumar_Cadenas(cadenaA, cadenaB));
        break;

        case "h":
        System.out.println("Has elegido la seleccion h: Sustituir vocales por otra vocal seleccionada");
        System.out.println("");
        Scanner Frase_vocales= new Scanner(System.in);
        String frase_vocales = Frase_vocales.nextLine();
        System.out.println("Cual és la vocal a la que quieres sustituir?");
        Scanner Vocal= new Scanner(System.in);
        String vocal = Vocal.nextLine();
        System.out.println("");
        System.out.println("La frase sustituida és");
        Sustituir_vocal(frase_vocales, vocal);
        break;

        case "i":
        System.out.println("Has elegido la seleccion i: Mostrar codigo ASCII de cada caracter");
        System.out.println("");
        Scanner Frase_ASCII= new Scanner(System.in);
        String frase_ASCII = Frase_ASCII.nextLine();
        System.out.println("");
        Caracteres_en_ASCII(frase_ASCII);
        break;

        default:
        System.out.println("NO has seleccionado ninguna opcion");
        break;
    }
  }


//CASE A
  public static void Mostrar_5_Numeros(){
    int array_numeros[] = new int[5];
    int contador = 0;
    while (contador < 5){
        System.out.println("Ingrese un numero para añadir a la lista");
        Scanner Leer_Numero = new Scanner(System.in);
        int numero = Leer_Numero.nextInt();
        array_numeros[contador]=numero;
        contador++;
  }
  System.out.println("");
  System.out.println("La lisata de numeros que has creado es:");
  System.out.println(Arrays.toString(array_numeros));

  // Otra forma pero en linea a linea.
  //for (int i = 0; i < array_numeros.length; i++){
    //System.out.println(array_numeros[i]);
  }


//CASE B
  public static void Mostrar_5_Numeros_Invertidos(){
    int array_numeros[] = new int[5];
    int contador = 0;

    //Bucle para llenar la array.
    while (contador < 5){
        System.out.println("Ingrese un numero para añadir a la lista");
        Scanner Leer_Numero = new Scanner(System.in);
        int numero = Leer_Numero.nextInt();
        array_numeros[contador]=numero;
        contador++;
    }

    //Array con la que añadiremos los numeros invertidos.
    int array_numeros_invertidos[] = new int[5];

    //Bucle que realiza el paso inverso de la array de numeros y lo añade a la array de invertidos
    for (int i =array_numeros.length-1,j = 0; i >= 0; i--,j++){
        array_numeros_invertidos[j]=array_numeros[i];
    }
    System.out.println("");
    System.out.println("La lisata de numeros que has creado es:");
    System.out.println(Arrays.toString(array_numeros_invertidos));
  }


//CASE C
  public static void Media_Negativos_Positivos(){
    int array_numeros[] = new int[5];
    int contador = 0;
    while (contador < 5){
        System.out.println("Ingrese un numero para añadir a la lista");
        Scanner Leer_Numero = new Scanner(System.in);
        int numero = Leer_Numero.nextInt();
        array_numeros[contador]=numero;
        contador++;
    }
    int sub_array_positivos[] = new int[5];
    int sub_array_negativos[] = new int[5];
    int contar_ceros = 0;

    for (int i = 0; i < array_numeros.length; i++){
        if(array_numeros[i]>0){
            sub_array_positivos[i]=array_numeros[i];
        }
        else if (array_numeros[i]<0){
            sub_array_negativos[i]=array_numeros[i];
        }
        else if (array_numeros[i]==0){
            contar_ceros += 1;
        }
  }

  int suma_numeros_negativos = 0;
  int contador_negativos = 0;
  for (int i = 0; i < sub_array_negativos.length; i++){
      if(sub_array_negativos[i]<0){
          suma_numeros_negativos += sub_array_negativos[i];
          contador_negativos++;
      }
  }
  float media_total_negativos = suma_numeros_negativos/contador_negativos;

  int suma_numeros_positivos = 0;
  int contador_postivos = 0;
  for (int i = 0; i < sub_array_positivos.length; i++){
      if(sub_array_positivos[i]>0){
          suma_numeros_positivos += sub_array_positivos[i];
          contador_postivos++;
      }
  }
  float media_total_positivos = suma_numeros_positivos/contador_postivos;

  System.out.println("La lisata de numeros que has creado es:");
  System.out.println(Arrays.toString(array_numeros));
  System.out.println("");
  System.out.println("La media de todos los numeros negativos es:");
  System.out.println(media_total_negativos);
  System.out.println("");
  System.out.println("La media de todos los numeros positivos es:");
  System.out.println(media_total_positivos);
  System.out.println("");
  System.out.println("El numero de ceros es:");
  System.out.println(contar_ceros);
 }


//CASE D
 public static int Caracteres_de_texto(String Frase){
    //Muestra la longitud del valor que pasamos.
    return Frase.length();
 }


//CASE E
 public static String Texto_invertido(String Frase){
    //Pasamos la frase a una variable local
    String array_texto = new String();
    array_texto = Frase;

    //Creamos la variable que se mostrara 
    String array_invertida = new String();

    //Creamos el bucle que invierte los valores de la frase
    for(int i = array_texto.length()-1; i >= 0; i--){
        array_invertida += array_texto.charAt(i); //charAT se usa junto a un identificador para poder verificar letra por letra en una string.
    }
    return array_invertida;
 }


//CASE F
public static String Eliminar_espacios(String Frase){
    String Frase_sin_espacios = Frase;
    return Frase_sin_espacios.replace(" ", ""); //Se usa replace en las strings pasando el valor al que queremos cambiar y por que lo queremos cambiar.
}


//CASE J
 public static String Sumar_Cadenas(String cadenaA, String cadenaB ){
    return cadenaA + cadenaB;
 }


//CASE H
 public static void Sustituir_vocal(String Frase, String vocal){
    //Declaramos los valores que queremos verificar.
   String vocales = "[aeiouAEIOU]";
   String Frase_con_vocales = Frase;

   //Si en algun momento de la frase detecta una vocal de la list de arriba la cambiara por la que indicamos.
   System.out.println(Frase_con_vocales.replaceAll(vocales,vocal));    //replaceall se usa para que verifique todas las que hay.
 }


//CASE I
 public static void Caracteres_en_ASCII(String Frase){
    String frase_ASCII = Frase;
    for (int i=0;i< frase_ASCII.length();i++){
        
    //Primero seleccionamos cada caracter de la frase con un charAt(i) la i es el indice que le daremos a cada char.
    //Segundo con CodePointAt sirve para dar el numero ASCII de cada char que le mandamos con el numero de indice.
    //Si el for va caracter por caracter y el primer i=h pues nos mostrara la "h" y su ASCII. 
    System.out.println("El codigo ASCII de "+ frase_ASCII.charAt(i) + " es = " + frase_ASCII.codePointAt(i));
    }
 }

}

