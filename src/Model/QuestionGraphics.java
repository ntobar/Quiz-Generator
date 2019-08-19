package Model;

import java.util.HashMap;

import javax.swing.*;

public class QuestionGraphics extends JPanel {
  private Quiz quiz;

  private HashMap<Question, String> questions;

  private JLabel questionLabel;

  private JLabel answer1Label;
  private JLabel answer2Label;
  private JLabel answer3Label;
  private JLabel answer4Label;


  public QuestionGraphics(Quiz quiz) {
    super();

    this.questions = quiz.getQuestions();

    this.questionLabel = new JLabel();
    this.answer1Label = new JLabel();
    this.answer2Label = new JLabel();
    this.answer3Label = new JLabel();
    this.answer4Label = new JLabel();

    this.add(questionLabel);
    this.add(answer1Label);
    this.add(answer2Label);
    this.add(answer3Label);
    this.add(answer4Label);


  }

  public void displayQuestion() {





  }


}
