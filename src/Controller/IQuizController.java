package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusListener;
import java.awt.event.MouseListener;

import javax.swing.event.DocumentListener;

public interface IQuizController extends ActionListener, DocumentListener, MouseListener, FocusListener {

  void actionPerformed(ActionEvent e);


}
