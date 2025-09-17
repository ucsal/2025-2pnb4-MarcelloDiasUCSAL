package br.com.mariojp.figureeditor;

import javax.swing.*;
import java.awt.*;

public class App {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Figure Editor");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 600);

            DrawingPanel panel = new DrawingPanel();
            frame.add(panel, BorderLayout.CENTER);

            // Painel de botões
            JPanel topPanel = new JPanel();
            JButton colorButton = new JButton("Cor...");
            colorButton.addActionListener(e -> {
                Color chosen = JColorChooser.showDialog(frame, "Escolher cor", Color.BLACK);
                if (chosen != null) {
                    panel.setCurrentColor(chosen);
                }
            });
            topPanel.add(colorButton);

            frame.add(topPanel, BorderLayout.NORTH);

            frame.setVisible(true);
        });
    }
}
