package service;

import entity.Cafeteria;

public class CafeteriaServiceImpl implements CafeteriaService {
    @Override
    public void abrir(Cafeteria cafeteria) {
        cafeteria.setAberto(true);
    }

    @Override
    public void fechar(Cafeteria cafeteria) {
        cafeteria.setAberto(false);
    }

    @Override
    public String[] anotarPedido(Cafeteria cafeteria, String pedido) {
        String listaItens[] = pedido.split(",");
        for (int i = 0; i < listaItens.length; i++) {
            System.out.println(listaItens[i]);
        }
        return listaItens;
    }

    @Override
    public void servir(Cafeteria cafeteria, String[] listaItens) {
        System.out.println(listaItens);
        System.out.println("Pedido servido");
    }

    @Override
    public void limpar(Cafeteria cafeteria) {
        System.out.println("Mesa Limpa");
    }

    @Override
    public void cobrar(Cafeteria cafeteria, String[] listaItens) throws Exception {

    }
}
