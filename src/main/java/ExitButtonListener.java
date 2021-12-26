

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExitButtonListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
//        System.out.println(e);
        System.out.println("Приложение завершает свою работу");
        System.exit(0);
    }
}