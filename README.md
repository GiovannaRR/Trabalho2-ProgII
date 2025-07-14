# 🥟 Máquina de Coxinha

Este é um projeto simples em Java utilizando JavaFX que simula o funcionamento de uma máquina de venda de coxinhas. Ele permite abastecer, vender coxinhas (uma ou várias) e zerar o estoque.

## 📸 Interface

![Máquina de Coxinha](./Captura%20de%20tela%202025-07-12%20231549.png)

## 🚀 Funcionalidades

- ✅ Reabastecer a máquina com coxinhas.
- ✅ Vender uma única unidade.
- ✅ Vender múltiplas unidades de uma só vez.
- ✅ Zerar o estoque da máquina.
- ✅ Exibir o total atual de coxinhas disponíveis.

## 🧠 Lógica Principal

A lógica do sistema está encapsulada na classe `MaquinaCoxinha`, que contém os seguintes métodos:

| Método                         | Descrição                                                    |
|-------------------------------|---------------------------------------------------------------|
| `abastecer(int)`              | Adiciona uma quantidade de coxinhas ao estoque.              |
| `venderCoxinhas()`            | Vende uma unidade de coxinha.                                |
| `venderCoxinhas(int)`         | Vende uma quantidade específica de coxinhas.                 |
| `zerarMaquina()`              | Zera completamente o estoque.                                |
| `getQuantidade()`             | Retorna a quantidade atual de coxinhas.                      |

## 🧩 Estrutura do Projeto

```plaintext
├── src/
│   ├── MaquinaCoxinha.java
│   ├── TelaControlador.java
│   └── main.fxml (interface gráfica - FXML)
