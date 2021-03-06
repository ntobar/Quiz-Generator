package Model;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.border.Border;

/**
 * This Class represents a Question on the Quiz
 */
public class Question extends JPanel {
  //Model Components
  private String qstion;
  private ArrayList<String> answers;
  private String correctAnswer;
  //GUI components / View Components
  public JPanel questionNamePanel;
  public JTextField questionPanel;
  public JPanel answersPanel;

  public Question() {
    super();
    this.qstion = "";
    this.answers = new ArrayList<>();
    this.correctAnswer = "";


    //Dimensions and Set Up
    this.setPreferredSize(new Dimension(500, 500));

//    this.setSize(new Dimension(200,200));


    Color MAIA_BG_COLOR = new Color(40, 45, 51);
    Color MAIA_LOGO_COLOR = new Color(144, 195, 240);

    this.setBackground(MAIA_BG_COLOR);


    Border border = BorderFactory.createMatteBorder(6, 3, 6, 6,
            MAIA_LOGO_COLOR);
    this.setBorder(BorderFactory.createTitledBorder(border,
            "Card Factory", 0, 0, Font.getFont(Font.DIALOG),
            MAIA_LOGO_COLOR));

    this.setLayout(new BoxLayout(this, BoxLayout.LINE_AXIS));


    //JPanel Setup
    this.questionNamePanel = new JPanel();
    this.questionPanel = new JTextField();
    this.answersPanel = new JPanel();

    this.add(questionNamePanel);
    this.add(questionPanel);
    this.add(answersPanel);






  }

  public String getQstion() {
    return qstion;
  }

  public void setQstion(String qstion) {
    this.qstion = qstion;
  }

  public ArrayList<String> getAnswers() {
    System.out.println("[Question]: answers.get(0): " + answers.get(0));
    System.out.println("[Question]: answers.get(1): " + answers.get(1));
    System.out.println("[Question]: answers.get(2): " + answers.get(2));
    System.out.println("[Question]: answers.get(3): " + answers.get(3));
    return answers;
  }

  public void setAnswers(ArrayList<String> answers) {
    this.answers = answers;
  }

  public String getCorrectAnswer() {
    return correctAnswer;
  }

  public void setCorrectAnswer(String correctAnswer) {
    this.correctAnswer = correctAnswer;
  }
}
