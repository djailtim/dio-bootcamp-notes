public class Mensagem {
    public static void obterMensagem(int hora) {
        if (hora > 24) {
            System.out.println("Hora inválida.");
        } else if (hora >= 0 && hora < 12) {
            mensagemBomdia(hora);
        } else if (hora > 12 && hora < 19) {
            mensagemBoatarde(hora);
        } else {
            mensagemBoaNoite(hora);
        }
    }

    public static void mensagemBomdia(int hora) {
        System.out.println("Bom dia, são " + hora + " horas.");
    }

    public static void mensagemBoatarde(int hora) {
        System.out.println("Boa tarde, são " + hora + " horas.");
    }

    public static void mensagemBoaNoite(int hora) {
        System.out.println("Boa noite, são " + hora + " horas.");
    }
}
