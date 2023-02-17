package service;

import entity.Cafeteria;


public interface CafeteriaService {

    void abrir (Cafeteria cafeteria);
    void fechar(Cafeteria cafeteria);
    String[] anotarPedido(Cafeteria cafeteria, String pedido);
    void servir(Cafeteria cafeteria, String[] listaItens);
    void limpar(Cafeteria cafeteria);
    void cobrar(Cafeteria cafeteria, String[] listaItens) throws Exception;

}
