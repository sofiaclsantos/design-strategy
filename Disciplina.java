package dpStrategy;

public class Disciplina {
    private ICalcMedia calcMedia;
    private double p1;
    private double p2;
    private double media;
    private String nome;
    private String situacao;

    public ICalcMedia getCalcMedia() {
        return calcMedia;
    }

    public void setCalcMedia(ICalcMedia calcMedia) {
        this.calcMedia = calcMedia;
    }

    public double getP1() {
        return p1;
    }

    public void setP1(double p1) {
        this.p1 = p1;
    }

    public double getP2() {
        return p2;
    }

    public void setP2(double p2) {
        this.p2 = p2;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public void CalcularMedia() {
        media = calcMedia.CalculaMedia(p1, p2);
        situacao = calcMedia.Situacao(media);
    }

    public Disciplina(ICalcMedia calcMedia) {
        this.calcMedia = calcMedia;
    }
}


