package com.company;

public class Gearbox
{
    public class Gear
    {
        private double ratio;

        public Gear(double ratio)
        {
            this.ratio = ratio;
        }

        public double drivingSpeed(int rpm)
        {
            return (rpm * this.ratio);
        }
    }
}
