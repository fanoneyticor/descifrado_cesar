package descifrado_cesar;
import java.util.Scanner;
public class Descifrado_cesar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese texto cifrado: ");
        String cifrado = teclado.nextLine();
        System.out.println("Opciones de descifrado:");
        for(int i=1; i<26; i++){
            System.out.print("\n" + i + ". ");
            for(int j=0; j<cifrado.length(); j++){
                if(cifrado.codePointAt(j) >= 97 && cifrado.codePointAt(j) <=122){
                    int aux = (cifrado.codePointAt(j)+i);
                    if(aux > 122){
                        int factor = (aux -122);
                        System.out.print((char)(97 + factor - 1));
                    }
                    else{
                        System.out.print((char)aux);
                    }
                }
                else{
                    System.out.print((char) cifrado.codePointAt(j));
                }
            }
        }        
    }    
}
