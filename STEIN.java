  
import java.awt.*;
import javax. swing. *;
//import java. Util. *;
class STEIN extends RECHTECK
{
    RECHTECK stein;
    int x;
    int y;
    
    STEIN()
    {
        stein = new RECHTECK();
        
        stein.PositionSetzen(400,460);
        stein.GroesseSetzen(40,40);
        stein.FarbeSetzen("schwarz");
        
        x = 0;
        y = 0;
    }
    
    //void PositionSetzen (int xNeu, int yNeu)
    {
        //x = xNeu;
        //y = yNeu;
        //stein.PositionSetzen (x + 20, y + 120);
    }
    
    //void Verschieben (int param1, int param2)
    {
        //PositionSetzen (x + param1, y + param2);
    }
    
    //int XKoordinateZufaelligGeben()
    {
        //return zzGenerator. nextInt (spielfeldrand. XMaxGeben() - 
        //spielfeldrand. XMinGeben() + 1) + spielfeldrand. XMinGeben();
    }
    
}

