package edu.itszapopan.jmessenger;

import java.awt.event.*;

public class MisAcciones implements ActionListener {

  private PanelContactos pnlCont;
  private VentanaPrincipal venPrin;

  public void actionPerformed(ActionEvent e) {
    String accion =e.getActionCommand(); 

    if (accion.equals("Nuevo Contacto")) {
      System.out.println("Agregar nuevo contacto");
      venPrin.showAddUser();
      //pnlCont.addContact("Yo", "img/brown_woman.png");
    }

    if (accion.equals("Sarlir")) {
      System.out.println("Adios");
    }
  }

  public void setPanelContactos(PanelContactos pnl) {
    pnlCont = pnl;
  }

  public void setVentanaPrincipal(VentanaPrincipal vnp) {
    venPrin = vnp;
  }


}

