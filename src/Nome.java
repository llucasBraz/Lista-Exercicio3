package listas.lista01;

public class Nome {
    private String titulo;
    private String nomePrincipal;
    private String nomeDoMeio;
    private String ultimoNome;

    public Nome(String titulo, String nomePrincipal, String nomeDoMeio, String ultimoNome) {
        this.titulo = titulo;
        this.nomePrincipal = nomePrincipal;
        this.nomeDoMeio = nomeDoMeio;
        this.ultimoNome = ultimoNome;
    }

    public String getNomeCompleto() {
        StringBuilder nomeCompleto = new StringBuilder();
        if (titulo != null) {
            nomeCompleto.append(titulo).append(" ");
        }
        nomeCompleto.append(nomePrincipal).append(" ");
        if (nomeDoMeio != null) {
            nomeCompleto.append(nomeDoMeio).append(" ");
        }
        nomeCompleto.append(ultimoNome);
        return nomeCompleto.toString().trim();
    }
}
