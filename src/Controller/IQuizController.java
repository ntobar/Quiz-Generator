package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.event.DocumentListener;

public interface IQuizController extends ActionListener, DocumentListener {

  void actionPerformed(ActionEvent e);


}
