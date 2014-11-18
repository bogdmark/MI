import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Marci on 2014.11.18..
 */
public class AppFrame extends JFrame{

    JTextField actorFolderField = new JTextField(20);
    JTextField movieFolderField = new JTextField(20);
    JLabel actorFolderLabel = new JLabel("Actors' folder:");
    JLabel movieFolderLabel = new JLabel("Movies' folder:");
    JButton actorBrowseButton = new JButton("...");
    JButton movieBrowseButton = new JButton("...");
    JTextField actorName1Field = new JTextField(20);
    JTextField actorName2Field = new JTextField(20);
    JButton searchButton = new JButton("Search");
    JButton detailsButton = new JButton("Details");
    JButton prevButton = new JButton("Prev");
    JButton nextButton = new JButton("Next");
    JTextArea hitsArea = new JTextArea();
    JLabel actorNamesLabel = new JLabel("Actors/Actresses:");
    JLabel hitsLabel = new JLabel("Hit(s):");


    private void enter()
    {
        JPanel actorBrowsePanel = new JPanel();
        JPanel movieBrowsePanel = new JPanel();
        actorBrowsePanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        movieBrowsePanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        actorBrowsePanel.add(actorFolderLabel);
        actorBrowsePanel.add(actorFolderField);
        actorBrowsePanel.add(actorBrowseButton);
        movieBrowsePanel.add(movieFolderLabel);
        movieBrowsePanel.add(movieFolderField);
        movieBrowsePanel.add(movieBrowseButton);

        JPanel searchPanel = new JPanel();
        searchPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        searchPanel.add(actorNamesLabel);
        searchPanel.add(actorName1Field);
        searchPanel.add(actorName2Field);
        searchPanel.add(searchButton);

        JPanel topPanel = new JPanel();
        topPanel.setLayout(new BorderLayout());
        topPanel.add(actorBrowsePanel, BorderLayout.PAGE_START);
        topPanel.add(movieBrowsePanel, BorderLayout.CENTER);
        topPanel.add(searchPanel, BorderLayout.PAGE_END);

        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        bottomPanel.add(prevButton);
        bottomPanel.add(nextButton);
        bottomPanel.add(detailsButton);

/*
        hitsArea.setMaximumSize(new Dimension(300, 300));
        hitsArea.setPreferredSize(new Dimension(300, 300));
*/
        hitsArea.setEditable(false);
        hitsArea.setAutoscrolls(true);

        JPanel hitsPanel = new JPanel();
        hitsPanel.setLayout(new BorderLayout());
        hitsPanel.add(hitsLabel, BorderLayout.PAGE_START);
        hitsPanel.add(hitsArea, BorderLayout.CENTER);

        this.setLayout(new BorderLayout());
        this.add(topPanel, BorderLayout.PAGE_START);
        this.add(hitsPanel, BorderLayout.CENTER);
        this.add(bottomPanel, BorderLayout.PAGE_END);
    }

    private void buttonListeners()
    {
        actorBrowseButton.setActionCommand("actorBrowse");
        ActionListener a1 = new ButtonActionListener();
        actorBrowseButton.addActionListener(a1);

        movieBrowseButton.setActionCommand("movieBrowse");
        ActionListener a2 = new ButtonActionListener();
        actorBrowseButton.addActionListener(a2);

        searchButton.setActionCommand("search");
        ActionListener a3 = new ButtonActionListener();
        actorBrowseButton.addActionListener(a3);

        prevButton.setActionCommand("prev");
        ActionListener a4 = new ButtonActionListener();
        actorBrowseButton.addActionListener(a4);

        nextButton.setActionCommand("next");
        ActionListener a5 = new ButtonActionListener();
        actorBrowseButton.addActionListener(a5);

        detailsButton.setActionCommand("details");
        ActionListener a6 = new ButtonActionListener();
        actorBrowseButton.addActionListener(a6);
    }

    public class ButtonActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getActionCommand().equals("actorBrowse"))
            {
                actorFolderField.setText("D:\\");
            }
            if (e.getActionCommand().equals("movieBrowse"))
            {

            }
            if (e.getActionCommand().equals("search"))
            {

            }
            if (e.getActionCommand().equals("prev"))
            {

            }
            if (e.getActionCommand().equals("next"))
            {

            }
            if (e.getActionCommand().equals("details"))
            {

            }

        }
    }
    public AppFrame()
    {
        super("Movie Hunter");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(700, 500));
        enter();
        buttonListeners();
    }

    public static void main(String args[])
    {
        AppFrame af = new AppFrame();
        af.setVisible(true);
    }
}
