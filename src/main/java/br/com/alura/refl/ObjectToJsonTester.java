package br.com.alura.refl;

import br.com.alura.Pessoa;

public class ObjectToJsonTester {

    public static void main(String... x) {
        Pessoa pessoa = new Pessoa(1, "joao", "1233122331222");
        ObjectToJson objectToJson = new ObjectToJson();
        String json = objectToJson.transform(pessoa);
        System.out.println(json);
    }
}
