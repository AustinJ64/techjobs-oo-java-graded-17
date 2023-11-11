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
    public void testJobsForEquality() {
        Job job1 = new Job("Shoplifter", new Employer("Myself"), new Location("California"), new PositionType("Criminal"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Shoplifter", new Employer("Myself"), new Location("California"), new PositionType("Criminal"), new CoreCompetency("Persistence"));
        assertNotEquals(job1, job2);
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job job1 = new Job();
        String myString = job1.toString();
        String first = myString.substring(0,2);
        String last = myString.substring(myString.length()-2);
        assertEquals(first , System.lineSeparator());
        assertEquals(last , System.lineSeparator());
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
    String expected = System.lineSeparator();
        expected += "ID: 1"+System.lineSeparator();
        expected += "Name: Shoplifter"+System.lineSeparator();
        expected += "Employer: Myself"+System.lineSeparator();
        expected += "Location: California"+System.lineSeparator();
        expected += "Position Type: Criminal"+System.lineSeparator();
        expected += "Core Competency: Persistence"+System.lineSeparator();
        expected += System.lineSeparator();
        Job job1 = new Job("Shoplifter", new Employer("Myself"), new Location("California"), new PositionType("Criminal"), new CoreCompetency("Persistence"));
        assertEquals(job1.toString(), expected);
    }

    @Test
    public void testToStringHandlesEmptyField() {
        String expected = System.lineSeparator();
        expected += "ID: 1"+System.lineSeparator();
        expected += "Name: Data not available"+System.lineSeparator();
        expected += "Employer: Data not available"+System.lineSeparator();
        expected += "Location: Data not available"+System.lineSeparator();
        expected += "Position Type: Data not available"+System.lineSeparator();
        expected += "Core Competency: Data not available"+System.lineSeparator();
        expected += System.lineSeparator();

        Job job1 = new Job();
        assertEquals(job1.toString(), expected);
    }
}
