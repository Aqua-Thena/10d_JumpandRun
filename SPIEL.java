
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
    
    void TaktImpulsAusfuehren ()
    {
        {
            Anhalten ();
            if (FigurTrifftStein())
            {
                spielfeldrand.EndemeldungSetzen("Game Over - Figur trifft Hindernis");
            }
            else
            {
                spielfeldrand.EndemeldungSetzen("Game Over - Figur über Spielfeldrand");
            }
        }
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
         
          default:
            //System. out. println ("Taste: " + (0 + (int) welche));
        }
    }
     
    boolean FigurTrifftStein ()
    {
        {
            if ((figur.XPositionGeben() == stein.XPositionGeben()) && (figur.YPositionGeben() == stein.YPositionGeben()))
            {
                return true;
            }
        }
        return false;
    }
    }
    
