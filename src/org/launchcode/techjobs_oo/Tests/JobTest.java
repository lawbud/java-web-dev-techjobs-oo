package org.launchcode.techjobs_oo.Tests;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;
import static org.junit.Assert.*;


public class JobTest {
    private Job testJob1,testJob2,testJob3;
    @Before
    public void creatingJobObj() {
        testJob1 = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));


        testJob2 = new Job();
        testJob3 = new Job();
}


    @Test
    public void TestSettingJobId() {
        assertEquals(1, testJob1.getId();

    }

}
