
package reproductor.jmf;



public class ReproductorJMF {

    public static void main(String[] args) {
        Interfaz ver = new Interfaz();
        ver.setVisible(true);
        try{
            Thread.sleep(16000);
            ver.setVisible(false);
            System.out.println("FINISHHHH");
        }
        catch(InterruptedException e){}
            System.out.println("que transcurran 2 segundos ok");
        }
}
