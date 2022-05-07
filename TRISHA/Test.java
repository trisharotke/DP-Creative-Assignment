class Test
{
    public static void main(String[] args) {
        Light l=new Light();
        Fan f=new Fan();
        Alarm a= new Alarm();
        Music m= new Music();
        TV t= new TV();
        
        Alexa ax= new Alexa(l,f,a,m,t);

        ax.TurnonAlexa();
        System.out.println("\n");
        ax.TurnoffAlexa();
    }
}
