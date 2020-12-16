

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ClaseDamTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ClaseDamTest
{
    private ClaseDam claseDam1;
    private Alumno alumno1;
    private Alumno alumno2;
    private Alumno alumno3;
    private Alumno alumno4;
    private Alumno alumno5;
    private Alumno alumno;

    /**
     * Default constructor for test class ClaseDamTest
     */
    public ClaseDamTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        claseDam1 = new ClaseDam(20);
        alumno1 = new Alumno("Angel", "1", 18);
        alumno2 = new Alumno("David", "2", 19);
        alumno3 = new Alumno("Hector", "3", 19);
        alumno4 = new Alumno("Jorge", "4", 19);
        alumno5 = new Alumno("Juan", "5", 19);
        claseDam1.getNumeroDeAlumnos();
        alumno1 = new Alumno("Angel", "1", 19);
        claseDam1.matricularAlumno(alumno1);
        claseDam1.matricularAlumno(alumno2);
        claseDam1.matricularAlumno(alumno3);
        claseDam1.matricularAlumno(alumno4);
        claseDam1.matricularAlumno(alumno5);
        
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}
