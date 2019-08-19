package Model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

import javax.swing.*;

public class QuestionGraphics extends JPanel {

  private HashMap<Question, String> questions;

  private JLabel questionLabel;

  private JLabel answer1Label;
  private JLabel answer2Label;
  private JLabel answer3Label;
  private JLabel answer4Label;


  public QuestionGraphics(HashMap<Question, String> questions) {
    super();

    this.questions = questions;

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
    Set<Question> questionSet = questions.keySet();
    ArrayList<Question> questionList = new ArrayList<>(questionSet);

    //Questions
    Question question1 = questionList.get(0);

    //Answers
    ArrayList<String> answers = question1.getAnswers();

    this.questionLabel.setText(question1.getQstion());
    this.answer1Label.setText(answers.get(0));
    this.answer2Label.setText(answers.get(1));
    this.answer3Label.setText(answers.get(2));
    this.answer4Label.setText(answers.get(3));








  }


}
