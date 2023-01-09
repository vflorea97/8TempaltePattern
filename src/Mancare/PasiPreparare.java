package Mancare;

public abstract class PasiPreparare {

    abstract void gatire();
    abstract void preparareSuport();
    abstract void extraIngrediente();

    public void pregatireIngrediente(){
        System.out.println("Se pregatesc ingredientele...");
    }
    public void asamblare(){
        System.out.println("Se asambleaza mancarea...");
    }
    boolean dorescExtraIngrediente(){
        return true;                      //hooks -- se foloses unde anumite metode sunt optionale
    }


    final void preparare(){
        pregatireIngrediente();
        preparareSuport();
        if(dorescExtraIngrediente()){
            extraIngrediente();         //hooks
        }
        gatire();
        asamblare();
        System.out.println("Mancarea este gata!!");
    }
}
