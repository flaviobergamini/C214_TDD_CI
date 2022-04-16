package br.inatel.c14;
import com.google.gson.JsonObject;
import  com.google.gson.JsonParser;

public class BuscaInimigo {
    InimigoService inimigoService;

    public BuscaInimigo(InimigoService service){
        this.inimigoService = service;
    }

    public Inimigo buscaInimigo(int id){
        String inimigoJeson = inimigoService.busca(id);

        JsonObject jsonObject = JsonParser.parseString(inimigoJeson).getAsJsonObject();

        return new Inimigo(jsonObject.get("nome").getAsString(),
                jsonObject.get("qtdvida").getAsDouble(),
                jsonObject.get("arma").getAsString());
    }
}
