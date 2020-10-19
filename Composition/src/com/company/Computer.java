package com.company;

public class Computer
{
    private Motherboard motherboard;
    private Monitor monitor;
    private Case theCase;

    public Computer(Motherboard motherboard, Monitor monitor, Case theCase)
    {
        this.motherboard = motherboard;
        this.monitor = monitor;
        this.theCase = theCase;
    }

    public void powerOn()
    {
        getTheCase().pressPowerButton();
        drawLogo();
    }

    private void drawLogo()
    {
        monitor.drawPixelAt(1658,500, "Red");
    }

    public Motherboard getMotherboard()
    {
        return motherboard;
    }

    public Monitor getMonitor()
    {
        return monitor;
    }

    private Case getTheCase() // set to private for demonstration
    {
        return theCase;
    }

    public void setMotherboard(Motherboard motherboard)
    {
        this.motherboard = motherboard;
    }

    public void setMonitor(Monitor monitor)
    {
        this.monitor = monitor;
    }

    public void setTheCase(Case theCase)
    {
        this.theCase = theCase;
    }
}
