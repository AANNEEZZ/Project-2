import javax.swing.*;
import java.awt.*;
public class CustomPanel extends JPanel {
    public CustomPanel(LayoutManager layout){
        super.setLayout(layout);
        super.setBackground(Color.black);
        super.setFont(new Font("Arial", Font.PLAIN, 30));

    }
}
