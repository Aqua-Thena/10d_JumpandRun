
import java. awt. event. *;


    class SPIEL extends SIMULATION
{
    BODEN boden;
    
    STEIN stein;
    
    FIGUR figur;
    
    RANDSYMBOL spielfeldrand;
    
    int punkte;
    
    final static int maxSpruenge = 1;
    
    int aktSpruenge;
    
    int x;
    int y;
    
    SPIEL ()
    {
        boden = new BODEN ();
        stein = new STEIN ();
        figur = new FIGUR ();
        spielfeldrand = new RANDSYMBOL ();
        punkte = 0;
        aktSpruenge = maxSpruenge;
    }
    
    /**
     * Wertet die Tasteneingaben aus.
     * @param welche Tastencode
     */
    void TasteGedrueckt (char welche)
    {
        switch (welche)
        {
           case 'S':
           case 's':
            Starten ();
            break;
           case 'P':
           case 'p':
            Anhalten ();
            break;
           case 'J':
           case 'j':
            Springen ();
            break;
         
           default:
            //System. out. println ("Taste: " + (0 + (int) welche));
        }
    }
    
    void Springen (int xNeu, int yNeu)
    {
        x = xNeu;
        y = yNeu;
        figur.PositionSetzen (x -= 0, y += 40);
    }
    
    //boolean FigurTrifftStein ()
    {
        {
            //if ((figur.XPositionGeben() == stein.XPositionGeben()) && (figur.YPositionGeben() == stein.YPositionGeben()))
            {
                //return true;
            }
        }
        //return false;
    }
    
    //void TaktImpulsAusfuehren ()
    {
        //if ((stein. XPositionGeben() <= spielfeldrand. XMaxGeben()) && (stein. XPositionGeben() >= spielfeldrand. XMinGeben()) &&
            //(stein. YPositionGeben() <= spielfeldrand. YMaxGeben()) && (stein. YPositionGeben() >= spielfeldrand. YMinGeben()) &&
            //! FigurTrifftStein())
        {
            
            //if (aktSpruenge <= 0)
            {
                //stein. Bewegen(true);
                //aktSpruenge = maxSpruenge;
            }
            //else
            {
                //stein. Bewegen(false);
            }
          
        }
        //else
        {
            //Anhalten ();
            //if (FigurTrifftStein())
            {
                //spielfeldrand.EndemeldungSetzen("Game Over - Figur ist gegen Stein gerannt");
            }
            //else
            {
                //spielfeldrand.EndemeldungSetzen("Game Over");
            }
        }
    }
 
}
    
    
