
import java.awt.*;
import javax. swing. *;

class FIGUR
{
    /** Das Anzeigefenster. */
    private JFrame fenster;
    
    /** Anzeigegröße für das Rumpfelement */
    private static final int groesse = OBERFLAECHE. RasterGroesseGeben ();

    /** Interna */
    private int x;
    private int y;
    private JComponent anzeige;

    /**
     * Standardkonstruktor für Objekte der Klasse KASSENSYMBOL.
     * Er erzeugt ein scharzes Rechteck in der linken oberen Ecke des Fensters.
     * Das Fenster wird bei Bedarf angelegt.
     */
    FIGUR()
    {
        fenster = OBERFLAECHE. FensterGeben ();
        anzeige = new JComponent () {
            // Stellt das Rumpfelement auf dem Fenster dar.
            public void paintComponent (Graphics g)
            {
                g. clearRect (0, 0, groesse, groesse);
                g. setColor (Color. red);
                g. fillRect (0, 0, groesse - 1, groesse - 1);
                g. setColor (Color. red);
                g. drawRect (0, 0, groesse - 1, groesse - 1);
                g. drawRect (1, 1, groesse - 3, groesse - 3);
                g. drawLine (0, 0, groesse - 1, groesse - 1);
                g. drawLine (1, 0, groesse - 1, groesse - 2);
                g. drawLine (0, 1, groesse - 2, groesse - 1);
                g. drawLine (0, groesse - 1, groesse - 1, 0);
                g. drawLine (1, groesse - 1, groesse - 1, 1);                
                g. drawLine (0, groesse - 2, groesse - 2, 0);
            }

        };
        anzeige. setVisible (true);
        anzeige. setSize (groesse, groesse);
        fenster. add (anzeige, 0);
        PositionSetzen (0, 0);
    }

    /**
     * Setzt die Position des Rumpfelements. Der Ursprung liegt in der Mitte des
     * Fensters, die y-Achse zeigt nach unten. (x /y) bedeutet das
     * K&auml;stchen rechts unterhalb der Gitterlinien.
     * @param x x-Position
     * @param y y-Position
     */
    public void PositionSetzen (int x, int y)
    {
        this. x = x;
        this. y = y;
        anzeige. setLocation (OBERFLAECHE. FensterBreiteGeben () / 2 + x * groesse, OBERFLAECHE. FensterHoeheGeben () / 2 + y * groesse);
    }

    /**
     * Gibt den X-Wert der Position des Kopfelements.
     * @return x-Position
     */
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

    /**
     * Entfernt die Figur aus der Anzeige
     */
    public void Entfernen ()
    {
        (OBERFLAECHE. FensterGeben ()). remove (anzeige);
        (OBERFLAECHE. FensterGeben ()). repaint();
    }


     
       
    int XPositionGeben ()
    {
        return kopf. XPositionGeben();
    }
    
    /**
     * Gibt die y-Position des Schlangenkopfs zurück.
     * @return y-Position des Schlangenkopfs
     */
    int YPositionGeben ()
    {
        return kopf. YPositionGeben();
    }
        
    /**
     * Prueft ob der Schlangenkopf auf der Position eines Rumpfsymbols ist, d.h. sich die Schlange selbst gebissen hat.
     * return wahr, wenn der Kopf im Rumpf liegt.
     */
    boolean FigurTrifftHindernis ()
    {
        for (RUMPFSYMBOL r: rumpf)
        {
            if ((kopf.XPositionGeben() == r.XPositionGeben()) && (kopf.YPositionGeben() == r.YPositionGeben()))
            {
                return true;
            }
        }
        return false;
    }
}
