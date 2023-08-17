 class Leapyear{
    int year = 2023;
    void Leapyear()
    {
        if(year%4==0)
        {
            System.out.println("Leap year");
        }
        else
        {
            System.out.println("Not a Leap year");
        }
    }
}
 class LeapyearDemo {
    public static void main(String args[])
    {
        Leapyear obj = new Leapyear();
        obj.Leapyear();
    }
}
