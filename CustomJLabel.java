import javax.swing.*;
import java.awt.*;
public class CustomJLabel extends JLabel{
    public CustomJLabel(String text){
        super.setText(text);
        super.setForeground(new Color(0xFFFFFF));
    }
}
