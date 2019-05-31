package Model;

import java.util.ArrayList;

import javax.swing.*;

/**
 * This Class represents a Question on the Quizz
 */
public class Question extends JPanel {
  //Model Components
  private String qstion;
  private ArrayList<String> answers;
  private int correctAnswer;
  //GUI components
  public JPanel questionNamePanel;
  public JPanel questionPanel;
  public JPanel answersPanel;

  public Question() {
    this.qstion = "";
    this.answers = new ArrayList<>();
    this.correctAnswer = 0;


    this.questionNamePanel = new JPanel();
    this.questionPanel = new JPanel();
    this.answersPanel = new JPanel();


  }





}
