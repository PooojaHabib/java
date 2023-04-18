class Computer
{
    public void playMusic()
    {
        System.out.println("Music playing...");


    }

    public String getmeApen(int cost)

    {
        if(cost>=10)
        return "pen";
        else 
        return "nothing"; 
    }
}



public class object2
{
    public static void main(String args[])
    {
        Computer obj=new Computer();
        String str=obj.getmeApen(15);
        obj.playMusic();
        System.out.println(str);


    }
}