package Model;

import java.awt.*;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.DocumentListener;


/**
 * This Class is responsible for all the Front-End development for
 * generating an individual question.
 * Connects to Back-End Controller.
 */
public class QuestionPanel extends JPanel {
  public JLabel qLabel;
  public JTextArea qTextArea;

  //TextFields for all the possible Answers
  public JTextField answer1;
  public JTextField answer2;
  public JTextField answer3;
  public JTextField answer4;

  //Toggle Buttons for selecting correct answer
  public JRadioButton correctToggle;
  public JRadioButton wrongToggle1;
  public JRadioButton wrongToggle2;
  public JRadioButton wrongToggle3;

  //Buttons to submit or delete
  public JButton submitButton;


  public QuestionPanel() {
    super();


    //this.setPreferredSize(new Dimension(500, 500));


    Color MAIA_BG_COLOR = new Color(40, 45, 51);
    Color MAIA_LOGO_COLOR = new Color(144, 195, 240);

    this.setBackground(new Color(10,100,100));


    Border border = BorderFactory.createMatteBorder(6, 3, 6, 6,
            MAIA_LOGO_COLOR);
    this.setBorder(BorderFactory.createTitledBorder(border,
            "Card Factory", 0, 0, Font.getFont(Font.DIALOG),
            MAIA_LOGO_COLOR));




    this.setLayout(new BoxLayout(this,BoxLayout.PAGE_AXIS));


    this.qLabel = new JLabel("Create a Question");
    this.qTextArea =  new JTextArea(3,10);
    qTextArea.setLineWrap(true);
    qTextArea.setWrapStyleWord(true);

    //qTextArea.getDocument().addDocumentListener();

    //Initializing answer Text Fields
    this.answer1 = new JTextField();
    this.answer1.setActionCommand("answer1");

    this.answer2 = new JTextField();
    this.answer2.setActionCommand("answer2");

    this.answer3 = new JTextField();
    this.answer3.setActionCommand("answer3");

    this.answer4 = new JTextField();
    this.answer4.setActionCommand("answer4");

    //Initializing Toggle Buttons
    this.correctToggle = new JRadioButton();
    this.correctToggle.setActionCommand("correctToggle");

    this.wrongToggle1 = new JRadioButton();
    this.wrongToggle2 = new JRadioButton();
    this.wrongToggle3 = new JRadioButton();

    //Initializing Submit Button
    this.submitButton = new JButton("Submit");
    this.submitButton.setActionCommand("submitButton");



    //Initializing JLabels
    JLabel answerLabel1 = new JLabel("Answer 1");
    JLabel answerLabel2 = new JLabel("Answer 2");
    JLabel answerLabel3 = new JLabel("Answer 3");
    JLabel answerLabel4 = new JLabel("Answer 4");



    ButtonGroup buttonGroup = new ButtonGroup();
    buttonGroup.add(correctToggle);
    buttonGroup.add(wrongToggle1);
    buttonGroup.add(wrongToggle2);
    buttonGroup.add(wrongToggle3);





    this.add(qLabel);
    this.add(qTextArea);

    this.add(answerLabel1);
    this.add(answer1);
    this.add(correctToggle);

    this.add(answerLabel2);
    this.add(answer2);
    this.add(wrongToggle1);

    this.add(answerLabel3);
    this.add(answer3);
    this.add(wrongToggle2);

    this.add(answerLabel4);
    this.add(answer4);
    this.add(wrongToggle3);

    this.add(submitButton);

   // this.add(answer);

  }


  /**
   * Connects Front-End buttons to Back-End Controller
   * @param listen - ActionListener (Applicable to Buttons)
   * @param listenDoc - Document Listener (Applicable to Text Area)
   */
  public void setActionListener(ActionListener listen, DocumentListener listenDoc) {

    qTextArea.getDocument().addDocumentListener(listenDoc);
    answer1.addActionListener(listen);
    answer2.addActionListener(listen);
    answer3.addActionListener(listen);
    answer4.addActionListener(listen);

    correctToggle.addActionListener(listen);
    wrongToggle1.addActionListener(listen);
    wrongToggle2.addActionListener(listen);
    wrongToggle3.addActionListener(listen);

    submitButton.addActionListener(listen);





  }


  public void setColor(Color color) {

    this.setBackground(color);

  }

}
