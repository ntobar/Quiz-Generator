package Model;

import java.awt.*;
import java.util.HashMap;

import javax.swing.*;

import Controller.IQuizController;
import Controller.QuizController;

public class Quiz extends JFrame {
  //Quiz Components
  private HashMap<Question, String> questions;
  private QuestionPanel qp;
  private JPanel basePanel;

  //GUI Components
  Question questionPanel;


  public Quiz() {
    super();


    this.setTitle("- Quiz Generator -");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    this.setPreferredSize(new Dimension(1000, 1000));


    this.basePanel = new JPanel();
    this.add(basePanel);


    this.questions = new HashMap<>();
    //this.questionPanel = new Question();

    //this.add(questionPanel);

    this.qp = new QuestionPanel(this);
    basePanel.add(qp);


    this.pack();
    this.setVisible(true);
  }


  public HashMap<Question, String> getQuestions() {
    return questions;
  }




  public void displayQuestion() {

    JPanel displayPanel = new JPanel();




    this.remove(basePanel);


  }

  public static void main(String args[]) {



    Quiz q = new Quiz();
    IQuizController quizController = new QuizController(q.qp);


  }








}
