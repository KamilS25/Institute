package ru.mirea.PR5.First;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Match extends JFrame{

    int first = 0;
    int second = 0;

    String lscorer = "N/A";

    String winner = "Draw";
    private JButton button1 = new JButton("AC Milan");
    private JButton button2 = new JButton("Real Madrid");
    private JLabel label = new JLabel("Result: "  + first + " X " + second);

    private JLabel label1 = new JLabel("Last Scorer: " + lscorer );

    private JLabel label2 = new JLabel("Winner: " + winner );

    private JPanel panel= new JPanel();



    public Match(){
        super("Football Match");
        this.setBounds(100, 100, 300,200 );
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.setBackground(Color.WHITE);
        panel.setPreferredSize( new Dimension(200,300));




        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                first += 1;
                lscorer = "AC Milan";
                label.setText("Result: " + first + " X " + second);
                label1.setText("Last Scorer: " + lscorer);

                if (first > second){
                    winner = "AC Milan";
                    label2.setText("Winner: " + winner);
                }

                else if (second > first){
                    winner = "Real Madrid";
                    label2.setText("Winner: " + winner);
                }

                else{
                    winner = "Draw";
                    label2.setText("Winner: " + winner);
                }
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                second += 1;
                lscorer = "Real Madrid";
                label.setText("Result: " + first + " X " + second);
                label1.setText("Last Scorer: " + lscorer);

                if (first > second){
                    winner = "AC Milan";
                    label2.setText("Winner: " + winner);
                }

                else if (second > first){
                    winner = "Real Madrid";
                    label2.setText("Winner: " + winner);
                }

                else{
                    winner = "Draw";
                    label2.setText("Winner: " + winner);
                }
            }
        });

        panel.add(button1);
        panel.add(button2);
        panel.add(label);
        panel.add(label1);
        panel.add(label2);
        getContentPane().add(panel);

        pack();


    }
}

