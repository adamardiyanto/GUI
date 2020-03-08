import javax.swing.*;
import java.awt.*;

class TugasGui {
   public static void main(String[] args) {
	GUI g = new GUI();
   }
}

class GUI extends JFrame {

   JLabel ljudul = new JLabel(" BIODATA DIRI ");
   
   JLabel labelGambar = new JLabel (new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("gambar.png")).getImage().getScaledInstance(100, 150, Image.SCALE_SMOOTH)));
   JLabel lnama = new JLabel(" ADAM ARDIYANTO ");
   JLabel lttl = new JLabel(" Yogyakarta, 3 April 2000 ");
   
  

   JRadioButton rbPria = new JRadioButton(" Laki-Laki ");
   JRadioButton rbWanita = new JRadioButton("perempuan ");

 
   String[] namaAgama =
            {"Islam","Kristen","Katolik","Hindu","Budha"};
   JComboBox cmbAgama = new JComboBox(namaAgama);
 
   
   JLabel lalamat = new JLabel(" ALAMAT "); 
   JTextArea jalamat = new JTextArea();
   JScrollPane scrollPane = new JScrollPane(jalamat);
   JButton btnSave = new JButton("save");
   JButton edit = new JButton("edit");

   public GUI() {
        
	setTitle("");
	setDefaultCloseOperation(3);
	setSize(350,600);
	ButtonGroup group = new ButtonGroup();
	group.add(rbPria);
	group.add(rbWanita);

	setLayout(null);
	add(ljudul);
        add(labelGambar);
        add(lnama);
        add(lttl);
	add(cmbAgama);
	add(rbPria);
	add(rbWanita);
        add(lalamat);
        add(scrollPane);
//        add(jalamat);
        
	add(btnSave);
        add(edit);

	// setBounds(m,n,o,p)
	// m = posisi x; n = posisi n
	// o = panjang komponen; p = tinggi komponen
	ljudul.setBounds(100,10,200,30);
        ljudul.setFont(new Font("Sans Serif", Font.BOLD, 20));
        labelGambar.setBounds(65,30,200,200);
        lnama.setBounds(100,240,200,20);
        lnama.setFont(new Font("Sans Serif", Font.BOLD, 14));
        lttl.setBounds(75,280,200,20);
        lttl.setFont(new Font("Monospaced",Font.CENTER_BASELINE, 12));
	cmbAgama.setBounds(20,300,280,20);
	rbPria.setBounds(30,320,100,20);
	rbWanita.setBounds(200,320,100,20);
        lalamat.setBounds(135,340,100,20);
        scrollPane.setBounds(20,360, 300, 100);
        scrollPane.setAutoscrolls(true);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        edit.setBounds(30,480,80,20);
	btnSave.setBounds(230,480,80,20);
	setVisible(true);
   }
}
    
        
