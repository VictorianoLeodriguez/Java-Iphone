// Arquivo: iPhone.java

// Classe ReprodutorMusical
class ReprodutorMusical {

    public void tocarMusica() {
        System.out.println("Tocando música...");
    }

    public void pausarMusica() {
        System.out.println("Música pausada.");
    }

    public void procurarMusica(String texto) {
        System.out.println("Procurando música com texto: " + texto);
    }

    public void selecionarMusica() {
        System.out.println("Música selecionada.");
    }
}

// Classe AparelhoTelefonico
class AparelhoTelefonico {

    public void ligar(String numero) {
        System.out.println("Ligando para " + numero + "...");
    }

    public void atender() {
        System.out.println("Atendendo a chamada.");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz.");
    }

    public void mandarMensagem() {
        System.out.println("Enviando mensagem...");
    }

    public void abrirAplicativo() {
        System.out.println("Abrindo aplicativo...");
    }
}

// Classe NavegadorInternet
class NavegadorInternet {

    public void abrirPagina(String url) {
        System.out.println("Abrindo página: " + url);
    }

    public void novaPagina(String url) {
        System.out.println("Abrindo nova página: " + url);
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página.");
    }

    public void baixarApp() {
        System.out.println("Baixando aplicativo...");
    }
}

// Classe pública iPhone que possui associações com as outras classes
public class iPhone {
    private ReprodutorMusical reprodutorMusical;
    private AparelhoTelefonico aparelhoTelefonico;
    private NavegadorInternet navegadorInternet;

    public iPhone() {
        reprodutorMusical = new ReprodutorMusical();
        aparelhoTelefonico = new AparelhoTelefonico();
        navegadorInternet = new NavegadorInternet();
    }

    public ReprodutorMusical getReprodutorMusical() {
        return reprodutorMusical;
    }

    public AparelhoTelefonico getAparelhoTelefonico() {
        return aparelhoTelefonico;
    }

    public NavegadorInternet getNavegadorInternet() {
        return navegadorInternet;
    }

    // Método principal para teste
    public static void main(String[] args) {
        iPhone meuIphone = new iPhone();
        
        // Testando o ReprodutorMusical
        meuIphone.getReprodutorMusical().tocarMusica();
        meuIphone.getReprodutorMusical().pausarMusica();
        
        // Testando o AparelhoTelefonico
        meuIphone.getAparelhoTelefonico().ligar("123456789");
        meuIphone.getAparelhoTelefonico().atender();
        
        // Testando o NavegadorInternet
        meuIphone.getNavegadorInternet().abrirPagina("www.exemplo.com");
        meuIphone.getNavegadorInternet().atualizarPagina();
    }
}
