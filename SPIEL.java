
import java. awt. event. *;

/**
 * Rahmenklasse des Spiels.
 * 
 * @author Albert Wiedemann
 * @version 1.0
 */
class SPIEL extends SIMULATION
{
    STEIN stein;
    
    FIGUR figur;
    /** Das Spielfeld. */
    RANDSYMBOL spielfeldrand;
    /** Der Punktestand */
    int punkte;
    /** Verlängerungsintervall */
    final static int maxSchritte = 10;
    /** Aktuelle Schrittzahl für Verlängerung */
    int aktSchritte;
    
    int x;
    int y;
    
    /**
     * Baut die Basiselemente auf.
     */
    SPIEL ()
    {
        figur = new FIGUR ();
        spielfeldrand = new RANDSYMBOL ();
        punkte = 0;
        aktSchritte = maxSchritte;
    }
    
    void TaktImpulsAusfuehren ()
    {
        if ((figur. XPositionGeben() <= spielfeldrand. XMaxGeben()) && (figur. XPositionGeben() >= spielfeldrand. XMinGeben()) &&
            (figur. YPositionGeben() <= spielfeldrand. YMaxGeben()) && (figur. YPositionGeben() >= spielfeldrand. YMinGeben()) &&
            ! figur. FigurTrifftStein())
        {
            aktSchritte = aktSchritte - 1;
            if (aktSchritte <= 0)
            {
                figur. Bewegen(true);
                aktSchritte = maxSchritte;
            }
            else
            {
                figur. Bewegen(false);
            }
            punkte += 1;
            spielfeldrand. PunkteSetzen (punkte);
        }
        else
        {
            Anhalten ();
            if (figur. FigurTrifftStein())
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
          case 'J':
          case 'j':
            Springen ();
          
          default:
            //System. out. println ("Taste: " + (0 + (int) welche));
        }
    }
    
    void Bewegen (boolean springen)
    {
        int x, xalt;
        int y, yalt;
        x = figur. XPositionGeben ();
        y = figur. YPositionGeben ();
        xalt = x;
        yalt = y;
        
        figur. PositionSetzen (x, y);
    }
        
    int XPositionGeben ()
    {
        return x;
    }

    int YPositionGeben ()
    {
        return y;
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
    
