
import java.util.Scanner;

/**/

// Classe adaptada (Adaptee)
class SensorXbox2 {

    // Solicitação Especifica
    public void conectarXbox2() {
        System.out.println("Um novo controle foi conectado ao sensor do Xbox.");
    }
}

// Classe alvo (Target)
class SensorPS5 {

    // Solicitação
    public void conectarPS5() {
        System.out.println("Um novo controle foi conectado ao sensor do PS5.");
    }
}

// Classe adaptador (Adapter)
class AdaptadorPS5ParaXbox2 extends SensorPS5 {

    private SensorXbox2 adaptee;

    public AdaptadorPS5ParaXbox2(SensorXbox2 adaptee) {
        this.adaptee = adaptee;
    }

    // Override da solicitação
    public void conectarPS5() {
        adaptee.conectarXbox2();
        System.out.println("But stadia wins!");
    }
}

// Classe Cliente(Client)
public class ControlePS5 {

    private SensorPS5 sensorAQueSeConecta;

    public void Conectar(SensorPS5 sensor) {
        this.sensorAQueSeConecta = sensor;
        sensorAQueSeConecta.conectarPS5();
    }

    // }
    // public class Teste{
    public static void main(String[] args) {

        // Tem-se um Xbox2 e mas deseja-se usar um controle ps5:
        SensorXbox2 adaptee = new SensorXbox2();
        ControlePS5 target = new ControlePS5();

        // Cria-se um falso sensor de PS5 que, na verdade, traduz e repassa os comandos
        // para o Xbox em questão:
        AdaptadorPS5ParaXbox2 adapter = new AdaptadorPS5ParaXbox2(adaptee);

        // Conecta-se o controle ao adapter:
        target.Conectar(adapter);
    }
}

// Saída:
// Um novo controle foi conectado ao sensor do Xbox.
// But stadia wins!
