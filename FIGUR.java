
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
        
        figur.PositionSetzen(20,460);
        figur.GroesseSetzen(40,40);
        figur.FarbeSetzen("magenta");
        
        x = 0;
        y = 0;
    }
    
    void Springen (int xNeu, int yNeu)
    {
        x = xNeu;
        y = yNeu;
        figur.PositionSetzen (x -= 0, y += 40);
    }

}
