
import java. awt. event. *;

/**
 * Rahmenklasse des Spiels.
 * 
 * @author Albert Wiedemann
 * @version 1.0
 */
class SPIEL extends SIMULATION
{
    /** Die Schlange. */
    FIGUR figur;
    /** Das Spielfeld. */
    RANDSYMBOL spielfeldrand;
    /** Der Punktestand */
    int punkte;
    /** Verlängerungsintervall */
    final static int maxSchritte = 10;
    /** Aktuelle Schrittzahl für Verlängerung */
    int aktSchritte;
    
    /**
     * Baut die Basiselemente auf.
     */
    SPIEL ()
    {
        figur = new FIGUR (0, 0, 'O');
        spielfeldrand = new RANDSYMBOL ();
        punkte = 0;
        aktSchritte = maxSchritte;
    }
    
    /**
     * Bewegt die Schlange.
     */
    void TaktImpulsAusfuehren ()
    {
        if ((figur. XPositionGeben() <= spielfeldrand. XMaxGeben()) && (figur. XPositionGeben() >= spielfeldrand. XMinGeben()) &&
            (figur. YPositionGeben() <= spielfeldrand. YMaxGeben()) && (figur. YPositionGeben() >= spielfeldrand. YMinGeben()) &&
            ! figur. FigurTrifftHindernis())
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
            if (figur. FigurTrifftHindernis())
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
    
    void Bewegen (char welche)
    {
        switch (welche)
        {
            case 
        }
    }
