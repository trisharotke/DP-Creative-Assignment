class Alexa
{
    Light l;
    Fan f;
    Alarm a;
    Music m;
    TV t;
    Alexa( Light l, Fan f ,Alarm a,Music m ,TV t)
 {
 this.l=l;
 this.f=f;
 this.a=a;
 this.m=m;
 this.t=t;
 }

 public void TurnonAlexa()
 {
     l.dim();
     f.on();
     t.on();
     a.on(6,"AM");
     m.on();
 }

 public void TurnoffAlexa()
 {
    l.off();
    f.off();
    t.off();
    a.off();
    m.off();
 }
}
