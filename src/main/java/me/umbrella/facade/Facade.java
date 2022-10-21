package me.umbrella.facade;

import me.umbrella.facade.subsistemacep.CepApi;
import me.umbrella.facade.subsistemacrm.CrmService;

public class Facade {

    public void migrarCliente(String nome, String cep) {
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}
