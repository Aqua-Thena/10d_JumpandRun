
import java.awt.*;
import javax. swing. *;

class FIGUR extends RECHTECK
{
    RECHTECK figur;
    int x;
    int y;
    
    FIGUR()
    {
        figur = new RECHTECK();
        
        figur.PositionSetzen(20,120);
        figur.GroesseSetzen(140,140);
        figur.FarbeSetzen("pink");
        
        x = 0;
        y = 0;
    }
    
    void PositionSetzen (int xNeu, int yNeu)
        {
        x = xNeu;
        y = yNeu;
        figur.PositionSetzen (x + 20, y + 120);
    }
    
    void Springen (int xNeu, int yNeu)
    {   
        
    }
    
    int XPositionGeben ()
    {
        return x;
    }

    /**
     * Gibt den Y-Wert der Position des Kopfelements.
     * @return y-Position
     */
    int YPositionGeben ()
    {
        return y;
    }
}
