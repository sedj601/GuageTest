/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guagetest;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import jfxtras.scene.control.gauge.linear.*;

/**
 *
 * @author blj0011
 */
public class FXMLDocumentController implements Initializable
{    
    @FXML private BasicRoundDailGauge gaugeMain;
    @FXML private SimpleMetroArcGauge gaugeMain2;
    
    @FXML
    private void handleButtonAction(ActionEvent event)
    {
        System.out.println("You clicked me!");
        
        final long startNanoTime = System.nanoTime();
 
    new AnimationTimer()
    {
        @Override
        public void handle(long currentNanoTime)
        {
            double t = (currentNanoTime - startNanoTime) / 1000000000.0; 
 
            
            
            if( t * 10 >= 100)
            {
                System.out.println(100);
                gaugeMain.setValue(100);
                gaugeMain2.setValue(100);
            }
            else
            {
                System.out.println(t * 10);
                gaugeMain.setValue(t * 10);
                gaugeMain2.setValue(t * 10);
            }            
        }
    }.start();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        // TODO
    }    
    
}
