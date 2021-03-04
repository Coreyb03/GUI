
import java.awt.EventQueue;
import java.util.*;

import javax.swing.*;

public class App extends JFrame{
    public static void main(String[] args) throws Exception {
        EventQueue.invokeLater(() -> {
            App calc = new App();
            calc.setVisible(true);
        });
    
    }

    public App() {
        initUI();
        
    }

    
    private void initUI(){
        Calc calcString = new Calc();

        ArrayList<JComponent> buttonList = new ArrayList<JComponent>();

        JButton button = new JButton("Quit");
        button.addActionListener((Event) -> System.exit(0));
        buttonList.add(button);

        JButton button2 = new JButton("STOP");
        button2.addActionListener((Event) -> calcString.setCalcString(""));
        buttonList.add(button2);

        createLayout(button, button2);

        setTitle("Calaculator");
        setSize(300,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void createLayout(JComponent... args){
        var pane = getContentPane();
        var gl = new GroupLayout(pane);
        pane.setLayout(gl);

        gl.setAutoCreateContainerGaps(true);
        
        gl.setHorizontalGroup(gl.createSequentialGroup().addComponent(args[0]).addComponent(args[1]));
        gl.setVerticalGroup(gl.createParallelGroup().addComponent(args[0]).addComponent(args[1]));
    }
}
