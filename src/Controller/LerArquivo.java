package Controller;

import java.io.*;

public class LerArquivo {

    public LerArquivo(){
        super();
    }

    public void readFile(String path, String name) throws IOException {
        File arq= new File(path, name);
        if (arq.exists() && arq.isFile()){
            FileInputStream fluxo= new FileInputStream(arq);
            InputStreamReader leitor= new InputStreamReader(fluxo);
            BufferedReader buffer= new BufferedReader(leitor);
            String linha= buffer.readLine();
            String[] vet= linha.split(";");
            System.out.println(vet[0] +"\t\t\t"+ vet[1] +"\t\t\t"+ vet[2] +"\t\t\t"+ vet[3]);
            linha= buffer.readLine();
            while (linha != null){ //procurando End of File
                if (linha.contains("Fruits")){
                    vet= linha.split(";");
                    System.out.println(vet[0] +"\t\t\t"+ vet[1] +"\t\t\t"+ vet[2] +"\t\t\t"+ vet[3]);
                }
                linha= buffer.readLine();
            }
            buffer.close();
            leitor.close();
            fluxo.close();
        }
        else {
            throw new IOException("Arquivo Inválido");
        }
    }
}
