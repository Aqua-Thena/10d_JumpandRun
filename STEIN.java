  
import java.awt.*;
import javax. swing. *;

class STEIN extends RECHTECK
{
    RECHTECK stein;
    int x;
    int y;
    
    STEIN()
    {
        stein = new RECHTECK();
        
        x = 0;
        y = 0;
    }
    
    void PositionSetzen (int xNeu, int yNeu)
        {
        x = xNeu;
        y = yNeu;
        stein.PositionSetzen (x + 20, y + 120);
    }
    
    void Verschieben (int param1, int param2)
    {
        PositionSetzen (x + param1, y + param2);
    }
    
     int XPositionGeben ()
    {
        return x;
    }

    int YPositionGeben ()
    {
        return y;
    }
    
}
