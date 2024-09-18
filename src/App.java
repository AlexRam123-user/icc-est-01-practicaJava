public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");


        String cadena = "Hola Mundo";
        
        System.out.println(cadena);
        System.out.print("Tamaño de la cadena ");
        System.out.println(cadena.length());
        System.out.println(cadena.split(" . ")[0]);

        for (int i = 0; i < cadena.length(); i++) {
            if(i == cadena.length()-1){
                System.out.println(cadena.charAt(i));
            }else{
                System.out.print(cadena.charAt(i)+"-");
            }
        }

        // CONTAR PALABRAS
        int palabras = cadena.split(" ").length;
        System.out.println(palabras);

        //CONTAR CUANTAS a HAY EN LA CADENA
        

    }
}
