public class Endereco {
    private String CEP;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String localidade;
    private String uf;
    private String ibge;
    private String gia;
    private String ddd;
    private String siafi;

    public Endereco(EnderecoRecord enderecoRecord) {
        this.CEP = enderecoRecord.cep();
        this.logradouro = enderecoRecord.logradouro();
        this.complemento = enderecoRecord.complemento();
        this.bairro = enderecoRecord.bairro();
        this.localidade = enderecoRecord.localidade();
        this.uf = enderecoRecord.uf();
        this.ibge = enderecoRecord.ibge();
        this.gia = enderecoRecord.gia();
        this.ddd = enderecoRecord.ddd();
        this.siafi = enderecoRecord.siafi();
    }
}
