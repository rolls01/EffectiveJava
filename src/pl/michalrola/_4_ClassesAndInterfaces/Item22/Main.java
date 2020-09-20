package pl.michalrola._4_ClassesAndInterfaces.Item22;

import static pl.michalrola._4_ClassesAndInterfaces.Item22.PhysicalConstantsUtility.AVOGADROS_NUMBER;

public class Main {
    public static void main(String[] args) {
        System.out.println("Atoms: " + atoms(12));
    }

    private static double atoms(double mols) {
        return AVOGADROS_NUMBER * mols;
    }
}
