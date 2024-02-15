import java.awt.*;
import java.awt.event.*;

class MyButtons extends Frame implements ActionListener {
    Button b1, b2, b3;
    Label l1;
    MyButtons() {
        this.setLayout(new FlowLayout()); // used to set the layout
        b1 = new Button("Yellow");
        b2 = new Button("Blue");
        b3 = new Button("Pink");
        l1=new Label("Welcome");
        this.add(b1);
        this.add(b2);
        this.add(b3);
        this.add(l1);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        // Add window listener to handle window closing event
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose(); // Close the window
            }
        });
    }

    public void actionPerformed(ActionEvent ae) {
        String str = ae.getActionCommand();
        if (ae.getSource() == b1)
            l1.setForeground(Color.yellow);
        if (str.equals("Blue"))
            l1.setBackground(Color.blue);
        if (str.equals("Pink"))
            l1.setBackground(Color.pink);
    }

    public static void main(String args[]) {
        MyButtons mb = new MyButtons();
        mb.setTitle("My Buttons");
        mb.setSize(650, 400);
        mb.setVisible(true);
    }
}
