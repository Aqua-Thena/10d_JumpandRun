
import java.awt.*;
import javax. swing. *;

class BODEN extends RECHTECK
{
    RECHTECK boden;
    
    int x;
    int y;
    
    BODEN()
    {
        boden = new RECHTECK();
        
        boden.PositionSetzen(0,500);
        boden.GroesseSetzen(4000,100);
        boden.FarbeSetzen("gruen");
        
        x = 0;
        y = 0;
    }    
}