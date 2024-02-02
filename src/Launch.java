import GUI.LoginGui;

import javax.swing.*;

public class Launch {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run() {
                new LoginGui().setVisible(true);
            }
        });
    }
}
