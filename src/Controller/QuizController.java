package Controller;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.plaf.ColorUIResource;

import Model.Question;
import Model.QuestionGraphics;
import Model.QuestionPanel;


/**
 * This Class is the Controller in the MVC architecture for the Quiz.
 */
public class QuizController implements IQuizController {
  private QuestionPanel model;
  private QuestionGraphics questionModel;
  private String question;
  private ArrayList<String> answers;
  private String correctAnswer;
  private String transferableAns;
  private String answer1;
  private String answer2;
  private String answer3;
  private String answer4;


  public QuizController(QuestionPanel model, QuestionGraphics questionModel) {
    this.model = model;
    this.questionModel = questionModel;
    model.setActionListener(this);
    questionModel.setMouseListener(this);
    questionModel.setActionListener(this);


    //Initializing Fields
    this.question = "";
    this.answers = new ArrayList<>();
    this.correctAnswer = "";
    this.answer1 = "";
    this.answer2 = "";
    this.answer3 = "";
    this.answer4 = "";
    this.transferableAns = "";



  }


  /**
   * This method retrieves the texts from the Question and Answer Fields
   * to be able to store the Question with its answers.
   */
  private void setTexts() {

    String q1 = this.model.getText("question");
    this.question = q1;

    //Recording Answer 1 JTextArea Text
    String answer00 = this.model.getText("answer1");
    this.answer1 = answer00;

    //Recording Answer 2 JTextArea Text
    String answer01 = this.model.getText("answer2");
    this.answer2 = answer01;

    //Recording Answer 3 JTextArea Text
    String answer02 = this.model.getText("answer3");
    this.answer3 = answer02;

    //Recording Answer 4 JTextArea Text
    String answer03 = this.model.getText("answer4");
    this.answer4 = answer03;

  }




  @Override
  public void actionPerformed(ActionEvent e) {

    if (e.getActionCommand().equals("nextButton")) {

      System.out.println("[QuizController]: nextButton pressed");

      this.model.getQuiz().removeQuestion();
      this.model.getQuiz().displayQuestion();


    }

    if (e.getActionCommand().equals("submitButton")) {

      System.out.println("[QuizController]: submitButton pressed");


      //Recording Question JTextArea Text
//      String q1 = this.model.getText("question");
//      this.question = q1;
//
//      //Recording Answer 1 JTextArea Text
//      String answer00 = this.model.getText("answer1");
//      this.answer1 = answer00;
//
//      //Recording Answer 2 JTextArea Text
//      String answer01 = this.model.getText("answer2");
//      this.answer2 = answer01;
//
//      //Recording Answer 3 JTextArea Text
//      String answer02 = this.model.getText("answer3");
//      this.answer3 = answer02;
//
//      //Recording Answer 4 JTextArea Text
//      String answer03 = this.model.getText("answer4");
//      this.answer4 = answer03;




      ArrayList<String> answers = new ArrayList<>();

//      answers.add(correctAnswer);
      answers.add(answer1);
      answers.add(answer2);
      answers.add(answer3);
      answers.add(answer4);
      answers.add(correctAnswer);

      Question q = new Question();
      q.setQstion(question);
      q.setAnswers(answers);


      this.model.getQuiz().getQuestions().put(q, correctAnswer);

      model.setColor(Color.GRAY);

      System.out.println("Question: " + question + "\n" +
              "Answer 1: " + answer1 + "\n" +
              "Answer 2: " + answer2 + "\n" +
              "Answer 3: " + answer3 + "\n" +
              "Answer 4: " + answer4 + "\n" +
              "Correct Answer: " + correctAnswer);


      //This resets fields
      this.model.resetFields();
      this.model.resetRadio();
      System.out.println("[QuizController]: Toggles Reset");

    }


    if (e.getActionCommand().equals("finishButton")) {

      System.out.println("[QuizController]: Finish Button Pressed");

      if(this.model.getQuiz().getQuestions().isEmpty()) {

        UIManager uI = new UIManager();
        uI.put("OptionPane.background", new ColorUIResource(218, 165, 32));
        uI.put("Panel.background", new ColorUIResource(218, 165, 32));


        JOptionPane.showMessageDialog(this.questionModel, "No questions have been added yet");


      }

      this.model.getQuiz().displayQuestion();
      //this.model.getQuiz().removeQuestion();



    }


//    if (e.getActionCommand().equals("question")) {
//
//      System.out.println("[QuizController]: Question Submitted");
//
//
//      String q = this.model.getText("question");
//      this.question = q;
//
//    }
//
//    if (e.getActionCommand().equals("answer1")) {
//
//      System.out.println("[QuizController]: Answer 1 Submitted");
//
//      String answer = this.model.getText("answer1");
//      this.answer1 = answer;
//
//
//
//    }
//
//    if (e.getActionCommand().equals("answer2")) {
//
//      System.out.println("[QuizController]: Answer 2 Submitted");
//
//      String answer = this.model.getText("answer2");
//      this.answer2 = answer;
//
//    }
//
//    if (e.getActionCommand().equals("answer3")) {
//
//      System.out.println("[QuizController]: Answer 3 Submitted");
//
//      String answer = this.model.getText("answer3");
//      this.answer3 = answer;
//
//
//    }
//
//    if (e.getActionCommand().equals("answer4")) {
//
//      System.out.println("[QuizController]: Answer 4 Submitted");
//
//      String answer = this.model.getText("answer4");
//      this.answer4 = answer;
//
//
//    }

    if (e.getActionCommand().equals("correctToggle")) {

      System.out.println("[QuizController]: first toggle");

      if(((JRadioButton) e.getSource()).isSelected()) {

        this.setTexts();

        this.correctAnswer = answer1;
        //this.transferableAns = answer1;

      }


    }

    if (e.getActionCommand().equals("wrongToggle1")) {

      System.out.println("[QuizController]: second toggle");

      if(((JRadioButton) e.getSource()).isSelected()) {

        this.setTexts();
        this.correctAnswer = answer2;
       // this.transferableAns = answer2;

      }


    }

    if (e.getActionCommand().equals("wrongToggle2")) {

      System.out.println("[QuizController]: third toggle");

      if(((JRadioButton) e.getSource()).isSelected()) {

        this.setTexts();
        this.correctAnswer = answer3;
        //this.transferableAns = answer3;

      }

    }

    if (e.getActionCommand().equals("wrongToggle3")) {

      System.out.println("[QuizController]: fourth toggle");

      if(((JRadioButton) e.getSource()).isSelected()) {

        this.setTexts();
        this.correctAnswer = answer4;
        //this.transferableAns = answer4;

      }

    }



  }



  @Override
  public void focusGained(FocusEvent e) {

  }

  @Override
  public void focusLost(FocusEvent e) {
    JTextField a = (JTextField)e.getSource();



//    (JTextField)e.getID();
//
//
//    if ((JTextField)e.equals("question")) {
//
//      System.out.println("[QuizController]: Question Submitted");
//
//      String q = this.model.getText("question");
//      this.question = q;
//
//    }
//
//    if (e.getActionCommand().equals("answer1")) {
//
//      System.out.println("[QuizController]: Answer 1 Submitted");
//
//      String answer = this.model.getText("answer1");
//      this.answer1 = answer;
//
//
//
//    }
//
//    if (e.getActionCommand().equals("answer2")) {
//
//      System.out.println("[QuizController]: Answer 2 Submitted");
//
//      String answer = this.model.getText("answer2");
//      this.answer2 = answer;
//
//    }
//
//    if (e.getActionCommand().equals("answer3")) {
//
//      System.out.println("[QuizController]: Answer 3 Submitted");
//
//      String answer = this.model.getText("answer3");
//      this.answer3 = answer;
//
//
//    }
//
//    if (e.getActionCommand().equals("answer4")) {
//
//      System.out.println("[QuizController]: Answer 4 Submitted");
//
//      String answer = this.model.getText("answer4");
//      this.answer4 = answer;
//
//
//    }

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

  @Override
  public void mouseClicked(MouseEvent e) {

  }

  @Override
  public void mousePressed(MouseEvent e) {

  }

  @Override
  public void mouseReleased(MouseEvent e) {

    this.questionModel.displayCorrect((JLabel) e.getSource());




  }

  @Override
  public void mouseEntered(MouseEvent e) {

  }

  @Override
  public void mouseExited(MouseEvent e) {

  }


}
