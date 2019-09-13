package Model;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.DocumentListener;


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




    this.setLayout(new BoxLayout(this,BoxLayout.PAGE_AXIS));


    this.qLabel = new JLabel("Create a Question");
    this.qTextArea =  new JTextField(20);
    this.qTextArea.setActionCommand("question");

    //qTextArea.getDocument().addDocumentListener();

    //Initializing answer Text Fields
    this.answer1 = new JTextField();
    this.answer1.setActionCommand("answer1");
    this.answer1.setToolTipText("<html><b><font color=red>"
            + "Please enter some text here" + "</font></b></html>");
    this.setVisible(true);
    answer1.requestFocusInWindow();

    this.answer2 = new JTextField();
    this.answer2.setActionCommand("answer2");
    this.answer2.setFont(new java.awt.Font("Arial", Font.ITALIC | Font.BOLD, 12));
    this.answer2.setForeground(Color.BLUE);
    this.answer2.setBackground(Color.CYAN);

    this.answer3 = new JTextField();
    this.answer3.setActionCommand("answer3");

    this.answer4 = new JTextField();
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

    this.finishButton = new JButton("Finish");
    this.finishButton.setActionCommand("finishButton");



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
    this.add(finishButton);

   // this.add(answer);

  }



  public void resetRadio() {

    ArrayList<JRadioButton> radioList = new ArrayList<>();
    radioList.add(correctToggle);
    radioList.add(wrongToggle1);
    radioList.add(wrongToggle2);
    radioList.add(wrongToggle3);


    for(int i = 0; i < 4; i++) {


      radioList.get(i).setSelected(false);




    }
  }


  /**
   * Connects Front-End buttons to Back-End Controller
   * @param listen - ActionListener (Applicable to Buttons)
   * @param listenDoc - Document Listener (Applicable to Text Area)
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


  public void resetFields() {
    this.qTextArea.setText("");
    this.answer1.setText("");
    this.answer2.setText("");
    this.answer3.setText("");
    this.answer4.setText("");

  }

}
