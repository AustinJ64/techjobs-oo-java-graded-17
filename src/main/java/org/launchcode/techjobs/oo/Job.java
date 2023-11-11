package org.launchcode.techjobs.oo;

import javax.swing.text.Position;
import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }
    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (o instanceof Job) {
            return this.id == ((Job) o).getId();
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }

    public String toString() {

        String name = (this.name == null || this.name.isEmpty() ? "Data not available" : this.name);
        String myEmployer = (this.employer == null || this.employer.getValue().isEmpty() ? "Data not available" : this.employer.getValue());
        String myLocation = (this.location == null || this.location.getValue().isEmpty() ? "Data not available" : this.location.getValue());
        String myPosition = (this.positionType == null || this.positionType.getValue().isEmpty() ? "Data not available" : this.positionType.getValue());
        String myCoreCompetency = (this.coreCompetency == null || this.coreCompetency.getValue().isEmpty() ? "Data not available" : this.coreCompetency.getValue());

        String retVal = "\n";
        retVal += "ID: " + id + "\n";
        retVal += "Name: " + name + "\n";
        retVal += "Employer: " + myEmployer + "\n";
        retVal += "Location: " + myLocation + "\n";
        retVal += "Position Type: " + myPosition + "\n";
        retVal += "Core Competency: " + myCoreCompetency + "\n";

//        String retVal = System.lineSeparator();
//        retVal += "ID: " + id + System.lineSeparator();
//        retVal += "Name: " + name + System.lineSeparator();
//        retVal += "Employer: " + myEmployer + System.lineSeparator();
//        retVal += "Location: " + myLocation + System.lineSeparator();
//        retVal += "Position Type: " + myPosition + System.lineSeparator();
//        retVal += "Core Competency: " + myCoreCompetency + System.lineSeparator();

        return retVal;
    }
}

