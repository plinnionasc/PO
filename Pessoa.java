package exemploclassearraylist;

class Publicacao {
    private String textoPublicacao;
    private String linkMidia;
    private String dataPublicacao;
    private static double contadorPublicacao;

    public Publicacao(String texto, String link, String data) {
        this.textoPublicacao = texto;
        this.linkMidia = link;
        this.dataPublicacao = data;
        contadorPublicacao++;
    }

    // Getters e Setters
    public String getTextoPublicacao() {
        return textoPublicacao;
    }

    public void setTextoPublicacao(String textoPublicacao) {
        this.textoPublicacao = textoPublicacao;
    }

    public String getLinkMidia() {
        return linkMidia;
    }

    public void setLinkMidia(String linkMidia) {
        this.linkMidia = linkMidia;
    }

    public String getDataPublicacao() {
        return dataPublicacao;
    }

    public static double getContadorPublicacao() {
        return contadorPublicacao;
    }
}

