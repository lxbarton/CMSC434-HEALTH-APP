package WorkoutPage;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HistoryPage extends JFrame{

    public HistoryPage(JFrame prev, JList<String> list){
        JScrollPane frame = new JScrollPane();
        JPanel temp = new JPanel();
        temp.add(list);
        frame.setViewportView(temp);
        JButton back = new JButton("Back");
        setLayout(new GridLayout(2,2));
        add(frame);
        add(back);

        setSize(new Dimension(375, 500));
        setPreferredSize(getSize());
        back.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                setVisible(false);
                prev.setVisible(true);
            }
        });

    }
    
}
