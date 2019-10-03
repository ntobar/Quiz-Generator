package Model;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;



/**
 * This Class is responsible for all the Front-End development for
 * generating an individual question.
 * Connects to Back-End Controller.
 */
public class QuestionPanel extends JPanel {
  private Quiz quiz;

  public JLabel qLabel;
  public JTextField qTextArea;

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

  public JButton finishButton;
  public ButtonGroup buttonGroup;


  /**
   *
   * @param quiz
   */
  public QuestionPanel(Quiz quiz) {
    super();

    this.quiz = quiz;


    //this.setPreferredSize(new Dimension(500, 500));

    Color MAIN_BLUE = new Color(3,57,108);
    Color SEC_BLUE = new Color(53,167,156);


    Color MAIA_BG_COLOR = new Color(40, 45, 51);
    Color MAIA_LOGO_COLOR = new Color(144, 195, 240);

    this.setBackground(SEC_BLUE);


    Border border = BorderFactory.createMatteBorder(6, 3, 6, 6,
            MAIN_BLUE);
    this.setBorder(BorderFactory.createTitledBorder(border,
            "QuizWiz", 0, 0, Font.getFont(Font.DIALOG),
            MAIA_LOGO_COLOR));




    //this.setLayout(new BoxLayout(this,BoxLayout.PAGE_AXIS));
    //this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
    this.setLayout(new GridBagLayout());
    GridBagConstraints c = new GridBagConstraints();




    this.qLabel = new JLabel("Create a Question");
    this.qTextArea =  new JTextField(20);
    this.qTextArea.setActionCommand("question");

    //qTextArea.getDocument().addDocumentListener();

    //Initializing answer Text Fields
    this.answer1 = new JTextField(20);
    this.answer1.setActionCommand("answer1");
    this.answer1.setToolTipText("<html><b><font color=red>"
            + "Please enter some text here" + "</font></b></html>");
    this.setVisible(true);
    answer1.requestFocusInWindow();



    this.answer2 = new JTextField(20);
    this.answer2.setActionCommand("answer2");
    this.answer2.setFont(new java.awt.Font("Arial",  Font.BOLD, 12));
    this.answer2.setForeground(Color.BLUE);
    this.answer2.setBackground(Color.CYAN);

    this.answer3 = new JTextField(20);
    this.answer3.setActionCommand("answer3");

    this.answer4 = new JTextField(20);
    this.answer4.setActionCommand("answer4");

    //Initializing Toggle Buttons
    this.correctToggle = new JRadioButton();
    this.correctToggle.setActionCommand("correctToggle");

    this.wrongToggle1 = new JRadioButton();
    this.wrongToggle1.setActionCommand("wrongToggle1");

    this.wrongToggle2 = new JRadioButton();
    this.wrongToggle2.setActionCommand("wrongToggle2");

    this.wrongToggle3 = new JRadioButton();
    this.wrongToggle3.setActionCommand("wrongToggle3");

    //Initializing Submit Button
    this.submitButton = new JButton("Submit");
    this.submitButton.setActionCommand("submitButton");

    submitButton.setFont(submitButton.getFont().deriveFont(Font.BOLD));
    submitButton.setOpaque(true);
    submitButton.setBackground(Color.black);
    submitButton.setForeground(new Color(218, 165, 32));
    submitButton.setBorder(BorderFactory.createBevelBorder(
            BevelBorder.RAISED, new Color(218, 165, 32),
            Color.black,
            new Color(218, 165, 32), Color.BLACK));


    this.finishButton = new JButton("Finish");
    this.finishButton.setActionCommand("finishButton");

    finishButton.setFont(finishButton.getFont().deriveFont(Font.BOLD));
    finishButton.setOpaque(true);
    finishButton.setBackground(Color.black);
    finishButton.setForeground(new Color(218, 165, 32));
    finishButton.setBorder(BorderFactory.createBevelBorder(
            BevelBorder.RAISED, new Color(218, 165, 32),
            Color.black,
            new Color(218, 165, 32), Color.BLACK));



    //Initializing JLabels
    JLabel answerLabel1 = new JLabel("Answer 1");
    JLabel answerLabel2 = new JLabel("Answer 2");
    JLabel answerLabel3 = new JLabel("Answer 3");
    JLabel answerLabel4 = new JLabel("Answer 4");



    buttonGroup = new ButtonGroup();
    buttonGroup.add(correctToggle);
    buttonGroup.add(wrongToggle1);
    buttonGroup.add(wrongToggle2);
    buttonGroup.add(wrongToggle3);







    //------------------------------------
    //------------- QTextArea ------------
    //------------------------------------


    c.gridx = 0;
    c.gridy = 0;


    this.add(qLabel, c);


    c.gridx = 2;
    c.gridwidth = 2;

    this.add(qTextArea, c);
    c.gridwidth = 1;
    //c.gridheight = 1;

    c.insets.set(50,20,50,20);




    //------------------------------------
    //------------- Answer 1 -------------
    //------------------------------------

    c.gridx = 0;
    c.gridy = 2;

    this.add(answerLabel1, c);



    c.gridx = 3;
    c.gridy = 2;

//    c.gridwidth = 3;

    this.add(answer1, c);
//    c.gridwidth = 1;

    c.gridx = 4;
    c.gridy = 2;

    this.add(correctToggle, c);

    //c.insets.set(0,0,0,0);



    //------------------------------------
    //------------- Answer 2 -------------
    //------------------------------------

    c.gridx = 0;
    c.gridy = 3;


    this.add(answerLabel2, c);

    c.gridx = 3;
    c.gridy = 3;

    this.add(answer2, c);

    c.gridx = 4;
    c.gridy = 3;

    this.add(wrongToggle1, c);

    //------------------------------------
    //------------- Answer 3 -------------
    //------------------------------------


    c.gridx = 0;
    c.gridy = 4;

    this.add(answerLabel3, c);

    c.gridx = 3;
    c.gridy = 4;

    this.add(answer3, c);

    c.gridx = 4;
    c.gridy = 4;

    this.add(wrongToggle2, c);

    //------------------------------------
    //------------- Answer 4 -------------
    //------------------------------------

    c.gridx = 0;
    c.gridy = 5;


    this.add(answerLabel4, c);

    c.gridx = 3;
    c.gridy = 5;


    this.add(answer4, c);

    c.gridx = 4;
    c.gridy = 5;

    this.add(wrongToggle3, c);



    //------------------------------------
    //------------- Buttons --------------
    //------------------------------------

    c.gridx = 0;
    c.gridy = 6;

    this.add(submitButton, c);

    c.gridx = 1;
    c.gridy = 6;

    this.add(finishButton, c);

   // this.add(answer);

  }


  /**
   * This method clears the Radio Button Group selection
   */
  public void resetRadio() {

    buttonGroup.clearSelection();

  }


  /**
   * Connects Front-End buttons to Back-End Controller
   * @param listen - ActionListener (Applicable to Buttons)
   */
  public void setActionListener(ActionListener listen) {

    //DocumentListener listenDoc


    //qTextArea.getDocument().addDocumentListener(listenDoc);
    qTextArea.addActionListener(listen);
    answer1.addActionListener(listen);
    answer2.addActionListener(listen);
    answer3.addActionListener(listen);
    answer4.addActionListener(listen);

    correctToggle.addActionListener(listen);
    wrongToggle1.addActionListener(listen);
    wrongToggle2.addActionListener(listen);
    wrongToggle3.addActionListener(listen);

    submitButton.addActionListener(listen);
    finishButton.addActionListener(listen);





  }




  public void setColor(Color color) {

    this.setBackground(color);

  }

  public Quiz getQuiz() {
    return quiz;
  }

  public String getText(String field) {
    switch (field) {
      case "answer1":


        return this.answer1.getText();


      case "answer2":

        return this.answer2.getText();

      case "answer3":
        return this.answer3.getText();

      case "answer4":
        return this.answer4.getText();

      case "question":
        return this.qTextArea.getText();


      default:
        return "um what?";
    }
  }


  //NOT IN USE - DELETE?                                     {
  public JTextField getqTextArea() {
    return qTextArea;
  }

  public JTextField getAnswer1() {
    return answer1;
  }

  public JTextField getAnswer2() {
    return answer2;
  }

  public JTextField getAnswer3() {
    return answer3;
  }

  public JTextField getAnswer4() {
    return answer4;
  }
  ////////////////////////////////////////////////////////// }


  public void resetFields() {
    this.qTextArea.setText("");
    this.answer1.setText("");
    this.answer2.setText("");
    this.answer3.setText("");
    this.answer4.setText("");

  }

//  public void unselectToggles() {
//
//    this.correctToggle.setSelected(false);
//    this.wrongToggle1.setSelected(false);
//    this.wrongToggle2.setSelected(false);
//    this.wrongToggle3.setSelected(false);
//
//  }

}
