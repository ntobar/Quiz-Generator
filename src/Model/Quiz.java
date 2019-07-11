package Model;

import java.awt.*;
import java.util.HashMap;

import javax.swing.*;

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

    this.qp = new QuestionPanel();
    basePanel.add(qp);


    this.pack();
    this.setVisible(true);
  }




  public static void main(String args[]) {

    Quiz q = new Quiz();


  }





}
