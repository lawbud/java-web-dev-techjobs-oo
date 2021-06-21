package org.launchcode.techjobs_oo.Tests;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;
import static org.junit.Assert.*;


public class JobTest {
    private Job testJob1, testJob2, testJob3, testJob4;

    @Before
    public void creatingJobObj() {
        testJob1 = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));


        testJob2 = new Job();
        testJob3 = new Job();
        testJob4 = new Job("Product tester",
                new Employer(""),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
    }


    @Test
    public void TestSettingJobId() {
        assertEquals(1, testJob2.getId() - testJob1.getId());

    }

    @Test
    public void testJobConstructorSetsAllFields() {
        assertEquals("Product tester", testJob1.getName());
        assertEquals("ACME", testJob1.getEmployer().getValue());
        assertEquals("Desert", testJob1.getLocation().getValue());
        assertEquals("Quality control", testJob1.getPositionType().getValue());
        assertEquals("Persistence", testJob1.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality() {
        assertEquals(false, testJob2.equals(testJob3));
    }
    @Test
    public void blankLines(){
        String str  =testJob1.toString();
        char firstChar =str.charAt(0);
        char lastChar =str.charAt(str.length()-1);
        assertEquals("\n",Character.toString(firstChar));
        assertEquals("\n",Character.toString(lastChar));
    }
    @Test
    public void labelsAndData(){
        String str =testJob1.toString();
        String expected = "\n" +
                "ID: 1\n" +
                "Name: Product tester\n" +
                "Employer: ACME\n" +
                "Location: Desert\n" +
                "Position Type: Quality control\n" +
                "Core Competency: Persistence\n";
               assertEquals(expected,str);
    }
    @Test
    public void testForBlank(){
      String str = testJob4.toString();
      String expected = "\n" +
              "ID: 4\n" +
              "Name: Product tester\n" +
              "Employer: Data Not Available\n" +
              "Location: Desert\n" +
              "Position Type: Quality control\n" +
              "Core Competency: Persistence\n";
      assertEquals(expected,str);
    }
}
