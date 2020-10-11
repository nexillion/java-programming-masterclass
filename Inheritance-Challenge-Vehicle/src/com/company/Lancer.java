package com.company;

public class Lancer extends Car
{
    private boolean validTechnicalInspection;
    private boolean validIncidentManagementDocuments;

    public Lancer(boolean validTechnicalInspection, boolean validIncidentManagementDocuments)
    {
        super("Lancer", 4.57, 1.81, 1.48, 0, 0, 5, 5, 0, true);
        this.validTechnicalInspection = validTechnicalInspection;
        this.validIncidentManagementDocuments = validIncidentManagementDocuments;
    }

    public void streetReady()
    {
        if(this.validTechnicalInspection && this.validIncidentManagementDocuments)
        {
            System.out.println("The car is street ready.");
        }
        else if(!this.validTechnicalInspection && !this.validIncidentManagementDocuments)
        {
            System.out.println("The " + getName() + " must have valid yearly technical inspection and valid Incident Management Documents");
        }
        else if(!this.validTechnicalInspection)
        {
            System.out.println("The " + getName() + " must have valid yearly technical inspection");
        }
        else
        {
            System.out.println("The " + getName() + " doesn't have valid Incident Management Documents");
        }
    }
}
