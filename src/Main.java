import com.google.gson.Gson;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        List<Endereco> enderecos = new ArrayList<>();
        ConsultaCEP consultaCEP = new ConsultaCEP();
        CriaArquivoJson criaArquivoJson = new CriaArquivoJson();
        Gson gson = new Gson();
        String busca = "";

        while(!busca.equalsIgnoreCase("sair")){
            System.out.println("Digite o CEP que deseja pesquisar");
            busca = leitura.nextLine();

            if (busca.equalsIgnoreCase("sair")) {
                break;
            }

            Endereco endereco = gson.fromJson(consultaCEP.consulta(busca), Endereco.class);
            enderecos.add(endereco);
        }
        criaArquivoJson.gerarArquivo("consultas.json", enderecos);
    }
}