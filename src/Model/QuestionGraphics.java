package Model;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

import javax.swing.*;
import javax.swing.border.Border;

public class QuestionGraphics extends JPanel {

  private HashMap<Question, String> questions;

  private JLabel questionLabel;

  private JLabel answer1Label;
  private JLabel answer2Label;
  private JLabel answer3Label;
  private JLabel answer4Label;
  private String correctAnswer;
  private JPanel qPanel;
  private JButton nextButton;


  public QuestionGraphics(HashMap<Question, String> questions) {
    super();

    this.correctAnswer = "";


    Color MAIA_BG_COLOR = new Color(40, 45, 51);
    Color MAIA_LOGO_COLOR = new Color(144, 195, 240);

    this.setBackground(new Color(10,100,100));


    Border border = BorderFactory.createMatteBorder(6, 3, 6, 6,
            MAIA_LOGO_COLOR);
    this.setBorder(BorderFactory.createTitledBorder(border,
            "Card Factory", 0, 0, Font.getFont(Font.DIALOG),
            MAIA_LOGO_COLOR));

    Border border1 = BorderFactory.createMatteBorder(1, 2, 1, 2,
            MAIA_LOGO_COLOR);


    qPanel = new JPanel();


//    this.setLayout(new BoxLayout(this,BoxLayout.PAGE_AXIS));
    this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
    this.setAlignmentX(500);

    this.questions = questions;

    this.questionLabel = new JLabel();
    this.questionLabel.setOpaque(true);
    this.questionLabel.setBackground(Color.orange);
    this.questionLabel.setBorder(BorderFactory.createTitledBorder(border1,
            "Question", 0, 0, Font.getFont(Font.DIALOG),
            MAIA_LOGO_COLOR));
    this.questionLabel.setMinimumSize(new Dimension(400, 40));
    this.questionLabel.setPreferredSize(new Dimension(400, 40));
    this.questionLabel.setMaximumSize(new Dimension(400, 40));
    this.questionLabel.add(Box.createVerticalStrut(600));

    this.answer1Label = new JLabel();
    this.answer1Label.setOpaque(true);
    this.answer1Label.setBackground(Color.gray);
    this.answer1Label.add(Box.createHorizontalStrut(30));
    this.answer1Label.setBorder(BorderFactory.createTitledBorder(border1,
            "Answer 1", 0, 0, Font.getFont(Font.DIALOG),
            MAIA_LOGO_COLOR));
    this.answer1Label.setMinimumSize(new Dimension(400, 40));
    this.answer1Label.setPreferredSize(new Dimension(400, 40));
    this.answer1Label.setMaximumSize(new Dimension(400, 40));

    this.answer2Label = new JLabel();
    this.answer2Label.setOpaque(true);
    this.answer2Label.setBackground(Color.gray);
    this.answer2Label.add(Box.createHorizontalStrut(30));
    this.answer2Label.setBorder(BorderFactory.createTitledBorder(border1,
            "Answer 2", 0, 0, Font.getFont(Font.DIALOG),
            MAIA_LOGO_COLOR));
    this.answer2Label.setMinimumSize(new Dimension(400, 40));
    this.answer2Label.setPreferredSize(new Dimension(400, 40));
    this.answer2Label.setMaximumSize(new Dimension(400, 40));


    this.answer3Label = new JLabel();
    this.answer3Label.setOpaque(true);
    this.answer3Label.setBackground(Color.gray);
    this.answer3Label.add(Box.createHorizontalStrut(30));
    this.answer3Label.setBorder(BorderFactory.createTitledBorder(border1,
            "Answer 3", 0, 0, Font.getFont(Font.DIALOG),
            MAIA_LOGO_COLOR));
    this.answer3Label.setMinimumSize(new Dimension(400, 40));
    this.answer3Label.setPreferredSize(new Dimension(400, 40));
    this.answer3Label.setMaximumSize(new Dimension(400, 40));


    this.answer4Label = new JLabel();
    this.answer4Label.setOpaque(true);
    this.answer4Label.setBackground(Color.gray);
    this.answer4Label.add(Box.createHorizontalStrut(30));
    this.answer4Label.setBorder(BorderFactory.createTitledBorder(border1,
            "Answer 4", 0, 0, Font.getFont(Font.DIALOG),
            MAIA_LOGO_COLOR));
    this.answer4Label.setMinimumSize(new Dimension(400, 40));
    this.answer4Label.setPreferredSize(new Dimension(400, 40));
    this.answer4Label.setMaximumSize(new Dimension(400, 40));


    this.nextButton = new JButton("Next");
    this.nextButton.setActionCommand("nextButton");


    this.setVisible(true);




  }

  public void removeQuestion() {

    Set<Question> questionSet = questions.keySet();
    ArrayList<Question> questionList = new ArrayList<>(questionSet);

    //Questions
    Question question1 = questionList.get(0);


    String correctAns = questions.get(question1);

    questions.remove(question1, correctAns);

  }


  public void displayQuestion() {
    Set<Question> questionSet = questions.keySet();
    ArrayList<Question> questionList = new ArrayList<>(questionSet);

    //Questions
    Question question1 = questionList.get(0);


    String correctAns = questions.get(question1);
    System.out.println("[QuestionGraphics]: Correct Answer: " + correctAns);
    this.correctAnswer = correctAns;

    //Answers
    ArrayList<String> answers = question1.getAnswers();

    this.questionLabel.setText(question1.getQstion());
    this.answer1Label.setText(answers.get(0));
    this.answer2Label.setText(answers.get(1));
    this.answer3Label.setText(answers.get(2));
    this.answer4Label.setText(answers.get(3));

    System.out.println("[QuestionGraphics]: ans1: " + answers.get(0));
    System.out.println("[QuestionGraphics]: ans2: " + answers.get(1));
    System.out.println("[QuestionGraphics]: ans3: " + answers.get(2));
    System.out.println("[QuestionGraphics]: ans4: " + answers.get(3));




//    qPanel.add(questionLabel);
//    qPanel.add(answer1Label);
//    qPanel.add(answer2Label);
//    qPanel.add(answer3Label);
//    qPanel.add(answer4Label);
//
//    this.add(qPanel);

    this.add(questionLabel);
    this.add(answer1Label);
    this.add(answer2Label);
    this.add(answer3Label);
    this.add(answer4Label);

    this.add(nextButton);




  }

  public void setActionListener(ActionListener listen) {
    this.nextButton.addActionListener(listen);
  }

  public void setMouseListener(MouseListener mListen) {

    this.answer1Label.addMouseListener(mListen);
    this.answer2Label.addMouseListener(mListen);
    this.answer3Label.addMouseListener(mListen);
    this.answer4Label.addMouseListener(mListen);


  }


  public void displayCorrect() {

    ArrayList<JLabel> labels = new ArrayList<>();
    labels.add(answer1Label);
    labels.add(answer2Label);
    labels.add(answer3Label);
    labels.add(answer4Label);

    for(int i = 0; i < 4; i++) {

      if(labels.get(i).getText().equals(correctAnswer)) {

        labels.get(i).setBackground(Color.GREEN);

      } else {

        labels.get(i).setBackground(Color.RED);

      }




    }



  }


}
