package Controller;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import Model.QuestionPanel;

public class QuizController implements IQuizController {
  private QuestionPanel model;


  public QuizController(QuestionPanel model) {
    this.model = model;
    model.setActionListener(this, new DocumentListener() {
      @Override
      public void insertUpdate(DocumentEvent e) {

      }

      @Override
      public void removeUpdate(DocumentEvent e) {

      }

      @Override
      public void changedUpdate(DocumentEvent e) {

      }
    });



  }




  @Override
  public void actionPerformed(ActionEvent e) {

    if (e.getActionCommand().equals("submitButton")) {

      System.out.println("submitButton pressed");

      model.setColor(Color.MAGENTA);




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
