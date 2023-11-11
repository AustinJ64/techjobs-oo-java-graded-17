package org.launchcode.techjobs.oo;

import org.junit.Test;

import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here
    @Test
    public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();
        assertNotEquals(job1.getId(), job2.getId());

    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job myJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(myJob.getName() instanceof String);
        assertTrue(myJob.getEmployer() instanceof Employer);
        assertTrue(myJob.getLocation() instanceof Location);
        assertTrue(myJob.getPositionType() instanceof PositionType);
        assertTrue(myJob.getCoreCompetency() instanceof CoreCompetency);
        assertEquals(myJob.getName() , "Product tester");
        assertEquals(myJob.getEmployer().getValue() , "ACME");
        assertEquals(myJob.getLocation().getValue() , "Desert");
        assertEquals(myJob.getPositionType().getValue() , "Quality control");
        assertEquals(myJob.getCoreCompetency().getValue() , "Persistence");
    }

    @Test
    public void testJobsForEQuality() {
        Job job1 = new Job("Shoplifter", new Employer("Myself"), new Location("California"), new PositionType("Criminal"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Shoplifter", new Employer("Myself"), new Location("California"), new PositionType("Criminal"), new CoreCompetency("Persistence"));
        assertNotEquals(job1, job2);
    }

}
