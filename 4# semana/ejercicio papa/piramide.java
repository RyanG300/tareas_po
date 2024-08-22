import java.util.Scanner;


public class piramide {
    
    public void construir(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("De cuanto quieres la piramide lol: ");
        String s=sc.nextLine();
        int num = Integer.parseInt(s);
        for(int p=1;p<=num;p++){
            String pe="hola";
            System.out.println(pe.repeat(p));
        }
        System.out.println("El usuario ingreso: ");
        System.out.println(num);
    }
        

    public boolean hola(){
        char[] pene={'a','A','b','B','c','C'};
        Scanner palabra = new Scanner(System.in);
        System.out.println("Dame una palabra papu");
        String pe=palabra.nextLine();
        System.out.println();
        for(int a=0;a<=pe.length();a++){
            for(int r=0;r<=5;r++){
                if(pe.charAt(a)==pene[r]){
                    return true;
                }
                else{
                    continue;
                }
            }
        }
        return false;

    }
    
}