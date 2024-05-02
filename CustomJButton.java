    import javax.swing.*;
    import java.awt.*;

    public class CustomJButton extends JButton {
        public CustomJButton(String text){
            super.setText(text);
            super.setBorderPainted(false);
            super.setPreferredSize(new Dimension(200, 40));
        }
    }
