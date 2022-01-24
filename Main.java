import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main mein = new Main();
        Scanner scan = new Scanner(System.in);
        String numBinario;
        String[] Bin = null;

        System.out.println("Escriba su numero");

        boolean paso = false;
        while (paso == false){
            numBinario = scan.nextLine();
            Bin = numBinario.split("");
            if (Bin.length != 8){
                System.out.println("Escriba un numero de 8 bits");
            }
            else {
                paso = true;
            }
        }

        mein.MagnitudYSigno(Bin);
        mein.C2(Bin);
    } 

    public void MagnitudYSigno(String[] Bin){
        int signo, num1, num2, num4, num8, num16, num32, num64, total = 0;
        String stringBinario;

        signo = Integer.parseInt(Bin[0]);
        
        num64 = Integer.parseInt(Bin[1]);
        num32 = Integer.parseInt(Bin[2]);
        num16 = Integer.parseInt(Bin[3]);
        num8 = Integer.parseInt(Bin[4]);
        num4 = Integer.parseInt(Bin[5]);
        num2 = Integer.parseInt(Bin[6]);
        num1 = Integer.parseInt(Bin[7]);

        if (signo == 1){
            stringBinario = "-";
        }
        else {
            stringBinario = "";
        }
        if (num64 == 1){
            total = 64;
        }
        if (num32 == 1){
            total += 32;
        }
        if (num16 == 1){
            total += 16;
        }
        if (num8 == 1){
            total += 8;
        }
        if (num4 == 1){
            total += 4;
        }
        if (num2 == 1){
            total += 2;
        }
        if (num1 == 1){
            total += 1;
        }

        System.out.println("Magnitud y Signo: " + stringBinario + total);
    }

    public void C2(String[] Bin){
        
        boolean cambio = false;
        for (int a = 7; a >= 0; a--){
            int num = Integer.parseInt(Bin[a]);
            if (cambio == true){
                if (num == 1){
                    num = 0;
                    Bin[a] = Integer.toString(num);
                }
                else {
                    num = 1;
                    Bin[a] = Integer.toString(num);
                }
            }
            if (num == 1){
                cambio = true;
            }
        }

        System.out.print("A2: ");
        for (int b = 0; b < Bin.length; b++){
            String num = Bin[b];
            System.out.print(num);
        }
    }
}