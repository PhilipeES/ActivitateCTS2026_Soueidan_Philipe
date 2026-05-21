package ro.ase.cts.seminar12.unitTesting.teste;

import ro.ase.cts.seminar12.unitTesting.clase.Persoana;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PersoanaTest {

    @org.junit.Test
    public void testAssertgetVarsta() {
        Persoana persoana = new Persoana("Ligia", "2760522780096");
        //apelam o asertie - test de corectitudine, nu respecta repetatibilitatea, daca fac acelasi test la anul nu merge cu 50
        assertEquals(49, persoana.getVarsta());
    }

    //boundary
    @org.junit.Test
    public void testBoundaryGetVarsta() {
        Persoana persoana2 = new Persoana("Iulian", "1991231450078");
        assertEquals(26, persoana2.getVarsta());
    }

    //
    @org.junit.Test
    public void testCrossCheckGetSex() {
        Persoana persoana = new Persoana("Marius", "5000520780096");
        String cnp = "5000520780096";
        assertEquals(cnp.charAt(0) % 2 == 0 ? "F" : "M", persoana.getSex());
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testCNPInvalid() {
        Persoana persoana = new Persoana("Marian", "50306234500895");
        persoana.checkCNP();
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testCNPInvalidCharacters() {
        Persoana p = new Persoana("Aurel", "504052745xx09");
        p.checkCNP();
    }

    @org.junit.Test(timeout = 100)
    public void testTime(){
        Persoana persoana = new Persoana("Alexia", "6060620780096");
        persoana.getVarsta();
    }

    @org.junit.Test
    public void testOrdineVarsta(){
        Persoana persoana = new Persoana("Milka", "6121212000000");
        Persoana persoana2 = new Persoana("Barni","5090909000000");
        assertTrue(persoana.getVarsta() < persoana2.getVarsta());
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testRangegetVarsta(){
        Persoana persoana2 = new Persoana("Barni","5270909000000");
        persoana2.getVarsta();
    }
}