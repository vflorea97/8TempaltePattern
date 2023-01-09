package JFrame;

public class Frame extends javax.swing.JFrame {
        public Frame(String title) {
            super(title);
            this.setDefaultCloseOperation(Frame.EXIT_ON_CLOSE);
            this.setSize(300,300);
            this.setVisible(true);
        }
        public void paint(Graphics graphics) {
            super.paint(graphics);
            String mesaj = "Error!!";
            graphics.drawString(mesaj, 100, 100);
        }
        public static void main(String[] args) {
            Frame myFrame = new Frame("NewWindow.exe");
        }
    }

