/*
*Steven Allen
*ITSE-1302
*4/27/2017
*Exercise 17
*Code that makes a method that accepts two integer parameters and returns their average as a floating point number.
*/

public class AverageInts {

    public static void main(String[] args) {
        int intA = 158;
        int intB = 173;
        int intC = 295;
        int intD = 267;
        
        AverageInts objAverage = new AverageInts();
        objAverage.averageOfInts(intA, intB);
        objAverage.averageOfInts(intA, intB, intC);
        objAverage.averageOfInts(intA, intB, intC, intD);
        System.out.println(objAverage.toString());   
    }
    private float intAverage2 = 0;
    private float intAverage3 = 0;
    private float intAverage4 = 0;

    public float averageOfInts(int int1, int int2)
    {
        intAverage2 = (float)(int1 + int2)/2;
        return intAverage2;
    }
    public float averageOfInts(int int1, int int2, int int3)
    {
        intAverage3 = (float)(int1 + int2 + int3)/3;
        return intAverage3;
    }
    public float averageOfInts(int int1, int int2, int int3, int int4)
    {
        intAverage4 = (float)(int1 + int2 + int3 + int4)/4;
        return intAverage4;
    }
    public String toString()
    {
        String strAverages = "";
        strAverages += "Average: " + intAverage2;
        strAverages += "\nAverage: " + intAverage3;
        strAverages += "\nAverage: " + intAverage4;
        
        return strAverages;
    }
}