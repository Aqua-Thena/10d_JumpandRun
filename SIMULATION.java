
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax. swing. *;

/**
 * Steuert die gesamte Simulation
 * 
 * @author Albert Wiedemann
 * @version 1.0
 */
class SIMULATION
{
    /** Timerobjekt für die zentrale Zeitverwaltung */
    private Timer timer;
    
    /**
     * Standardkonstruktor für Objekte der Klasse Simulation.
     * Erzeugt den Taktgeber.
     */
    SIMULATION ()
    {
        timer = new Timer (1000, new ActionListener () {
            /**
             * vom Timer aufgerufen
             * erhöht die Simulationszeit
             * @param evt der Timerevent
             */
            public void actionPerformed (ActionEvent evt)
            {
                TaktImpulsAusfuehren ();
            }
        });
        OBERFLAECHE. FensterGeben (). addKeyListener (new KeyAdapter() {
            /**
             * Gibt die Taste an die eigentliche Aktionsmethode weiter.
             * @param e das zugrestellte Ereignis
             */
            public void keyPressed(KeyEvent e)
            {
                TasteGedrueckt ((char) e. getKeyCode ());
            }
        });

    }
    
    /**
     * Die eigentliche Aktionsmethode des Timers.
     * Muss bei Bedarf von einer Unterklasse überschrieben werden. 
     */
    void TaktImpulsAusfuehren ()
    {
        System. out. println ("Tick");
    }

    /**
     * Timer starten
     */
    void Starten ()
    {
        timer. start ();
    }

    /**
     * Timer anhalten
     */
    void Anhalten ()
    {
        timer. stop ();
    }
    
    /**
     * Ablaufgeschwindigkeit einstellen
     * 
     * @param dauer: Angabe in Millisekunden
     */
    void TaktdauerSetzen (int dauer)
    {
        timer. setDelay(dauer);
    }
    
    /**
     * Die eigentliche Aktionsmethode für gedrückte Tasten.
     * <br>Muss bei Bedarf von einer Unterklasse überschrieben werden. 
     * @param welche die gedrückte Taste
     */
    void TasteGedrueckt (char welche)
    {
    	System. out. println ("Taste gedrückt: " + welche);
    }
}
