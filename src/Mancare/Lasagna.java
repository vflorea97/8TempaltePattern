package Mancare;

import Exceptii.ExceptieExtraIngredient;

import java.util.Scanner;

public class Lasagna extends PasiPreparare {

    @Override
    void gatire() {
        System.out.println("Lasagna este in cuptor...");
    }

    @Override
    void preparareSuport() {
        System.out.println("Se pregateste foile de paste...");
    }

    @Override
    void extraIngrediente() {
        System.out.println("Adauga extra sos");
    }

    public void starLasagna() {
        preparareSuport();
        gatire();
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
        System.out.print("Doriti sa adaugati exta sos? DA/NU");
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

