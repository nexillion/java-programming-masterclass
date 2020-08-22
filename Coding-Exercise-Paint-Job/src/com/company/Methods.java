package com.company;

public class Methods
{
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets)
    {
        if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets <= 0)
        {
            return -1;
        }
        else
        {
            double wallSize = width * height;
            int bucketsToBuy = 0;

            wallSize = wallSize - (areaPerBucket * extraBuckets);
            while(wallSize > 0)
            {
                wallSize = wallSize - areaPerBucket;
                bucketsToBuy++;
            }
            return bucketsToBuy;
        }
    }

    public static int getBucketCount(double width, double height, double areaPerBucket)
    {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0)
        {
            return -1;
        }
        else
            {
            double wallSize = width * height;
            int bucketsToBuy = 0;

            while (wallSize > 0)
            {
                wallSize = wallSize - areaPerBucket;
                bucketsToBuy++;
            }
            return bucketsToBuy;
        }
    }

    public static int getBucketCount(double area, double areaPerBucket)
    {
        if(area <= 0 || areaPerBucket <= 0)
        {
            return -1;
        }
        else
        {
            int bucketsToBuy = 0;

            while(area > 0)
            {
                area = area - areaPerBucket;
                bucketsToBuy++;
            }
            return bucketsToBuy;
        }
    }
}
