package org.launchcode.techjobs_oo;

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

    public Job(String name, Employer employer, Location location,
               PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.coreCompetency = coreCompetency;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public String toString() {
        String nameOut;
        String employerOut;
        String locOut;
        String postOut;
        String coreOut;

        if (this.getName().isEmpty()) {
            nameOut = "Data Not Available";
        } else {
            nameOut = this.getName();
        }


        if (this.getEmployer().toString().isEmpty()) {
            employerOut = "Data Not Available";
        } else {
            employerOut = this.getEmployer().toString();
        }


        if (this.getLocation().toString().isEmpty()) {
            locOut = "Data Not Available";
        } else {
            locOut = this.getLocation().toString();
        }


        if (this.getPositionType().toString().isEmpty()) {
            postOut = "Data Not Available";
        } else {
            postOut = this.getPositionType().toString();
        }


        if (this.getCoreCompetency().toString().isEmpty()) {
            coreOut = "Data Not Available";
        } else {
            coreOut = this.getCoreCompetency().toString();
        }


         return
                "\n" +
                        "ID: " + this.getId() + "\n" +
                        "Name: " + nameOut + "\n" +
                        "Employer: " + employerOut + "\n" +
                        "Location: " + locOut + "\n" +
                        "Position Type: " + postOut + "\n" +
                        "Core Competency: " + coreOut +
                        "\n";


    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
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
}
