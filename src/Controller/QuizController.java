package Controller;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import Model.Question;
import Model.QuestionPanel;

public class QuizController implements IQuizController {
  private QuestionPanel model;
  private String question;
  private ArrayList<String> answers;
  private String correctAnswer;
  private String answer1;
  private String answer2;
  private String answer3;
  private String answer4;


  public QuizController(QuestionPanel model) {
    this.model = model;
    model.setActionListener(this);

    this.question = "";
    this.answers = new ArrayList<>();
    this.correctAnswer = "";
    this.answer1 = "";
    this.answer2 = "";
    this.answer3 = "";
    this.answer4 = "";



  }




  @Override
  public void actionPerformed(ActionEvent e) {

    if (e.getActionCommand().equals("submitButton")) {

      System.out.println("[QuizController]: submitButton pressed");

      ArrayList<String> answers = new ArrayList<>();

      answers.add(correctAnswer);
      answers.add(answer1);
      answers.add(answer2);
      answers.add(answer3);

      Question q = new Question();
      q.setQstion(question);
      q.setAnswers(answers);


      this.model.getQuiz().getQuestions().put(q, correctAnswer);

      model.setColor(Color.MAGENTA);

    }

    if (e.getActionCommand().equals("answer1")) {

      System.out.println("[QuizController]: Answer 1 Submitted");

      String answer = this.model.getText("answer1");
      this.answer1 = answer;



    }

    if (e.getActionCommand().equals("answer2")) {

      System.out.println("[QuizController]: submitButton pressed");

      String answer = this.model.getText("answer2");
      this.answer2 = answer;

    }

    if (e.getActionCommand().equals("answer3")) {

      System.out.println("[QuizController]: submitButton pressed");

      String answer = this.model.getText("answer3");
      this.answer3 = answer;


    }

    if (e.getActionCommand().equals("answer4")) {

      System.out.println("[QuizController]: submitButton pressed");

      String answer = this.model.getText("answer4");
      this.answer4 = answer;


    }

    if (e.getActionCommand().equals("correctToggle")) {

      System.out.println("[QuizController]: submitButton pressed");

      if(((JButton) e.getSource()).isSelected()) {

        this.correctAnswer = answer1;

      }


    }

    if (e.getActionCommand().equals("wrongToggle1")) {

      System.out.println("[QuizController]: submitButton pressed");

      if(((JButton) e.getSource()).isSelected()) {

        this.correctAnswer = answer2;

      }


    }

    if (e.getActionCommand().equals("wrongToggle2")) {

      System.out.println("[QuizController]: submitButton pressed");

      if(((JButton) e.getSource()).isSelected()) {

        this.correctAnswer = answer3;

      }

    }

    if (e.getActionCommand().equals("wrongToggle3")) {

      System.out.println("[QuizController]: submitButton pressed");

      if(((JButton) e.getSource()).isSelected()) {

        this.correctAnswer = answer4;

      }

    }



  }

  @Override
  public void insertUpdate(DocumentEvent e) {

  }

  @Override
  public void removeUpdate(DocumentEvent e) {

  }

  @Override
  public void changedUpdate(DocumentEvent e) {

  }
}
