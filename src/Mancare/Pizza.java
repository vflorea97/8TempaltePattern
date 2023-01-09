package Mancare;

import Exceptii.ExceptieExtraIngredient;

import java.util.Scanner;

public class Pizza extends PasiPreparare {

    @Override
    void gatire() {
        System.out.println("Pizza este in cuptor...");
    }

    @Override
    void preparareSuport() {
        System.out.println("Se prepara blatul...");
    }

    @Override
    void extraIngrediente() {
        System.out.println("Adauga extra salam");
    }

    public void Pizza(){
        preparareSuport();
        asamblare();
    }

    public boolean dorescExtraIngrediente() {
        String raspuns = raspunsulClientului();
        if (raspuns.equals("DA")) {
            return true;
        } else {
            return false;
        }
    }

    private String raspunsulClientului() {
        String raspuns;
        System.out.print("Doriti sa adaugati exta salam? DA/NU");
        Scanner scanner = new Scanner(System.in);
        raspuns = scanner.nextLine();
        boolean run = true;
        while (run) {
            try {
                if (!raspuns.equals("DA") && !raspuns.equals("NU")) {
                    throw new ExceptieExtraIngredient();
                }
                run = false;
            } catch (ExceptieExtraIngredient e) {
                System.out.println(e.getMessage());
                raspuns = scanner.nextLine();
            }
        }
        return raspuns;
    }
}
