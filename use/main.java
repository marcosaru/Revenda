package empresa.use;
import empresa.dominio.Agencia;

import javax.swing.*;
public class main {
    public static void main(String[] args) {
        DbFuncitions db = new DbFuncitions();
        DadosBanco dados = new DadosBanco();

        db.getConnection(dados.getHost(),dados.getUser(), dados.getPassword());
        Agencia ag = new Agencia(1,"Agencia 1");

        Login login = new Login();
        login.setVisible(true);
        login.setContentPane(login.getMainPanel());
        login.setTitle("Sistema de Revenda - Login");
        login.setSize(550, 300);
        try{
            while (!login.isAuth()) {
                Thread.sleep(500);
            }
            if(login.isAuth()){
                login.dispose();
                TabbetPanel main = new TabbetPanel();
                main.setVisible(true);
                main.setContentPane(main.getMainFrame());
                main.setTitle("Sistema de Revenda - Marcos Goncalves Teixeira");
                main.setSize(1200, 800);
                main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
